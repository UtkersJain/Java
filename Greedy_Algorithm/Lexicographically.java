package Greedy_Algorithm;

public class Lexicographically {
    public static String getSmallestString(int n, int k) {
        char[] str = new char[n];
        int j = k - n;
    
        // Fill the string with 'a'
        for (int i = 0; i < str.length; i++) {
            str[i] = 'a';
        }
    
        
        // Starting from the end of the string, replace characters with 'z' until j becomes 0
        for (int i = str.length - 1; i >= 0 && j > 0; i--) {
            // Calculate the minimum of j and 25 ('z' - 'a')
            int m = Math.min(25, j);
            // Set the character at the current position to 'a' + m
            str[i] = (char) ('a' + m);
            // Update j
            j -= m;
            
        }
    
        return new String(str);
    }

    public static void main(String[] args) {
        int n = 3 ;
        int k = 25 ;
        System.out.println(getSmallestString(n,k));
    }
}
