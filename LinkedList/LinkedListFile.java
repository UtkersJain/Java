
package LinkedList;

import java.util.LinkedList;

public class LinkedListFile {

    public static void main(String[] args) {

        // create
        LinkedList<Integer> ll = new LinkedList<>();

        // add
        ll.addLast(4);
        ll.addLast(5);
        ll.addFirst(2);

        System.out.println(ll);

        // ll.remove(1) ;

        // remove
        ll.removeLast() ;
        ll.removeFirst() ;

        System.out.println(ll);

        
    }

}
