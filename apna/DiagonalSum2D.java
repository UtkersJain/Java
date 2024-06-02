package apna;

public class DiagonalSum2D {
    public static void printDiagonalSum(int matrix[][]) {
        int sum = 0;
        //int col = matrix[0].length - 1;
        //int row = matrix.length - 1;
        //for (int i = 0; i <= row; i++) {
        //    for (int j = 0; j <= col; j++) {
        //        if (i == j || (i + j) == row) {
        //            /*if(i==j && i+j==row) {
        //                break ;
        //            }*/
        //            System.out.print(matrix[i][j]+" ");
        //            sum += matrix[i][j];
        //        }
        //    }
        //}
        
        //less time complexity
        for(int i=0; i<matrix.length ; i++) {
            //pd
            sum+=matrix[i][i] ;

            //sd
            if(i != matrix.length-1-i)
                sum+=matrix[i][matrix.length-1-i];
        }
        System.out.println(sum);
    }

    public static void main(Strings[] args) {
        int matrix[][] = { { 0, 1, 2 },
                { 3, 4, 5 },
                { 6, 7, 8 } };
        printDiagonalSum(matrix);
    }
}
