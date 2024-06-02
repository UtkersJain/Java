package apna;

public class BitManipulation {

    public static void oddOrEven(int n) {
        int bitMask = 1;
        String st = ((n & bitMask) == 0) ? "Even Number" : "Odd number" ;
        System.out.println(st);
    }

    public static int getIthBit(int n , int i) {
        int bitMask = 1<<i ;
        if((n & bitMask) != 0 ) {
            return 1 ;
        }
        else {
            return 0 ;
        }
    }

    public static int setIthBit(int n , int i) {
        int bitMask = 1<<i ;
        return n | bitMask ;
    }

    public static int clearIthBit(int n , int i) {
        int bitMask = 1<<i ;
        return n & (~bitMask) ;
    }

    public static int clearLastIBits(int n , int i) {
        // int num = n ; 
        // for(int j=0 ; j<i ; j++) {
        //     num =  clearIthBit(num, j) ;
        // }
        // return num ;

        //or

        int bitMask = (~0) << i ;
        return n & bitMask ;

    }
    
    public static int updateIthBit(int n , int i , int newBit) {
        // if(newBit == 0) {
        //     return clearIthBit(n, i) ;
        // }
        // else {
        //     return setIthBit(n, i) ;
        // }

        // or

        n = clearIthBit(n, i); 
        int bitMask = newBit<<i ;
        return n | bitMask ;
        


    }

    public static int clearRangeOfBits(int n , int i , int j) {
       int a = (~0) << j+1 ;
       int b = (1<<i) - 1 ;
       int bitMask = a | b ;
       return ( n & bitMask ) ;
    }

    public static void isPowerOfTwo(int n) {
        if((n & n-1) == 0) {
            System.out.println(n + " is power of 2");
        }
        else {
            System.out.println(n + " is not power of 2");
        }
    }

    public static int countSetBits(int n) {
        int bitMask = 1<<1 ;    //1
        int count = 0 ;
        while(n>0) {
            int temp = ( n & bitMask ) ;
            if(temp != 0) {
                count++ ;
            }
            n = (n>>1) ;
        }
        return count ;
    }

    public static int exponentiation(int a , int n) {
        int ans = 1 ;
        while ( n>0 ) {
            if((n & 1) != 0) {
                ans = ans*a ;
            }
           
            a *= a ;
            n = (n>>1) ;
        }
        return ans ;
    }
    
    public static void main(String[] args) {
        // // Bitwise AND
        // System.out.println(5 & 6);

        // // Bitwise OR
        // System.out.println(5 | 6);

        // // Binary XOR
        // System.out.println( 5 ^ 6 );

        // // Binary One's Complement
        // System.out.println( ~0 );

        // // Binary Left Shift
        // System.out.println(5<<2); 
        
        // // Binary Right Shift
        // System.out.println(6>>1); 

        // oddOrEven(5) ;

        //System.out.println(getIthBit(10, 2));

        //System.out.println(setIthBit(10, 2));
        
        //System.out.println(clearIthBit(10, 1)) ;;

        //System.out.println(updateIthBit(10, 2, 1));

        //System.out.println(clearLastIBits(15, 2));

        //System.out.println(clearRangeOfBits(10, 2, 4));

        //isPowerOfTwo(4);
        
        //System.out.println(countSetBits(10)) ;
        
        System.out.println(exponentiation(5, 3));

    }
}
