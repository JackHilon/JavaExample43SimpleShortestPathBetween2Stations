
package javaexample43simpleshortestpathbetween2stations;


public class JavaExample43SimpleShortestPathBetween2Stations {

    
    public static void main(String[] args) {
        
        //destinations between start-station and middle-stations
        int[] desSS2MS=new int[] {4,8,2,14,3};
        
        //destinations between middle-stations and end-station
        int[] desMS2ES=new int[] {12,40,1,8,5};
        
        //destinations between start-stations and end-station though each middle-station
        int[] desSS2ES = add(desSS2MS, desMS2ES);
    
        // best-middle-station-INFO (or shortest path INFO)
        int[] bestStation=MinINFO(desSS2ES);
        
        System.out.println("The best middle-station number is: "+(bestStation[0]+1));
        System.out.println("The whole path length is: "+bestStation[1]);
    
    }
    private static int[] add(int[] a, int[] b)
    {
        int[] res=new int[a.length];
        try{
            if(a==null || b==null)
                throw new NullPointerException("There is no array.");
            if(a.length!=b.length)
                throw new ArrayIndexOutOfBoundsException("Two arrays lengths are not equal.");
            for (int i = 0; i < a.length; i++) {
                res[i]=a[i]+b[i];
            }
            return res;
        }catch(Exception e)
        {
            System.out.println(e.toString());
            return res;
        }
    }
    private static int[] MinINFO(int[] a)
    {
        int[] info=new int[2];
        // info[0] Min-index
        // info[1] Min-value
        try{
            if(a==null)
                throw new NullPointerException();
            
            info[0]=0;
            info[1]=a[0];
            for (int i = 1; i < a.length; i++) {
                if(info[1]>a[i])
                {
                    info[0]=i;
                    info[1]=a[i];
                }
            }// end for
            return info;
        }// end try
        catch(Exception e)
        {
            System.out.println(e.toString());
            return info;
        }
    }
    
}
