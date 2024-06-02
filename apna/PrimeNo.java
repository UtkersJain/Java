package apna;

public class PrimeNo {
    public static boolean isPrime(int n) {
        
        if(n==2) {
            return true ;
        }
        else {
            for(int i=2 ; i<=Math.sqrt(n) ; i++) {
                if(n%i==0) {
                    return false ;
                }
            }
        }
        return true ;
    

    }

    public static void main(String[] args) {
        for(int i=2 ; i<=10 ; i++) {
            if(isPrime(i)==true) {
                System.out.print(i+" ");
            }
        }
    }
}
