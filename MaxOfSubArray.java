import java.util.*;
public class MaxOfSubArray {
   

    public static void max(int arr[])
    {
        int count=0;
       int max= Integer.MIN_VALUE;
       int cursum=0;
        
       for(int i=0;i<arr.length;i++)
        {
             int start=i;
           
            for(int j=i;j<arr.length;j++)
            {
                int end=j;
                cursum =0;
                for(int k=start;k<=end;k++)
                {
                    cursum +=arr[k];
                   
                    }

                    System.out.print(cursum + " ");
                    if(max<cursum){

                        max=cursum;}
                    
            }
          
            }
            System.out.println();
            System.out.println("max sub array sum is "+max);
            
          
        }
        
        
      
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10};
        max(arr);

    }
}
        

    

