public class leftshifted1234pat {
    public static void main (String args[]) {
        int n=4 ;
        for (int i=1 ; i<=n ; i++) {
            for (int space=1 ; space<=i ; space++) {
                System.out.print(" ");
            }
                for (int num=1 ; num<=n-i+1 ; num++) {
                    System.out.print(num);
                }
            
            System.out.println();
    }
}
}