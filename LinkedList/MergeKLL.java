package LinkedList;

public class MergeKLL {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private static final Node NULL = null;

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

    public static void print() {

        Node tmp = head;
        while (tmp != null) {
            System.out.print(tmp.data + " -> ");
            tmp = tmp.next;
        }
        System.out.println("null");
    }

    public static Node merge(Node l1 , Node l2) {
        Node newNode = new Node(-1) ;
        Node temp = newNode ;
        while(l1 !=null && l2 != null) {
            if(l1.data < l2.data) {
                temp.next = l1 ;
                l1 = l1.next ;
            } else {
                temp.next = l2 ;
                l2 = l2.next ;
            }
            temp = temp.next ;
        }
        while(l1!=null) {
            temp.next = l1 ;
            l1 = l1.next ;
            temp = temp.next ;
        }
        while(l2!=null) {
            temp.next = l2 ;
            l2 = l2.next ;
            temp = temp.next ;
        }
        return newNode.next ;

    }

    public static Node mergeKNode(Node arr[]) {
        for(int i=0 ; i<arr.length; i++) {
            head = merge(head , arr[i]) ;    
        }
        return head ;
    }
    
    public static void main(String[] args) {
        
        int k = 3 ;
        //int n = 4 ;
        Node arr[] = new Node[k] ;

        arr[0] = new Node(1) ;
        arr[0].next = new Node(3) ;
        arr[0].next.next = new Node(5) ;
        arr[0].next.next.next = new Node(7) ;

        arr[1] = new Node(2) ;
        arr[1].next = new Node(4) ;
        arr[1].next.next = new Node(6) ;
        arr[1].next.next.next = new Node(8) ;

        arr[2] = new Node(0) ;
        arr[2].next = new Node(9) ;
        arr[2].next.next = new Node(10) ;
        arr[2].next.next.next = new Node(11) ;

        head = mergeKNode(arr) ;
        print();

    }
}
