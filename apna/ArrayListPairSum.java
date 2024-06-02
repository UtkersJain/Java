package apna;

import java.util.*;

public class ArrayListPairSum {
    // sorted array
    public static boolean pairSum1(ArrayList<Integer> list, int target) {
        int lp = 0;
        int rp = list.size() - 1;

        while (lp < rp) {
            int sum = list.get(lp) + list.get(rp);

            if (sum == target) {
                return true;
            } else {
                if (sum > target) {
                    rp--;
                } else {
                    lp++;
                }
            }
        }
        return false;
    }

    // sorted and rotated
    public static boolean pairSum2(ArrayList<Integer> list , int target) {
        int i = 0 ;     // breaking point
        for (i = 0; i < list.size(); i++) {
            if(list.get(i)>list.get(i+1)) {
                break ;
            }
        }
        int lp = i+1 ;    // smallest
        int rp = i ;      // largest
        int n = list.size() ;

        while(lp != rp) {
            int sum = list.get(lp) + list.get(rp) ;
            
            // case 1 
            if(sum == target) {
                return true ;
            }
            
            // case 2
            if(sum>target) {
                rp = (n+rp-1)%n ;      // rp--
            }
            else {
                lp = (lp+1)%n ;         // lp++
            }
        }
        return false ;
    }

    public static void main(String[] args) {
        // ArrayList<Integer> list = new ArrayList<>();
        // list.add(1);
        // list.add(2);
        // list.add(3);
        // list.add(4);
        // list.add(5);
        // list.add(6);
        // System.out.println(pairSum1(list, 5));

        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        System.out.println(pairSum2(list, 16));

    }
}
