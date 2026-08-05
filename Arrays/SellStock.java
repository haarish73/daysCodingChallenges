package Arrays;

public class SellStock {
    static int bestTimeToBuy(int[] price, int n){
        int minPrice = price[0];
        int maxProfit = 0;
        for(int i=1;i<n;i++){
            if(price[i] < minPrice){
                minPrice = price[i];
            }

            int profit = price[i] - minPrice;
            maxProfit = Math.max(profit, maxProfit);
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int[] price = {7,1,5,3,6,4};
        int n = price.length;
        int res = bestTimeToBuy(price, n);
        System.err.println(res);
        
    }
}
