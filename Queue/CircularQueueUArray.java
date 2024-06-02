package Queue;

import java.util.*;

public class CircularQueueUArray {
    static class Queue {
        static int arr[];
        static int size;
        static int rear;
        static int front;

        Queue(int s) {
            arr = new int[s];
            size = s;
            rear = -1;
            front = -1;
        }

        // empty check
        public static boolean isEmpty() {
            return rear == -1 && front == -1;
        }

        // full check
        public static boolean isFull() {
            return (rear + 1) % size == front;
        }

        // add
        public static void add(int data) {
            if (isFull()) {
                System.out.println("Queue is Full");
                return;
            }

            // add first element
            if (front == -1) {
                front = 0;
            }

            rear = (rear + 1) % size;
            arr[rear] = data;
        }

        // remove
        public static int remove() {
            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }

            int data = arr[front];
            
            // last elment delete
            if(rear == front) {
                rear = front = -1 ;
            }

            else {
                front = (front + 1) % size;
            }

            return data;
        }

        // peek
        public static int peek() {
            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }

            return arr[front];
        }

        // print
        public static void print() {
            while (!isEmpty()) {
                System.out.print(peek() + " ");
                remove();
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.add(5);
        q.add(4);
        q.add(3);
        q.add(2);
        q.add(1);

       

        

        System.out.println(q.remove());

        // q.print();

        q.add(9);

        q.print();
    }
}
