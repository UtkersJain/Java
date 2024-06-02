package Stack;

import java.util.Stack;

public class PalindromeLL {
    
    static class Node {
        char data ;
        Node next ;
        public Node(char data) {
            this.data = data ;
            this.next = null ;
        }
    }
    public static Node head ;
    public static Node tail ;
    
    // add
    public static void add(char data) {
        Node newNode = new Node(data) ;
        if(head == null) {
            head = tail = newNode ;
        }
        tail.next = newNode ;
        tail = newNode ;        
    }

    // print
    public static void print(Node head) {
        Node temp = head ;
        while(temp!=null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next ;
        }
        System.out.println("null");
    } 

    public static void main(String[] args) {
        Node newNode = new Node('A') ;
        head = newNode ;
        head.next = new Node('B') ;
        head.next.next = new Node('A') ;
        head.next.next.next = new Node('B') ;
        head.next.next.next.next = new Node('D') ;

        Stack<Character> s = new Stack<>() ;
        
        Node temp1 = head ;
        while(temp1!=null) {
            s.push(temp1.data) ;
            temp1 = temp1.next ;
        }

        boolean isPalindrome = true ;
        Node temp = head ;
        while(!s.isEmpty()) {
            if(s.peek() != temp.data) {
                isPalindrome = false ;
                break ;
            }
            else {
                s.pop() ;
                temp = temp.next ;
            }
        }

        if(isPalindrome==true) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        
       


    }
    
    
}
