package apna;

public class SearchInSortedMatrix2D {
    public static void search(int matrix[][], int element) {
        int m = matrix.length - 1 ; //row
        int n = matrix[0].length - 1; //column
        int i = 0;
        int j = n;
        
        

        while (i <= m && j >= 0) {
            int curr = matrix[i][j];
            if (element == curr) {
                System.out.println("Element Found At index : " + i + "," + j);
                

                break ;
                
            } else if (element < curr) {
                j--;
            } else {
                i++;
            }
            
        }
        if (i == m + 1) {
            System.out.println("Element Not Find ");
        }
        
    }

    public static void main(Strings[] args) {
        int matrix[][] = {{4,7,8},
                          {8,8,7}
                          };
        search(matrix, 7);

        
    }
}
