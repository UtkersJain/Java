package Greedy_Algorithm;
import java.util.* ;
public class FractionalKnapsack {
   
    public static int maxTotalValue(int value[], int weight[] , int W) {
        int maxValaue = 0 ;
        double ratio[][] = new double[value.length][2] ;
        for (int i = 0; i < value.length; i++) {
            ratio[i][0] = i ;
            ratio[i][1] = value[i]/(double)weight[i] ;
        }

        // ascending sort
        Arrays.sort(ratio , Comparator.comparingDouble(o -> o[1])) ;

        for (int j = ratio.length- 1 ; j >= 0 ; j--) {
            int k = (int)ratio[j][0] ;
            if(weight[k]<W) {
                maxValaue += value[k] ;
                W = W-weight[k] ;
            }
            else {
                maxValaue += (ratio[j][1]*W) ;
            }
        }
        return maxValaue ;
    }  
    public static void main(String[] args) {
        int value[] = {60,100,120} ;
        int weight[] = {10,20,30} ;
        int W = 50 ;
        System.out.println(maxTotalValue(value,weight,W));
    }
}
