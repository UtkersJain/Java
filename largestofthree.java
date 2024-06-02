import java.util.*;
public class largestofthree{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number a :");
        int a = sc.nextInt();
        System.out.print("Enter number b : ");
        int b = sc.nextInt();
        System.out.print("Enter number c : ");
        int c = sc.nextInt();
        if((a>=b) && (a>=c)){
            System.out.println("Greatest number is"+a);
        }
        else if((b>=c)) {
            System.out.println("Greatest number is :"+b);
        }
        else {
            System.out.println("Greatest number is : "+c);
        }
    }
}