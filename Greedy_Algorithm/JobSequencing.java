package Greedy_Algorithm;
import java.util.* ;
public class JobSequencing {
    
    
    // public static void main(String[] args) {
    //     int dead[] = {4,1,1,1} ;
    //     int profit[] = {20,10,40,30} ;
        
    //     int arr[][] = new int[4][3] ;
    //     for (int i = 0; i < arr.length; i++) {
    //         arr[i][0] = i ;
    //         arr[i][1] = dead[i] ;
    //         arr[i][2] = profit[i] ;
    //     }

    //     Arrays.sort(arr , Comparator.comparingDouble(o->o[2])) ;
        
    //     ArrayList<Integer> ans = new ArrayList<>() ;
    //     int i=arr.length-1 ;
        
    //     int time = arr[i][1] ;  // we have taken alread last job in array
    //     ans.add(arr[i][0]) ;
    //     int pr = arr[i][2] ;
        
    //     for (i = i-1 ; i >= 0 ; i--) {
    //         if(arr[i][1]>time) {
    //             ans.add(arr[i][0]) ;
    //             time += 1 ;
    //             pr += arr[i][2] ;
    //         }
    //     }
    //     System.out.println(ans);
    //     System.out.println(pr);
    // }


    static class Job {
        int idx ;
        int dead_line ;
        int profit ;

        public Job(int i , int j , int k) {
            idx = i ;
            dead_line = j ;
            profit = k ;
        }
    }

    public static void main(String[] args) {
        int jobs_arr[][] = {{4,20} , {1,10} , {1,40} , {1,30}} ;

        ArrayList<Job> jobs = new ArrayList<>() ;
        
        for (int i = 0; i < jobs_arr.length; i++) {
            jobs.add( new Job(i , jobs_arr[i][0] , jobs_arr[i][1])) ;
        }

        Collections.sort(jobs , (obj1 , obj2) -> obj2.profit - obj1.profit) ;

        int time = 0 ;
        ArrayList<Integer> seq  = new ArrayList<>() ;

        for (int i = 0; i < jobs.size(); i++) {
            Job curr = jobs.get(i) ;
            if(curr.dead_line>time) {
                seq.add(curr.idx) ;
                time++ ;
            }
        }

        System.out.println(seq);
    }
}
