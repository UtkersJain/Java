package Queue;
import java.util.* ;
public class StackUDeque {
    static class Stack {
        
        Deque<Integer> d = new LinkedList<>() ;

        public boolean isEmpty() {
            return d.isEmpty() ;
        }

        public void push(int data) {
            d.addFirst(data) ;
        }

        public int pop() {
            if(isEmpty()) {
                return -1 ;
            }
            return d.removeFirst() ;
        }

        public int peek() {
            if(isEmpty()) {
                return -1 ;
            }
            return d.getFirst() ;
        }

       
    }
    public static void main(String[] args) {
        Stack st = new Stack() ;
        st.push(5) ;
        st.push(4) ;
        st.push(3) ;
        st.push(2) ;

        // print
        while(!st.isEmpty()) {
            System.out.print(st.peek() + " ");
            st.pop() ;
        }
    }
}
