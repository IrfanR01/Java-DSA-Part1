import java.util.*;
public class SubArray{
    public static void  SubArr(int arr[])
    {
        int count=0;
       
       for(int i=0;i<arr.length;i++)
        {
             int start=i;
         
            for(int j=i;j<arr.length;j++)
            {
                int end=j;
                for(int k=start;k<=end;k++){
                System.out.print(arr[k]);

            count++;}
            System.out.println();
            }
            
        }
        
        System.out.println("total no of sub array is "+count);
    }   
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10};
        SubArr(arr);

    }
}