public class StockBuySell {
    public static void BuySell(int arr[]){
        int n=arr.length;
        int buyprice=Integer.MAX_VALUE;
        int maxprofit=0;

    
        for(int i=0;i<n;i++)
        {
          if(buyprice<arr[i])
          {
            int profit=arr[i]-buyprice;
            maxprofit=Math.max(maxprofit, profit);

          } 
          else 
            buyprice=arr[i];
        }
System.out.println("maximum profit "+maxprofit);
    } 
    public static void main(String[] args) {
        int arr[]={7,1,5,3,6,4};
        BuySell(arr);
    }
}
