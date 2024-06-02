package Greedy_Algorithm;
import java.util.* ;
public class ChocolaProblem {
    public static void main(String[] args) {
        Integer hor[] = {4,1,2} ;
        Integer ver[] = {2,1,3,1,4} ;

        Arrays.sort(ver , Comparator.reverseOrder()) ;
        Arrays.sort(hor , Comparator.reverseOrder()) ;

        int h = 0 ;
        int v = 0 ;

        int hp = 1 ;
        int vp = 1 ;
        
        int cost = 0 ;

        while(h<hor.length && v<ver.length) {
            if(hor[h]>ver[v]) {
                cost += (vp * hor[h]) ;
                hp++ ;
                h++ ;
            } 
            else {
                cost += (hp * ver[v]) ;
                vp++ ;
                v++ ;
            } 
        }

        while(h<hor.length) {
            cost += (vp * hor[h]) ;
            hp++ ;
            h++ ;
        }
        while(v<ver.length) {
            cost += (hp * ver[v]) ;
            vp++ ;
            v++ ; 
        }

        System.out.println(cost);
    }
}
