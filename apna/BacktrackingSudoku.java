package apna;

public class BacktrackingSudoku {

    public static boolean isSafe(int sudoku[][] , int i , int j , int digit) {

        // column 
        for(int col = 0 ; col <= 8 ; col++) {
            if(sudoku[i][col] == digit) {
                return false ;
            }
        }

        // row
        for(int row = 0 ; row <= 8 ; row++) {
            if(sudoku[row][j] == digit) {
                return false ;
            }
        }

        // box
        int sr = (i/3)*3 ;
        int sc = (j/3)*3 ;

        for(int row = sr ; row <sr+3  ; row++) {
            for (int col = sc; col < sc+3 ; col++) {
                if(sudoku[row][col] == digit) {
                    return false ;
                }
            }
        }
        return true ;
    }
        
    public static boolean sudokuFill(int sudoku[][] , int i , int j) {
         
        //base case
        if(i == 9 ) {
            return true ;
        } 

        // recursion
        
        int row = i , col = j+1 ;
        if(col+1 == 9) {
            row = i + 1 ;
            col = 0 ;
        }
        
        if(sudoku[i][j] != 0) {
            return sudokuFill(sudoku, row, col) ;
        }
        
        for (int digit = 1 ; digit <= 9 ; digit++) {
            if(isSafe(sudoku,i,j,digit)) {
                sudoku[i][j] = digit ;
                if(sudokuFill(sudoku , row , col)) {
                    return true ;
                }
                sudoku[i][j] = 0 ;
            }            
        }
        return false ;    
    }

    public static void printSuddoku(int sudoku[][]) {
        for (int i = 0; i < sudoku.length; i++) {
            for (int j = 0; j < sudoku[0].length; j++) {
                System.out.print(sudoku[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int sudoku[][] = { { 0, 0, 8, 0, 0, 0, 0, 0, 0 },
                { 4, 9, 0, 1, 5, 7, 0, 0, 2 },
                { 0, 0, 3, 0, 0, 4, 1, 9, 0 },
                { 1, 8, 5, 0, 6, 0, 0, 2, 0 },
                { 0, 0, 0, 0, 2, 0, 0, 6, 0 },
                { 9, 6, 0, 4, 0, 5, 3, 0, 0 },
                { 0, 3, 0, 0, 7, 2, 0, 0, 4 },
                { 0, 4, 9, 0, 3, 0, 0, 5, 7 },
                { 8, 2, 7, 0, 0, 9, 0, 1, 3 } };

        if(sudokuFill(sudoku,0,0)) {
            System.out.println("Solution exists");
            printSuddoku(sudoku) ;
        } else {
            System.out.println("Solution doesnt exists");
        }
        
    }
}
