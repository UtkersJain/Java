package apna;
import java.util.* ;
public class ArrayListQuestion {
    
    // Question 1 (Monotonic ArrayList)
    public static boolean monotonicList(ArrayList<Integer> list) {
        int i = 1 ;
        
        // case 1      ---- increasing monotonic       
        if(list.get(0) <= list.get(1)) {
            while(i<list.size()-1) {
                
                if(list.get(i) > list.get(i+1)) {
                    return false ;
                }

                i++ ;
                
            }
        }

        // case 2       --- decreasing monotonic 
        if(list.get(0) > list.get(1)) {
            while(i<list.size()-1) {
                
                if(list.get(i) < list.get(i)) {
                    return false ;
                }
                i++ ;
                
            }
        }
        return true ;
        
    }

    // Question 2 :
    // Lonely Numbers in ArrayList
    public static ArrayList<Integer> lonely(ArrayList<Integer> list) {
        
        ArrayList<Integer> newList = new ArrayList<>() ;
        if((list.get(1)!=list.get(0)-1) || (list.get(1)!=list.get(0)+1) ) {
            newList.add(list.get(0)) ;
        }
        for (int i = 1 ; i < list.size()-1 ; i++) {
            int num = list.get(i) ;
            if((list.get(i-1)!=num-1 || (list.get(i-1)!=num+1))  (list.get(i+1)!=num-1 || (list.get(i+1)!=num+1))) {
                
                newList.add(num) ;
                
            }   
            
        }
        return newList ;

        // int temp = list.get(0) ;
        // if()
        // for (int i = 1 ; i < list.size()-1 ; i++) {
            
        //     if(list.get(i-1)-1 != list.get(i) && list.get(i) != list.get(i+1) +1) {
        //         System.out.print(list.get(i) + " ");
        //     }
        // }
    }
    
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>() ;
        list.add(10) ;
        list.add(6) ;
        list.add(5) ;
        list.add(8) ;
        // list.add(4) ;
        // System.out.println(monotonicList(list));
        System.out.println(lonely(list));
    }
}
