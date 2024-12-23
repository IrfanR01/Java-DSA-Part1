public class RainWaterTrapped {
    
    public static void totalwater(int arr[])
    {
        int sum=0;
    
            int n=arr.length;
                int left[]=new int[arr.length];
                int right[]=new int [arr.length];



                left[0]=arr[0];
            for(int p=1;p<arr.length;p++)
            {
                left[p]=Math.max(left[p-1], arr[p]);
            }


            right[arr.length-1]=arr[arr.length-1];
            for(int j=arr.length-2;j>=0;j--)
            {
                right[j]=Math.max(right[j+1],arr[j]);
            }


            for(int k=0;k<arr.length;k++)
            {
                 sum+=(Math.min(right[k],left[k]))-arr[k];
            }
            System.out.println("Trapped Water is "+sum);
           
             
            
        }
        
    
    public static void main(String[] args) {
        int arr[]={4,2,0,6,3,2,5};
        totalwater(arr);
    }
}
