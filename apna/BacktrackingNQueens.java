package apna;

public class BacktrackingNQueens {
    static int count = 0 ;
    public static void nQueens(char chess[][] , int i) {
        
        // base case 
        if(i == chess.length) {
            count++ ;
            printBoard(chess) ;
            
            System.out.println(count);
            return ;
        }


        // recursion
        //column loop
        
        for(int j=0 ; j<chess.length ; j++) {
            if(isSafe(chess,i,j)) {
            chess[i][j] = 'Q' ;
            nQueens(chess, i+1);
            
            chess[i][j] = '.' ;
            }
        }
    
    }

     public static boolean nQueens1(char chess[][] , int i) {
        
        // base case 
        if(i == chess.length) {
            count++ ;
            //printBoard(chess) ;
            
            //System.out.println(count);
            return true ;
        }


        // recursion
        //column loop
        
        for(int j=0 ; j<chess.length ; j++) {
            if(isSafe(chess,i,j) == true) {
            chess[i][j] = 'Q' ;
            if(nQueens1(chess, i+1)){
                return true ;
            }
            
            chess[i][j] = '.' ;
            }
        }
        return false ;
    
    }

    public static boolean isSafe(char chess[][] , int i , int j) {
        // vertical up
        for(int row=i-1 ; row>=0 ; row--) {
            if(chess[row][j] == 'Q') {
                return false ;
            }
        }

        // left diag
        for(int row=i-1 , col = j-1 ; row>=0 && col>=0 ; row-- , col--) {
            if(chess[row][col] == 'Q') {
                return false ;
            }
        }

        // right diag
        for(int row=i-1 , col = j+1 ; row>=0 && col<chess.length ; row--,col++) {
            if(chess[row][col] == 'Q') {
                return false ;
            }
        }
        return true ;
    }

    public static void printBoard(char chess[][]) {
        
        System.out.println("*******************");
        for(int i=0 ; i<chess.length ; i++) {
            for(int j=0 ; j<chess.length ; j++) {
                System.out.print(chess[i][j] + " ");
            }
            System.out.println();
        }
        
    }
    
    
    public static void main(String[] args) {
        int n = 4 ;
        char chess[][] = new char[n][n] ;
        for(int i=0 ; i<n ; i++) {
            for(int j=0 ; j<n ; j++) {
                chess[i][j] = '.' ;
            }
        }

        // nQueens(chess,0) ;


        if(nQueens1(chess, 0) == true) {
            System.out.println("Answer is possible");
            printBoard(chess);
        }
        else {
            System.out.println("Answer is not possible");
        }
    }
}
