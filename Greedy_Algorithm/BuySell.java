package Greedy_Algorithm;

public class BuySell {
    public static void main(String[] args) {
        int prices[] = {7,1,5,3,6,4} ;
        int minp = prices[0] ;
        int p = 0 ;
        for(int i=1 ; i<prices.length ; i++) {
            p = Math.max(p , prices[i] - minp) ;
            minp = Math.min(minp , prices[i]) ;
        }
        System.out.println(p);
    }
}
