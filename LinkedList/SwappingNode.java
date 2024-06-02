package LinkedList;

public class SwappingNode {

    public static class Node {
        int data ;
        Node next ;

        public Node (int data) {
            this.data = data ;
            this.next = null ;
        }
    }
    public static Node head ;
    public static Node tail ;

    public void add(int data) {
        Node newNode = new Node(data) ;
        if(head == null) {
            head = tail =  newNode ;
            return ;
        }
        tail.next = newNode ;
        tail = newNode ;
    }

    public void printLl() {
        Node temp = head ;
        while(temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next ;
        }
        System.out.println("null");
    }
    
    public void Swapp(int pos1 , int pos2) {
        
        if(pos1 == pos2) {
            return ;
        }
        
        Node temp = head ;
        Node prev1 = null ; 
        Node prev2 = null ; 
        Node x = null ; 
        Node y = null ; 
        
        for (int i = 1 ; i < pos2 ; i++) {
            if(i==pos1-1) {
                prev1 = temp ;
                x = temp.next ;
            }
            else if(i==pos2-1) {
                prev2 = temp ;
                y = temp.next ;
            }
            temp = temp.next ;        
        }

        Node next_x = x.next ;
        Node next_y = y.next ;
        
        prev1.next = y ;
        y.next = next_x  ;
        prev2.next = x ;
        x.next = next_y ; 

    }


    
    public static void main(String[] args) {
        
        SwappingNode ll = new SwappingNode() ;
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(5);
        ll.printLl();
        ll.Swapp(2, 2);
        ll.printLl();
    }
}
