package apna;

public class DACQuickSort {
    public static void quickSort(int arr[] , int si , int ei) {
        if(si>=ei) {
            return ;
        }
        
        int index = partition(arr,si,ei) ;
        quickSort(arr, si, index-1);
        quickSort(arr,index+1,ei) ;
    }

    public static int partition(int arr[] , int si , int ei) {
        int pivot = arr[ei] ;
        int i = si-1 ;
        
        for(int j=si ; j<ei ; j++) {
            if(arr[j]<=pivot) {
                i++ ;

                //swap
                int tmp = arr[j] ;
                arr[j] = arr[i] ;
                arr[i] = tmp ;
            }
        }
        
        // swap for pivot
        i++ ;
        int tmp = pivot ;
        arr[ei] = arr[i] ;
        arr[i] = tmp ;
        return i ;
    }

    public static void printArr(int arr[]) {
        for(int i=0 ; i<arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {6,3,9,2,8,5} ;
        quickSort(arr, 0, arr.length-1);
        printArr(arr);
    }
}
    