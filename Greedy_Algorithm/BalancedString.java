package Greedy_Algorithm;
import java.util.* ;
public class BalancedString {
    
    public static int balancedStringSplit(String s) {
        int lcounter=0 , rcounter=0 , counter=0 ;
        for(int i=0 ; i<s.length() ; i++) {
            char ch = s.charAt(i) ;
            if(ch=='L') lcounter++ ;
            else rcounter++ ;
            if(lcounter==rcounter) counter++ ;
        }
        return counter ;
        
    }
    
    
    public static void main(String[] args) {
        String s = "LRRRRLLRLLRL" ;
        System.out.println(balancedStringSplit(s));

    }
}
