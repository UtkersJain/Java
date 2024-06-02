package apna;

public class BacktrackingGridWays {
    
    public static int gridWays(int i , int j , int n , int m) {
        // base case
        if(i==n-1 && j==m-1) {
            return 1 ;
        }
        else if( i==n  || j==m) {
            return 0 ;
        }


        // recursion 
        int w1 = gridWays(i, j+1, n, m) ;   // right move
        int w2 = gridWays(i+1, j, n, m) ;   // down move

        return w1 + w2 ;
    }

    public static int shortGridWays(int )
    
    
    public static void main(String[] args) {
        int n = (int) Math.pow(10, 2) ;
        int m = (int) Math.pow(10, 2) ;
        
        //int grid[][] = new int[n][m] ;
        System.out.println(gridWays(0 , 0 , n , m)) ;
    }
}
