package LinkedList;

public class DeleteNNodesAfterM {
    
    public static class Node {
        int data ;
        Node next ;
        public Node(int data) {
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

    public void delete(int M , int N) {
        Node temp1 = head ;
        while(temp1 != null) {            
            for (int i = 1 ; i < M  ; i++) {
                temp1 = temp1.next ;
                if(temp1 == null) {
                    return ;
                }
            }
            for (int i = 1 ; i <= N ; i++) {                
                temp1.next = temp1.next.next;   
                if(temp1.next == null) {
                    return ;
                }

            }
            temp1 = temp1.next ;            
        }
    }
    public static void main(String[] args) {
        DeleteNNodesAfterM ll = new DeleteNNodesAfterM() ;
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(5);
        ll.add(6);
        ll.add(7);
        ll.add(8);
        ll.add(9);
        ll.add(10);
        ll.add(11);
        ll.printLl();
        ll.delete(3, 3);
        ll.printLl();
    }
}
