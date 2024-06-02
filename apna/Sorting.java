package apna;
import java.util.Arrays ;
import java.util.Collections ;
public class Sorting {
    public static void Sort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }

    public static void bubbleSort(int arr[]) {
        for (int i = 0; i <= arr.length - 2; i++) {
            int swap = 0;
            for (int j = 0; j <= arr.length - 2 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                    swap += 1;
                }

            }
            if (swap == 0) {
                System.out.println("Array is already sorted");
                break;
            }
        }
    }

    public static void selectionSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }
            // swap
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }

    public static void insertionSort(int arr[]) {
        for(int i=1 ; i<arr.length ; i++) {
            int curr = arr[i];
            int j=i ;
            while(j>0) {
                if(arr[j-1]>curr) {
                    arr[j] = arr[j-1] ;
                    arr[j-1] = curr ;
                }
                j--;
            }
        }
    }

    public static void countingSort(int arr[]) {
        int largest = Integer.MIN_VALUE ;
        //int min = Integer.MAX_VALUE ;
        for(int i=0 ; i<arr.length ; i++) {
            largest = Math.max(arr[i],largest);
        }
        
        int nw[] = new int[largest+1] ;
        for(int k=0 ; k<nw.length ; k++ ) {
            
            nw[k]=0 ;
            for(int i=0 ; i<arr.length ; i++) {
                if(arr[i]==k) {
                    nw[k]+=1;         //nw[arr[i]]++
                }
            }
        }
        
        //sorting
        int j=0 ;
        for(int i=0 ; i<nw.length ; i++) {
            while(nw[i]>0) {
                arr[j]=i;
                j++;
                nw[i]--;
            }
        }

    }


    
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(Strings args[]) {
        int num[] = { 1,4,1,3,2,4,3,7 };
        // Sort(num);
        // bubbleSort(num);
        // selectionSort(num);
        //insertionSort(num);
        //Arrays.sort(num);
        //Arrays.sort(num,0,3);
        //Arrays.sort(num,4,num.length,Collections.reverseOrder());
        countingSort(num);

        printArray(num);
    }
}
