package apna;

public class Recursion {

    // print numbers in increasing order
    public static void increasingOrder(int n) {
        if (n == 1) {
            System.out.println("1");
            return;
        }

        increasingOrder(n - 1);
        System.out.println(n + " ");
    }

    // print numbers in decreasing order
    public static void decreasingOrder(int n) {
        if (n == 1) {
            System.out.println(n);
            return;
        }
        System.out.print(n + " ");
        decreasingOrder(n - 1);
    }

    // print factorial
    public static int factorial(int n) {

        if (n == 0) {

            return 1;
        }
        int fnm1 = factorial(n - 1);
        int fon = n * fnm1;

        return fon;
    }

    // sum of first n natural numbers
    public static int sum(int n) {
        if (n == 0) {
            return 0;
        }
        int addNM1 = sum(n - 1);
        int sum = n + addNM1;
        return sum;
    }

    // print nth fibonacci number
    public static int fibonacciNumber(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        int foNM1 = fibonacciNumber(n - 1);
        int foNM2 = fibonacciNumber(n - 2);
        int foN = foNM1 + foNM2;
        return foN;
    }

    // Check array is sorted or not
    public static boolean isSorted(int arr[], int i) {

        if (i == arr.length - 1) {
            return true;
        }
        if (arr[i] >= arr[i + 1]) {
            return false;
        }
        return isSorted(arr, i + 1);
    }

    // WAF to find the first occurence of an element in an array
    public static int keyIndex(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        if (key == arr[i]) {
            return i;
        }
        return keyIndex(arr, key, i + 1);

    }

    // WAF to find the last occurence of an element in an array
    public static int keyIndexLast(int arr[], int key, int i) {
        if (i == -1) {
            return -1;
        }
        if (key == arr[i]) {
            return i;
        }
        return keyIndex(arr, key, i - 1);
    }

    public static int keyIndexLastByMam(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;
        }

        int isFound = keyIndexLastByMam(arr, key, i + 1);
        if (isFound == -1 && arr[i] == key) {
            return i;
        }

        return isFound;

    }

    // print x^n
    public static int power(int x, int n) {
        if (n == 1) {
            return x;
        }

        // int Power = power( x , n-1) ;
        // int mul = x * Power ;
        // return mul ;

        // or

        // return x * power(x, n-1) ;

        // less optimized way O(logn)
        if (n == 0) {
            return 1;
        }
        // int halfPower = power(x,n/2) * power(x, n/2) ;
        int halfPowersq = power(x, n / 2);
        int halfPower = halfPowersq * halfPowersq;

        // n is odd
        if (n % 2 != 0) {
            halfPower = x * halfPower;
        }

        return halfPower;

    }

    // Tiling Problem
    public static int tilingProblem(int n) {
        // base class
        if (n == 0 || n == 1) {
            return 1;
        }

        // // kaam

        // // Vertical
        // int fnm1 = tilingProblem(n - 1);

        // // Horizontal
        // int fnm2 = tilingProblem(n - 2);

        // int totWays = fnm1 + fnm2;
        // return totWays;

        
        // or 
        // single step statement 
        return tilingProblem(n-1) + tilingProblem(n-2) ;

    }

    public static void printBinStrings(int n , int lastDigit , String str) {
        if(n==0) {
            System.out.println(str);
            return ;
        }

        // kaam
        printBinStrings(n-1, 0, str+"0");
        if(lastDigit == 0) {
            printBinStrings(n-1, 1, str+"1");
        }
    }

    // Remove the duplicate in a String
    public static void dupl() {
        StringBuilder sb = new StringBuilder("");
        String name = "appnnacollege";
        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);

            boolean duplicate = false;

            for (int j = 0; j < i; j++) {
                if (name.charAt(j) == ch) {
                    duplicate = true;
                }
            }

            if (duplicate == false) {

                sb.append(ch);
            }
        }
        String ac = sb.toString();
        System.out.println(ac);
    }

    public static void removeDuplicate(String str , int idx , StringBuilder newString , boolean map[]) {
        if(idx == str.length()) {
            System.out.println(newString) ;
            return ;
        }

        //kaam
        char currChar = str.charAt(idx) ;
        if(map[currChar-'a'] == true) {
            removeDuplicate(str, idx+1, newString, map);
        }
        else {
            map[currChar-'a'] = true ;
            removeDuplicate(str, idx+1, newString.append(currChar), map);
        }
    }

    // Friends Pairirng problem
    public static int friendsPairing(int n) {
        if(n==1 || n==2) {
            return n ;
        }
        
        // //choice 
        
        // //single
        // int fnm1 = friendsPairing(n-1) ;
        
        // //pair
        // int fnm2 = friendsPairing(n-2) ;
        // int pairWays = (n-1)*fnm2 ;
        
        // // totWays
        // int totWays = fnm1 + pairWays ;
        // return totWays ;

        // or 
        // single step statement 
        return friendsPairing(n-1) + (n-1)*friendsPairing(n-2) ;
    }

    // Questions on Recursion 

    // Question1:
    // For a given integer array of size N.You have to find all the occurrences(indices) of a given element(Key) and print them.
    public static void printOccurences(int arr[],int i,int key) {
        // base case 
        if(i==arr.length) {
            // System.out.println("Array is completed");
            return ;
        }
        
        if(arr[i] == key )
        {
            System.out.print(i + " ");
        }
        printOccurences(arr, i+1, key);
    } 

    // Question 2 
    // You are given a number (eg - 2019), convert it into a String of english like “two zero one nine”. 
    public static void printNumToWord(int n) {
        String arr[] = {"Zero " , "One " , "Two " , "Three " , "Four " , "Five " , "Six " , "Seven " , "Eight " , "Nine "} ;

        if(n == 0) {
            return ;
        }

        int lastDigit = n%10 ;
        printNumToWord(n/10);
        System.out.print(arr[lastDigit]);

    }

    // Question 3 : 
    // Write a program to find Length of a String using Recursion.
    public static int lengthOfString(String str) {
        if(str.length() == 0) {
            return 0 ;
        }
        
        return lengthOfString(str.substring(1)) + 1 ;
    }

    public static void main(String[] args) {
        // increasingOrder(10);
        // decreasingOrder(5);
        // System.out.println(factorial(5)) ;
        // System.out.println(sum(5));

        // int n = 1 ;
        // System.out.println(fibonacciNumber(n));

        // int arr[] = { 5, 2, 5, 5 };
        // int n = arr.length - 1;
        // System.out.println(isSorted(arr, 0));

        // System.out.println(keyIndexLast(arr, 5, n));
        // System.out.println(keyIndexLastByMam(arr, 5, 0));

        // System.out.println(power(2, 10)) ;

        // System.out.println(tilingProblem(3));
        
        // StringBuilder sb = new StringBuilder("") ;
        // boolean map[] = new boolean[26] ;
        // removeDuplicate("appnnacollege",0,sb,map);
        
        // System.out.println(friendsPairing(3));

        // printBinStrings(3, 0, new String(""));

        // Questions Answers

        // // Question 1
        // int arr[] = {3,2,4,5,6,2,7,2,2} ; 
        // printOccurences(arr, 0, 2);

        // // Question 2
        // printNumToWord(456);

        // Question 3
        System.out.println(lengthOfString("abcd")) ;

    }

}
