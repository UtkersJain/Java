import java.util.*;
public class bncoef{
    public static int factorial(int x) {
        int fact=1 ;
        for(int i =1; i<=x ; i++) {
            fact*=i;
        }
        return fact;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Enter number n : ");    
        int n = sc.nextInt() ;
        System.out.print("Enter number r : ");
        int r = sc.nextInt() ;
        int nfact = factorial(n) ;
        int rfact = factorial(r) ;
        int nrfact = factorial(n-r) ;
        int bnlcoef = nfact/(rfact*nrfact) ;
        System.out.println(bnlcoef);
    }
}