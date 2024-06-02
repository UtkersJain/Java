public class funcoverloading_calculator {
    
    //func for 2 nums addition
    public static int add(int a, int b){
        return a+b;
    }

    //func for 3 nums addition 
    public static int add(int a, int b, int c ) {
        return a+b+c ;
    }

    //func for add 2 nums having float values
    public static float add(float a, float b ) {
        return a+b ;
    }
    public static void main(String args[]) {
        System.out.println(add(4,5));
        System.out.println(add(1,3,5));
        System.out.println(add(2.5f,3));


    }
}