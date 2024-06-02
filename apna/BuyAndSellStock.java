package apna;

public class BuyAndSellStock {
    public static void stockByMe(int arr[]) {
        int max = 0 ;
        for(int i=1 ; i<arr.length ; i++) {
            int buyingPrice = Integer.MAX_VALUE;
            for(int j=0 ; j<i ; j++) {
                buyingPrice = Math.min(arr[j], buyingPrice);
            }
            int sellingPrice = arr[i];
            int profit = sellingPrice - buyingPrice ;
            max = Math.max(max, profit) ;
            System.out.println(profit);
        }
        System.out.print("Profit Max : "+max);
    }

    public static int stockByMam(int prices[]) {
        int buyPrice = Integer.MAX_VALUE ;
        int maxProfit = 0;

        for(int i=0 ; i<prices.length ; i++) {
            if(buyPrice < prices[i]) {   //profit
                int profit = prices[i] - buyPrice ;   //today's profit
                maxProfit = Math.max(maxProfit,profit) ;
            } else {
                buyPrice = prices[i];
            }
        }
        return maxProfit ; 
    }
    public static void main(Strings args[]) {
        int num[] = {7,1,5,3,6,4};
        //stock(num);
        
        System.out.println("Max Profit : "+stockByMam(num));
    }
}
