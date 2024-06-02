package apna;
import java.util.* ;

public class ArrayListMostWater {
        
    public static void bruteCode() {
        ArrayList<Integer> list = new ArrayList<>() ;
        list.add(1) ;
        list.add(8) ;
        list.add(6) ;
        list.add(2) ;
        list.add(5) ;
        list.add(4) ;
        list.add(8) ;
        list.add(3) ;
        list.add(7) ;
        System.out.println(list);

        int max = Integer.MIN_VALUE ;
        for (int i = 0 ; i < list.size(); i++) {
            for (int j = i+1 ; j < list.size() ; j++) {
                int width = j-i ;
                int height = Math.min(list.get(i) , list.get(j)) ;
                int area = width * height ;
                max = Math.max(max, area) ;
            }
        }
        System.out.println(max);
    } 

    // 2 pointer approach
    public static int storeWater(ArrayList<Integer> height) {
        int lp = 0 ;
        int rp = height.size()-1 ;
        int maxArea = Integer.MIN_VALUE ;
        while(lp<rp) {
            int width = rp-lp ;
            int length = (height.get(lp)>height.get(rp)) ? height.get(rp) : height.get(lp) ;
            int curArea = width * length ;
            maxArea = Math.max(maxArea, curArea) ;
            if(height.get(lp)>height.get(rp)) {
                rp-- ;
            }
            else{
                lp++ ;
            }
        }
        return maxArea ;
    }
    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>() ;
        height.add(1) ;
        height.add(8) ;
        height.add(6) ;
        height.add(2) ;
        height.add(5) ;
        height.add(4) ;
        height.add(8) ;
        height.add(3) ;
        height.add(7) ;
        System.out.println(storeWater(height));
    }
}
