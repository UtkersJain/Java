import java.util.*;
public class ternary_operator{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age : ");
        int age = sc.nextInt();
        String a = (age>=18)? "eligible for vote":"not eligible for vote" ;
    }
}