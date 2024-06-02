package LinkedList;

// import java.util.* ;
public class LinkedList {
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
    public static int size;

    public void addFirst(int data) {

        // Step 1 - create new node
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }

        // Step 2 - newNode = head
        newNode.next = head;

        // Step 3 - head = newNode
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void add(int idx, int data) {
        if (idx == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        int i = 0;
        Node temp = head;
        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void print() {

        Node tmp = head;
        while (tmp != null) {
            System.out.print(tmp.data + " -> ");
            tmp = tmp.next;
        }
        System.out.println("null");
    }

    public int removeFirst() {
        if (size == 0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }

        else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        int val = head.data;
        head = head.next;
        size--;
        return val;

    }

    public int removeLast() {
        if (size == 0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }

        else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int j = 0;
        Node prev = head;
        while (j < size - 2) {
            prev = prev.next;
            j++;
        }
        int val = tail.data; // prev.next.data
        tail = prev;
        size--;
        tail.next = null;
        return val;
    }

    public int itrSearch(int key) {
        Node temp = head;
        int idx = 0;
        while (temp != null) {
            if (temp.data == key) {
                return idx;
            }
            temp = temp.next;
            idx++;
        }
        return -1;
    }

    public int helper(int key, Node head) {
        // base case
        if (head == null) {
            return -1;
        }

        // main
        if (head.data == key) {
            return 0;
        }
        int idx = helper(key, head.next);
        if (idx == -1) {
            return -1;
        } else {
            return idx + 1;
        }
    }

    public int recSearch(int key) {
        return helper(key, head);
    }

    public void itrReverse() {
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev; // reverse
            prev = curr;
            curr = next;
        }
        head =  prev ;
    }

    public void recReverseByMe(Node prev, Node curr) {
        // base case
        if (curr == null) {
            head = prev;
            return;
        }

        Node next = curr.next;
        curr.next = prev;
        recReverseByMe(curr, next);
    }

    public Node recReverse(Node head) {
        // base case
        if (head == null || head.next == null) {
            return head;
        }

        Node newHead = recReverse(head.next);
        head.next.next = head;
        head.next = null;

        return newHead;
    }

    public int removeFromEnd(int position) {

        // calculate size
        int sz = 0;
        Node tmp = head;
        while (tmp != null) {
            tmp = tmp.next;
            sz++;
        }

        // first element delete
        if (position == sz) {
            int item = head.data;
            head = head.next;
            return item;
        }

        int idx = sz - position;
        Node temp = head;
        for (int i = 0; i < idx - 1; i++) {
            temp = temp.next;
        }
        int item = temp.next.data;
        temp.next = temp.next.next;
        return item;
    }

    // slow fast approach
    public Node middle(Node head) {
        Node slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next; // +1
            fast = fast.next.next; // +2
        }
        return slow;
    }

    public boolean checkPalindrome(Node head) {
        if (head == null || head.next == null) {
            return true;
        }

        // Step 1 - find mid
        Node midNode = middle(head);

        // Step -2 - reverse 2nd half
        Node prev = null;
        Node curr = midNode;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev;
        Node left = head;

        // Step - 3 -- check 1st half = check 2nd half
        while (right != null) {
            if (left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }

    // Detecting a loop in LinkedList // Floyd's Cycle Algorithm
    public boolean detectLoop(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow) {
                return true;
            }
        }
        return false;
    }

    // remove a loop
    public void removeLoop(Node head) {

        // detect Cycle
        Node slow = head;
        Node fast = head;
        boolean cycle = false;
        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow) {
                cycle = true;
                break;
            }
        }
        if (cycle == false) {
            return;
        }

        // find meeting point
        Node prev = null;
        slow = head;
        while (slow != fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }

        // remove cycle -> last.null -> null
        prev.next = null;
    }

    // ******************** Merge Sort *******************
    private Node midNode(Node head) {
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    private Node merge(Node leftHead, Node rightHead) {
        Node mergNode = new Node(-1);
        Node temp = mergNode;

        while (leftHead != null && rightHead != null) {
            if (leftHead.data > rightHead.data) {
                temp.next = rightHead;
                temp = temp.next;
                rightHead = rightHead.next;
            } else {
                temp.next = leftHead;
                temp = temp.next;
                leftHead = leftHead.next;
            }
        }

        while (leftHead != null) {
            temp.next = leftHead;
            temp = temp.next;
            leftHead = leftHead.next;
        }

        while (rightHead != null) {
            temp.next = rightHead;
            temp = temp.next;
            rightHead = rightHead.next;
        }

        return mergNode.next;
    }

    public Node mergeSort(Node head) {

        // base case
        if (head == null || head.next == null) {
            return head;
        }

        // mid point
        Node midNode = midNode(head);

        // divie L and R
        Node rightHead = midNode.next;
        midNode.next = null; // break

        Node newLeft = mergeSort(head); // left part
        Node newRight = mergeSort(rightHead); // right part

        // merge L and R
        return merge(newLeft, newRight);
    }
    // ***********************************************End************************************************

    // ************* ZIG - ZAG LINKED LINKED LIST *****************************************
    private Node getMid(Node head) {
        Node slow = head ;
        Node fast = head.next ;
        while(fast != null && fast.next != null) {
            slow = slow.next ;
            fast = fast.next.next ;
        }
        return slow ;
    }
    
    public Node zigZag(Node head) {

        // get a mid
        Node mid = getMid(head) ;

        // break into two
        Node rightHalf = mid.next ;
        mid.next = null ;

        // reverse second half
        Node prev = null ;
        Node curr = rightHalf ;
        Node next ;
        while(curr != null) {
            next = curr.next ;
            curr.next = prev ;
            prev = curr ;
            curr = next ;
        }
        rightHalf = prev ;

        Node newll = new Node(-1) ;
        Node temp = newll ;
        
        while(head != null || rightHalf != null) {
            temp.next = head ;
            head = head.next;
            temp = temp.next ;
            if(rightHalf == null) {
                return newll.next ;
            }
            temp.next = rightHalf ;
            rightHalf = rightHalf.next;
            temp = temp.next ;

        }

        return newll.next ;
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.addLast(6);
        // ll.add(2, 9);
        ll.print();

        // System.out.println("Element that is deleted : " + ll.removeFirst()) ;
        // System.out.println("Element that is deleted : " + ll.removeLast()) ;
        // System.out.println(ll.itrSearch(9));
        // System.out.println(ll.itrSearch(10));
        // System.out.println(ll.recSearch(9));
        // ll.itrReverse();
        // ll.recReverseByMe(null, head);
        // head = ll.recReverse(head);
        // System.out.println(ll.removeFromEnd(5)) ;

        // System.out.println(ll.checkPalindrome(head));

        // for loop *********************************************
        // head = new Node(1);
        // head.next = new Node(2);
        // head.next.next = new Node(3);
        // head.next.next.next = head.next;
        // 1 -> 2 -> 3 -> 1 ;
        // System.out.println(ll.detectLoop(head));
        // ********************************************************
        // ll.removeLoop(head);
        // System.out.println(ll.detectLoop(head));
        // *******************************************************

        // ********************************* MERGE SORT *************************
        // head = ll.mergeSort(head);
        // *************************************************************************

        // ***************************************** ZIG ZAG NODE ********************
        head = ll.zigZag(head) ;

        // System.out.println(head.data);
        // System.out.println(tail.data);
        // System.out.println("Size : " + size);
        ll.print();

    }
}
