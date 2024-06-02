package apna;

public class DACSearchArray {
    public static int search(int arr[], int tar, int si, int ei) {
        // base case
        if(si>ei) {
            return -1 ;
        } 



        // kaam
        int mid = si + (ei - si) / 2;

        if (arr[mid] == tar) {
            return mid;
        }

        //case a : Mid on L1
        if(arr[si]<=mid) {
            //case 1 : left side of mid on l1
            if(arr[si]<=tar && tar<=arr[mid]) {
                return search(arr, tar, si, mid-1) ;
            }
            //case 2 : right side of mid 
            else {
                return search(arr, tar, mid+1, ei) ;
            }
        }

        //case b : Mid on L2
        else {
            //case 1 : right side of mid on L2
            if(arr[mid]<=tar && tar<=arr[ei] ) {
                return search(arr, tar, mid+1, ei) ;
            }
            else {
                return search(arr, tar, si, mid-1) ;
            }
        }
    
    }


    // Using loops
    // public static int search(int arr[] , int tar , int si , int ei ) {
        
    //     while(si<=ei) {
    //         int mid = si + (ei-si)/2 ;
    //         if(arr[mid] == tar) {
    //             return mid ; 
    //         }

    //         if(arr[si]<=mid) {
    //             if(arr[si]<=tar && tar<=arr[mid]) {
    //                 ei = mid-1 ;
                    
    //             }
    //             else {
    //                 si = mid+1 ;
                    
    //             }
    //         }
    //         else {
    //             if(arr[mid]<=tar && tar<=arr[ei] ) {
    //                 si = mid + 1 ;
                    
    //             }
    //             else {
    //                 ei = mid -1 ;
                    
    //             }
    //         }
        
    //     }
    //     return -1 ;
    // }

    

    public static void main(String[] args) {
        int arr[] = {4,5,6,0,1,2,3} ;
        int tar = 6 ;
        System.out.println(search(arr, tar, 0, arr.length-1));
    }
}
