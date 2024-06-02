package Queue;
import java.util.* ;
public class ReverseKElements {
    
    public static void reverseK(int k , Queue<Integer> q) {
        
        int size = q.size() ;

        if(k>size || q.isEmpty() || k<0){
            System.out.println("Wrong error");
            return;
        }

        Stack<Integer> helper = new Stack<>() ;
        
        
        // reverse K
        for (int i = 0; i < k ; i++) {
            helper.push(q.remove()) ;
        }

        // making reverse queue
        while(!helper.isEmpty()) {
            q.add(helper.pop()) ;
        }
        
        for (int i = 0; i < size - k; i++) {
            q.add(q.remove());
        }

        System.out.println(q);

    }
    
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>() ;
        q.add(10) ;
        q.add(20) ;
        q.add(30) ;
        q.add(40) ;
        q.add(50) ;
        q.add(60) ;
        q.add(70) ;
        q.add(80) ;
        q.add(90) ;
        q.add(100) ;

        Scanner sc = new Scanner(System.in) ;
        int k = sc.nextInt() ;

        reverseK(k,q) ;

        
    }
}
