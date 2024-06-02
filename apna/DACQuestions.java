package apna;

public class DACQuestions {
    
    // Question1:
    // Apply Merge sort to sort an array of Strings.(Assume that all the characters in all the Strings are in lowercase).
    public static void sort(String arr[] , int si , int ei) {
        // base case
        if(si>=ei) {
            return ;
        }
        
        // kaam
        int mid = si + (ei-si)/2 ;
        sort(arr, si, mid);   // left part
        sort(arr, mid+1, ei);   // right part
        merge(arr,mid,si,ei) ;
    }

    public static void merge(String arr[] , int mid , int si , int ei) {
        String tmp[] = new String[ei-si+1] ;
        int i = si ;
        int j = mid+1 ;
        int k = 0 ;
        
        while (i<=mid && j<=ei ) {
            if(arr[i].compareTo(arr[j])<0) {
                tmp[k++] = arr[i++] ;
            }
            else {
                tmp[k++] = arr[j++] ;
            }
        }

        // left element remains
        while(i<=mid) {
            tmp[k++] = arr[i++] ;
        }

        // rigt element remains
        while(j<=ei) {
            tmp[k++] = arr[j++] ;
        }

        // copy arr to original array
        for(k=0 , i=si ; k<tmp.length ; k++,i++) {
            arr[i] = tmp[k] ;
        }
    }

    public static void printArr(String arr[]) {
        for(int i=0 ; i<arr.length ; i++ ) {
            System.out.print(arr[i] + " ");
        }
    }

    // Question 2 :
    // Given an array nums of size n, return the majority element.
    // Sample Input 1 : nums = [3,2,3
    // Sample Output 1 : 3

   

    public static void main(String[] args) {
        String arr[] = {"sun" , "earth" , "mars" , "mercury"} ;
        sort(arr, 0, arr.length-1);
        printArr(arr);

        int arr[] = {2,1,2,1,2,2};
    }

}
