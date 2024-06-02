public class abcdpattern {
    public static void main (String args[]) {
        char ch = 'a' ;
        int n = 5 ;
        for (int i=1 ; i<=n ; i++) {

        for (int chars=1 ; chars<=i ; chars++) {
            System.out.print(ch);
            ch++;
        }
        System.out.println();
    }
    }
}