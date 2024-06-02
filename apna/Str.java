package apna;

public class Str {
    public static void palindrome(java.lang.String name) {

        boolean palindrome = true;
        int size = name.length() - 1;

        for (int i = 0; i < name.length() / 2; i++) {
            if (name.charAt(i) != name.charAt(size - i)) {
                palindrome = false;
                break;
            }
        }
        if (palindrome == true) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }

    public static void shortestPath(java.lang.String name) {
        int i = 0;
        int j = 0;
        int n = name.length() - 1;
        for (int k = 0; k <= n; k++) {
            if (name.charAt(k) == 'W') {
                i--;
            } else if (name.charAt(k) == 'E') {
                i++;
            } else if (name.charAt(k) == 'N') {
                j++;
            } else {
                j--;
            }
        }
        int xaxis = (int) Math.pow(i - 0, 2);
        int yaxis = (int) Math.pow(j - 0, 2);
        int sd = xaxis + yaxis;
        System.out.println(Math.sqrt(sd));

    }

    public static void compare() {
        String s1 = "Tony";
        String s2 = "Tony";
        String s3 = new String("Tony");

        /*
         * if(s1 == s2) {
         * System.out.println("String Equal");
         * }
         * else {
         * System.out.println("Not equal");
         * }
         */

        /*
         * if(s1 == s3) {
         * System.out.println("String Equal");
         * }
         * else{
         * System.out.println("Not equal");
         * }
         */

        if (s1.equals(s3)) {
            System.out.println("String Equal");
        } else {
            System.out.println("Not Equal");
        }

    }

    public static void subString(String s1, int si, int ei) {
        String str = "";
        for (int i = si; i < ei; i++) {
            str += s1.charAt(i);
        }
        System.out.println(str);
    }

    public static void largestString() {
        String fruits[] = { "apple", "mango", "banana", "Mango" };
        String largest = fruits[0];
        for (int i = 0; i < fruits.length; i++) {
            if (largest.compareTo(fruits[i]) < 0) {
                largest = fruits[i];
            }
        }
        System.out.println("largest : " + largest);
    }

    public static void stringBuilder() {
        StringBuilder sb = new StringBuilder("");
        for (char ch = 'a'; ch <= 'z'; ch++) {
            sb.append(ch);
        }
        System.out.println(sb);
    }

    public static String toUpperCase(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(Character.toUpperCase(str.charAt(0)));
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == ' ' && i != str.length() - 1) {
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            } else {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

    public static String stringCompression(String str) {
        StringBuilder sb = new StringBuilder("") ;
        for(int i=0 ; i<str.length() ; i++) {
            int count = 1 ;
            
            while (i<str.length()-1 && str.charAt(i) == str.charAt(i+1))
            {
                count++ ;
                i++ ;
            }
            sb.append(str.charAt(temp)) ;
            if (count>1) {
            sb.append(count) ;
            }
            
        }
        return sb.toString() ;
    } 

    
    

    public static void main(String[] args) {
        // java.lang.String name = "WNEENESENNN";

        // palindrome(name);
        // shortestPath(name);
        // compare();

        /*
         * subString(name,0,11 );
         * // or
         * name.substring(0, 5) ;
         */

        // largestString();

        // ***************
        // ******* STRINGBUILDER *********
        // stringBuilder();

        // ********************
        // ****CONVERT TO UPPER CASE OF EACH WORD*********
        /*
         * String str = "hii, shield is here " ;
         * System.out.println(toUpperCase(str)) ;
         */

        // **********************
        // ********** STRING COMPRESSION **********
        String s = "aaabbcccdd";
        System.out.println(stringCompression(s));

    }
}
