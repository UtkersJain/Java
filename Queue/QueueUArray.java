package Queue;

public class QueueUArray {
    static class Queue {
        static int arr[] ;
        static int size ;
        static int rear ;
        static int front ;

        Queue(int n) {
            arr= new int[n] ; 
            size = n ;
            rear = -1 ;
            front = 0 ;
        }

        // is Empty
        public static boolean isEmpty() {
            return rear == -1 ;
        }

        // add
        public static void add(int data) {
            if(rear == size-1) {
                System.out.println("Queue is full");
                return ;
            }
            
            rear = rear+1 ;
            arr[rear] = data ;
        }

        public static int remove() {
            if(isEmpty()) {
                System.out.println("Empty Queue");
                return -1 ;
            }

            int data = arr[front] ;
            for (int i = 0 ; i < rear ; i++) {
                arr[i] = arr[i+1] ;
            }
            rear = rear-1 ;
            return data ;
        }

        // peek
        public static int peek() {
            if(isEmpty()) {
                System.out.println("Empty Queue");
                return -1 ;
            }
            
            return arr[front] ;
        }
        
        public static void print() {
            while(!isEmpty()) {
                System.out.print(peek() + " ");
                remove() ;
            }
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(5) ;
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        q.print();
    }
}
