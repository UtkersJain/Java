package Queue;

import java.util.Stack;

public class QueueU2Stacks {
    // add---O(n) and remove---O(1)
    // static class Queue {
    //     static Stack<Integer> s1 = new Stack<>() ;
    //     static Stack<Integer> s2 = new Stack<>() ;

    //     public static boolean isEmpty() {
    //         return s1.isEmpty() ;
    //     }

    //     // add
    //     public static void add(int data) {
            
    //         while (!s1.isEmpty()) {
    //             s2.push(s1.pop()) ;
    //         }
            
    //         s1.push(data) ;
            
    //         while(!s2.isEmpty()) {
    //             s1.push(s2.pop()) ;
    //         }
    //     }

    //     // remove
    //     public static int remove() {
    //         if (s1.isEmpty()) {
    //             System.out.println("Queue is Empty");
    //             return -1 ;
    //         }
            
    //         return s1.pop() ;
    //     }

    //     // peek
    //     public static int peek() {
    //         if (s1.isEmpty()) {
    //             System.out.println("Queue is Empty");
    //             return -1 ;
    //         }

    //         return s1.peek() ;
    //     }

    // }

    // remove---O(n) and add---O(1)
    static class Queue {
        static Stack<Integer> s1 = new Stack<>() ;
        static Stack<Integer> s2 = new Stack<>() ;

        public static boolean isEmpty() {
            return s1.isEmpty() ;
        }

        // remove
        public static int remove() {
            if(s1.isEmpty()) {
                System.out.println("Queue is Empty");
                return -1 ;
            }
            while(!s1.isEmpty()) {
                s2.push(s1.pop()) ;
            }
            int data = s2.pop() ;
            while(!s2.isEmpty()) {
                s1.push(s2.pop()) ;
            }
            return data ;
        }

        // peek
        public static int peek() {
            if(s1.isEmpty()) {
                System.out.println("Queue is Empty");
                return -1 ;
            }
            while(!s1.isEmpty()) {
                s2.push(s1.pop()) ;
            }
            int data = s2.peek() ;
            while(!s2.isEmpty()) {
                s1.push(s2.pop()) ;
            }
            return data ;
        }

        // add
        public static void add(int data) {
            s1.push(data) ;
        }
    }


    public static void main(String[] args) {
        Queue q = new Queue() ;
        q.add(1) ;
        q.add(2) ;
        q.add(3) ;

       

        while(!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove() ;
        }
        
    }
}
