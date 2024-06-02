package Queue;
import java.util.* ;
public class Interleave2Halves {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>() ;
        Queue<Integer> q1 = new LinkedList<>() ;
        Scanner sc = new Scanner(System.in) ;
        
        // taking input
        for (int i = 1 ; i < 10 ; i++) {
            q.add(i) ;
        }
        
        int size = q.size() ;
        
        // breaking queue
        for (int i = 0 ; i < size/2 ; i++) {
            q1.add(q.remove()) ;
        }

        // now Interleave
        while(!q1.isEmpty()) {
            q.add(q1.remove()) ;
            q.add(q.remove()) ;
        }
        if(size%2!=0) {
            q.add(q.remove()) ;
        }

        // print
        while(!q.isEmpty()) {
            System.out.print(q.peek() + " ");
            q.remove() ;
        }


    }
}
