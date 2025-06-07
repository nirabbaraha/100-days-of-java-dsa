package Day_4;
public class assignment3 {
    public static void buyandSellStock(int price[]){
        int buyPrice=price[0];
        int maxProfit=0;
        for(int i=1;i<price.length;i++){
            if(buyPrice<price[i]){
                maxProfit=Math.max(maxProfit,price[i]-buyPrice);
            }
            else{
                buyPrice=price[i];
            }
        }
        System.out.println("The MaxProfit is :"+ maxProfit);
    }
    public static void main(String[] args) {
        int prices[] = {7, 1, 5, 3, 6, 4};
        buyandSellStock(prices);
    }
}
