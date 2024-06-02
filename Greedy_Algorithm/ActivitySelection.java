package Greedy_Algorithm;
import java.util.* ;
public class ActivitySelection {
    
    public static int maxActivity(int start[] , int end[]) {
        
        // sorting
        int activities[][] = new int[start.length][3] ;
        for (int i = 0; i < start.length; i++) {
            activities[i][0] = i ;
            activities[i][1] = start[i] ;
            activities[i][2] = end[i] ;
        }

        // lamda function
        Arrays.sort(activities , Comparator.comparingDouble(o -> o[2])) ;
        
        
        ArrayList<Integer> activity = new ArrayList<>() ; 
        int i = 0 ;
        activity.add(activities[i][0]) ;
        int time = activities[i][2] ;  // we taken first activity
        int count = 1 ;
        for ( i=1 ; i<start.length ; i++) {
            if(activities[i][1]>=time) {
                activity.add(activities[i][0]) ;
                count++ ;
                time = activities[i][2] ;
            }
        }
        System.out.println(activity);
        return count ;
        
    } 
    public static void main(String[] args) {
        int start[] = {0,1,3,5,5,8} ;
        int end[] = {6,2,4,7,9,9} ;
        System.out.println("Max Activity : " + maxActivity(start,end));
    }
}
