package Greedy_Algorithm;

import java.util.*;

public class MaxLengthChain {
    public static void main(String[] args) {
        int pairs[][] = {{5,24} , {39,60} , {5,28} , {27,40} , {50,90}} ;

        // sort
        Arrays.sort(pairs, Comparator.comparingDouble(o -> o[1])) ;

        int chainLen = 1 ;
        int lastpairend = pairs[0][1] ;
        
        for (int i = 1 ; i < pairs.length; i++) {
            if(pairs[i][0] >= lastpairend) {
                chainLen++ ;
                lastpairend = pairs[i][1] ;
            }
        }

        System.out.println(chainLen);


    }
}
