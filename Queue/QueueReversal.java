package Queue;

import java.util.* ;

public class QueueReversal {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        Stack<Integer> helper = new Stack<>() ;
        
        for (int i = 1 ; i <= 5 ; i++) {
            q.add(i) ;     
        }

        // element into stack
        while(!q.isEmpty()) {
            helper.push(q.remove()) ;
        }

        // reverse
        while(!helper.isEmpty()) {
            q.add(helper.pop()) ;
        }

        // print
        while(!q.isEmpty()) {
            System.out.print(q.remove() + " ");
        }
        // System.out.println(q);
            
        
    }
}
