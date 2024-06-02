package apna;

public class binarySearch {
    public static int binarysearch(int arr[], int key) {
        int start = 0;
        int end = arr.length-1 ;
        while (start <= end) {
            int mid = (start+end) / 2;

            // comparisions
            if (arr[mid] == key) {
                return mid;
            }
            if (arr[mid] >= key) {
                end = mid-1 ;
            } else {
                start = mid+1 ;
            }
        }
        return -1;
    }

    public static void main(Strings args[]) {
        int arr[] = { 1, 2, 3, 7, 4, 6, 10, 11 };
        int key = 7;
        System.out.println(binarysearch(arr, key));

    }

}
