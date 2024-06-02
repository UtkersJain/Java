import java.util.* ;
public class Solution {
    // public int lengthOfLongestSubstring(String s) {
        
    //     if(s.isEmpty()) {
    //         return 0 ;
    //     }
    //     int arr[] =  new int[26] ;
    //     int count = 0 ;
    //     int max = 1 ;
    //     int i=0 ;
    //     for(i=0 ; i<s.length() ; i++) {
    //        char ch = s.charAt(i) ;
    //        if(ch==' ') {
    //         continue ;
    //        }
    //        if(arr[ch-'a']>0) {
    //         max = Integer.max(max,count) ;
    //         count = 0 ;
    //        }
    //        arr[ch-'a'] += 1 ;
    //        count++ ;    
    //     }
        
        
    //     return Integer.max(max,count) ;
    // }

    public static int sum(int arr[] , int n) {
        if(n==0) {
            return arr[0] ;
        }

        int sum = arr[n] + sum(arr,n-1) ;
        return sum ;
    }

    public static void main(String[] args) {
        Integer hc[] = {4,1,2} ;
        Integer vc[] = {2,1,3,1,4} ; 

        Arrays.sort(hc,Comparator.reverseOrder()) ;
        Arrays.sort(vc,Comparator.reverseOrder()) ;

        int h=0 ;
        int v = 0 ;
        int hp = 1 ; int vp = 1 ;

        int cost = 0 ;

        while(h<hc.length && v<vc.length) {
            if(hc[h]>vc[v]) {
                cost += (hc[h]*vp) ;
                hp++ ;
                h++ ;
            } else {
                cost += (vc[v]*hp) ;
                vp++ ;
                v++ ;
            }
        }

        while(h<hc.length) {
            cost += (hc[h]*vp) ;
            hp++ ;
            h++ ;
        }
        while(v<vc.length) {
            cost += (vc[v]*hp) ;
            vp++ ;
            v++ ;
        }

        System.out.println(cost);
    }
}