package apna;

public class BacktrackingPermutations {
    
    public static void findPermutation(String str , String ans) {
        // base case
        if(str.length()==0) {
            System.out.println(ans);
            return ;
        }
        // recursion part
        for(int i=0 ; i<str.length() ; i++) {
            char cur = str.charAt(i) ;
            // abc === a+c === ac   // b deleted
            String newStr = str.substring(0, i) + str.substring(i+1) ;
            findPermutation(newStr, ans+cur);
        }
    }
    public static void main(String[] args) {
        String str = "abzdszaq  qc" ;
        findPermutation(str, "");
    }
}
