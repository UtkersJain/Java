package apna;

public class PairsInArray {
    public static void pairsInArray(int num[]) {
        int tp = 0;
        for(int i=0 ; i<num.length ; i++) {
            for(int j=i+1 ; j<num.length ; j++) {
                System.out.print("("+num[i]+","+num[j]+")"+" ");
                tp++;
            }
            System.out.println();
        }
        System.out.println("Total pair : "+tp); 
    }
    public static void main(Strings args[]) {
        int num[] = {1,2,3,4,5,6};
        pairsInArray(num);
    }
}
