import java.util.* ;
public class hollowrect {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Lenth of rectangle : ");
        int len = sc.nextInt();
        System.out.print("Breadth of rectangle : ");
        int breadth = sc.nextInt() ; 
        for (int i= 1 ; i<=len ; i++) {
            for (int j=1 ; j<=breadth ; j++) {
                if(i==1 || i==len || j==breadth || j==1) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}