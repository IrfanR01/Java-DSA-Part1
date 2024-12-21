public class MaxOfSubArray_meth2 {
    
   
   

    public static void max2(int arr[])
    {
        int count=0;
       int max= Integer.MIN_VALUE;
       int cursum=0;
       int prefix[]=new int[arr.length];
       prefix[0]=arr[0];
        for(int i=1;i<arr.length;i++)
        {
        prefix[i]=prefix[i-1]+arr[i];
        }
       for(int i=0;i<arr.length;i++)
{
             int start=i;
           
            for(int j=i;j<arr.length;j++)
            {
                int end=j;
            cursum= start==0?prefix[end]:prefix[end]-prefix[start-1];
               

                    System.out.print(cursum + " ");
                    if(max<cursum){

                        max=cursum;}
                    
            }
          
            }
            System.out.println();
            System.out.println("max sub array sum is "+max);
        }
 
          
    
        
        
      
    public static void main(String[] args) {
        int arr[]={1,-2,6,-1,3};
        max2(arr);

    }
}
        

    



