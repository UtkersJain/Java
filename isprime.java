public class isprime {
    public static boolean isprime(int n) {
        
        //Corner case
        if(n==2) {
            return true;
        }
        
        
        for (int i = 2 ; i<=Math.sqrt(n) ; i++) {  //sqrt(n) for optimized function
            if(n%i==0) {
                return false ;
            }
        }
        return true ;
    }

    public static void main(String args[]) {
        System.out.println(isprime(6));
    }
} 