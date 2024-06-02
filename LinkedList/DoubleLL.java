package LinkedList;

public class DoubleLL {
    
    public static class Node {
        int data ;
        Node next ;
        Node prev ;

        public Node (int data) {
            this.data = data ;
            this.next = null ;
            this.prev = null ; 
        }
    }
    public static Node head ;
    public static Node tail ;
    public static int size ;
    

    // add First
    public void addFirst(int data) {
        Node newNode = new Node(data) ;
        size ++ ;
        // if ll is empty
        if(head == null) {
            head = tail = newNode ;    
            return ;    
        }

        // having some element
        newNode.next = head ;
        head.prev = newNode ;
        head = newNode ;
    }

    // add Last
    public void addLast(int data) {
        Node newNode = new Node(data) ;
        size ++ ;
        // if ll is empty
        if(head == null) {
            head = tail = newNode ;    
            return ;    
        }
        tail.next = newNode ;
        newNode.prev = tail ;
        tail = newNode ;

    }

    // removeFirst
    public void removeFirst() {
        int data = head.data ;
        
        if(head.next == null) {
            size = 0 ;
            head = tail = null ;
            System.out.println(data);
            return ;
        }
        
        size -- ;
        head = head.next ;
        head.prev = null ;
        System.out.println(data);
    }

    // remove Last
    public void removeLast() {
        int data = tail.data ;
        
        if(head.next == null) {
            size = 0 ;
            head = tail = null ;
            System.out.println(data);
            return ;
        }
        
        size -- ;
        tail = tail.prev ;
        tail.next = null ;
        System.out.println(data);
    }

    // print ll 
    public void printLL() {        
        Node temp = head ;
        while(temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next ;
        }
        System.out.println("null");
        
    }

    // reverse the linkedList
    public void reverse() {
        Node prev = null ;
        Node curr = head ;
        Node next ;
        while(curr != null) {
            next = curr.next ;
            curr.next = prev ;
            curr.prev = next ;
            prev = curr ;
            curr = next ;
        }
        head = prev ;
    } 

    public static void main(String[] args) {
        DoubleLL dll = new DoubleLL() ;
        dll.addFirst(2);
        dll.addFirst(1);
        dll.addFirst(3);
        dll.addLast(0);
        // dll.removeFirst();
        // dll.removeLast();
        dll.printLL();
        dll.reverse();
        dll.printLL();
        // System.out.println(size);
    }

}
