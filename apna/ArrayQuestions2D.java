package apna;

public class ArrayQuestions2D {
    public static void ques1(int matrix[][], int element) {
        int count = 0 ;
        for(int i=0 ; i<matrix.length ; i++) {  
            for(int j=0 ; j<matrix[0].length ; j++) {
                if(matrix[i][j]==element) {
                    count++ ;
                }
            }
        }
        System.out.println("Number of "+element+" is : "+count);
    }

    public static void ques2(int matrix[][]) {
        int count = 0 ;
        
            for(int j=0 ; j<matrix[0].length ; j++) {
                
                    count+=matrix[1][j] ;
                
            }
    
        System.out.println("Sum of Number of 2nd row is : "+count);
    }

    //Transpose of matrix
    
    public static void ques3ByMe(int matrix[][]) {
        int n = matrix.length ;         //row
        int m = matrix[0].length ;      //coloumn
        int linearArray[] = new int[m*n] ;
        int k = 0 ;  //linear array index
        for(int i=0 ; i<n ; i++) {  
            for(int j=0 ; j<m ; j++) {
                linearArray[k] = matrix[i][j] ;
                k++ ; 
            }
        }
        int transposeArray[][] = new int[m][n] ;
        int h = 0 ;  //linear array index
        for(int j=0 ; j<transposeArray[0].length ; j++) {
            for(int i=0 ; i<transposeArray.length ; i++) {
                transposeArray[i][j] = linearArray[h] ;
                h++ ;
                
            }
            System.out.println();
        }

        for(int i=0 ; i<m ; i++) {  
            for(int j=0 ; j<n ; j++) {
                System.out.print(transposeArray[i][j]+" ");
            }
            System.out.println();
        }

        
        
    }

    public static void ques3(int matrix[][]) {
        int n = matrix.length ;         //row
        int m = matrix[0].length ; 
        int transposeArray[][] = new int[m][n] ;     //coloumn
        for(int i=0 ; i<n ; i++) {  
            for(int j=0 ; j<m ; j++) {
                transposeArray[j][i] = matrix[i][j] ;
            }
        }
       
        
        

        for(int i=0 ; i<m ; i++) {  
            for(int j=0 ; j<n ; j++) {
                System.out.print(transposeArray[i][j]+" ");
            }
            System.out.println();
        }

        
        
    }

    public static void main(Strings[] args) {
        int matrix[][] = {{4,7,8},
                          {8,8,7}};
        //ques1(matrix, 7);
        //ques2(matrix);
        ques3(matrix);
    }
}
