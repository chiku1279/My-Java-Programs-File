public class BuySellStocks {
    public static int SellBuyStocks(int price[]){
        int buyPrice=Integer.MAX_VALUE;         //buy price must be smaller then today's prices to sell the stock
        int maxProfit=0;
        for(int i=0;i<price.length;i++){
            if(buyPrice<price[i]){          //price[i]= today's/sell price
                int profit=price[i]-buyPrice;       //profit=SP-BP
                maxProfit=Math.max(maxProfit,profit);       
            }
            else{
                buyPrice=price[i];      // if Sp<Bp so we have to but this stock to sell in future
            }
        }
        return maxProfit;
    }
    public static void main(String args[]){
        int price[]={7,1,5,3,6,4};
        System.out.println(SellBuyStocks(price));
    }
    
}
