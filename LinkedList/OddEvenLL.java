package LinkedList;

public class OddEvenLL {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void print() {

        Node tmp = head;
        while (tmp != null) {
            System.out.print(tmp.data + " -> ");
            tmp = tmp.next;
        }
        System.out.println("null");
    }

    public Node OddEven() {
        Node evenNode = new Node(-1) ;
        Node temp1 = evenNode ;
        Node oddNode = new Node(-1) ;
        Node temp2 = oddNode ;
        
        Node temp = head ;
        while(temp != null) {
            if((temp.data)%2 == 0) {
                temp1.next = temp ;
                temp1 = temp1.next ;
            }
            else {
                temp2.next = temp ;
                temp2 = temp2.next ;
            }
            temp = temp.next ;
        }
        temp2.next = null ;
        temp1.next = oddNode.next ;
        
        return evenNode.next ;

    }

    public static void main(String[] args) {

        OddEvenLL ll = new OddEvenLL() ;
        ll.addLast(8);
        ll.addLast(12);
        ll.addLast(10);
        ll.addLast(5);
        ll.addLast(4);
        ll.addLast(1);
        ll.addLast(6);

        ll.print();
        head = ll.OddEven() ;
        ll.print();

        
    }
}
