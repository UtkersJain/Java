package Queue;

public class QueueULL {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Queue {
        static Node head = null;
        static Node tail = null;

        // empty check
        public static boolean isEmpty() {
            return head == null;
        }

        // add
        public static void add(int data) {
            Node newNode = new Node(data);

            // initial empty
            if (isEmpty()) {
                head = tail = newNode;
                return;
            }

            tail.next = newNode;
            tail = newNode;
        }

        // remove
        public static int remove() {
            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }

            int data = head.data;

            if (tail == head) {
                tail = head = null;

            } else {
                head = head.next;
            }
            return data;
        }

        // peek
        public static int peek() {
            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }

            return head.data;
        }

        // print
        public static void print() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        // q.add(2);
        // q.add(3);
        // q.add(4);
        // q.add(5);

        q.print();

        q.remove();

        q.print();

        q.add(9);

        q.print();
    }
}
