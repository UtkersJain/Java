package apna;

public class StringQuestion {
    public static void main(String[] args) {
       
        // //Question 1
        // String str = "aaBCFesffDRTG";
        // StringBuilder sb = new StringBuilder(str);
        // int count = 0;
        // for (int i = 0; i < str.length(); i++) {
        //     char ch = str.charAt(i);
        //     if ( (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')) {
        //         
        //             count ++ ;
        //
        //     }
        // }
        // System.out.println("count : " + count);


        // // Question 2
        // String str = "ShradhaDidi" ;
        // String str1 = "ApnaCollege" ;
        // String str2 = "ShradhaDidi" ;
        // System.out.println(str.equals(str1) + " " + str.equals(str2));


        // // Question 3 
        // String str = "ApnaCollege".replace("l", " ") ;
        // System.out.println(str);


        // Question 4
        String str1 = "rrac" ;
        String str2 = "care" ;
        boolean isAnagrams = false ;
        if(str1.length() == str2.length()) {
        for(int i=0 ; i<str1.length() ; i++) {
            for(int j=0 ; j<str2.length() ; j++) {
                if(str1.charAt(i) == str2.charAt(j) && str1.charAt(j) == str2.charAt(i)) {
                    isAnagrams = true ;
                    break ;
                }
            }
        }
           
        }
        else {
            System.out.println("Strings are not Anagrams");
        }
        String st = (isAnagrams==true) ? "Strings are Anagrams" : "Strings are not Anagrams" ;
        System.out.println(st);
    }
}
