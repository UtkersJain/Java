package Greedy_Algorithm;
import java.util.* ;
public class KthLargest {
    public static void main(String[] args) {
        int L = -10 ;
        int R = 10 ;
        int k = 8 ;

        ArrayList<Integer> arr = new ArrayList<>() ;
        
        for(int i=L ; i<=R ; i++) {
            if(i%2 != 0) {
                arr.add(i) ;
            }
        }
        
        arr.sort(Comparator.reverseOrder());

        if(k>arr.size()) {
            System.err.println(0);
        } else {
            System.out.println(arr.get(k-1));
        }


    }
}
