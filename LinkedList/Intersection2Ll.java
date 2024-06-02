package LinkedList;

public class Intersection2Ll {
    
    public static class Node {
        int data ;
        Node next ;

        public Node(int data) {
            this.data = data ;
            this.next = null ;
        }
    }
    
    public Node getIntersectionNode(Node head1 , Node head2) {
        while(head1 != null)  {
            Node temp = head2 ;
            while(temp != null) {            
                if(head1 == temp) {
                    return head1 ;
                }
                temp = temp.next ;
            }
            head1 = head1.next ;         
        }
        return null ;
    }
    
    
   
    
    public void printLL(Node head) {
        Node temp = head ;
        while(temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next ;
        }
        System.out.println("null");
    }
    
    public static void main(String[] args) {
        Intersection2Ll ll = new Intersection2Ll() ;
        Node head1 , head2 ;
        head1 = new Node(1) ;
        head2 = new Node(4) ;

        Node newNode = new Node(6) ;
        
        head1.next = new Node(2) ;
        head1.next.next = new Node(3) ;
        head1.next.next.next = newNode ;
        Node temp = head1.next.next.next.next ;
        temp = new Node(7) ;

        head2.next = new Node(5) ;
        head2.next.next = newNode ;
        head2.next.next.next = temp ;

        Node inersect = ll.getIntersectionNode(head1,head2) ;
        System.out.println(inersect.data);


        
        

    }
}
