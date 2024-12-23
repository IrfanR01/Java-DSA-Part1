public class KadanesMethForMaxSubArray {
    
    public static void kadanesMeth(int arr[])
    {
        int cursum=0;
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            cursum+=arr[i];
            if(cursum<0)
            {
                cursum=0;

            }
            maxsum=Math.max(maxsum,cursum)

            /*if(cursum>maxsum)
              {
                    maxsum=cursum;
             }*/
                
            
        }
        System.out.println("Maximum of Subarray is :"+maxsum);
    }
    public static void main(String[] args) {
        int arr[]={-2,-3,4,-1,-2,1,5,-3};
        kadanesMeth(arr);
    }
}
