package Day_2;
public class buyAndSellStock {
    public static int buyAndSellStock(int price[]){
            int buyPrice=Integer.MAX_VALUE;
            int maxProfit=0;

            for(int i=0;i<price.length;i++){
                if(buyPrice<price[i]){
                    int profit=price[i]-buyPrice;
                    maxProfit=Math.max(maxProfit,profit);
                }else{
                    buyPrice=price[i];
                }
            }
            return maxProfit;
    }
    public static void main(String[] args) {
        int price[]={2,3,1,4,2,5,7};
        System.out.println(buyAndSellStock(price));
    }
}
