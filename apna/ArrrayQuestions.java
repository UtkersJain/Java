package apna;

public class ArrrayQuestions {
    public static boolean question1(int arr[]) {
        /*
        Given an integer array nums, return true if any value appears at least twice in the 
        array, and return false if every element is distinct.        
        */
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return true;
                } 
            }
        }    
        return false ;
    }

    public static int question2(int arr[],int element) {
        /*
         There is an integer array nums sorted in ascending order (with distinct values).
        Prior to being passed to your function, nums is possibly rotated at an unknown 
        pivot index k (1 <= k < nums.length) such that the resulting array is [nums[k], 
        nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). For 
        example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and 
        become [4,5,6,7,0,1,2].
        Given the array nums after the possible rotation and an integer target, return the 
        index of target if it is in nums, or -1 if it is not in nums.
        You must write an algorithm with O(log n) runtime complexity.
         */
        for(int i=0 ; i<arr.length ; i++) {
            if(arr[i]==element) {
                int position = i;
                return position ;
            }
        }
        return -1;
    }

    public static void question3() {
        /*
        You are given an array prices where prices[i] is the price of a given stock on 
        the ith day.
        Return the maximum profit you can achieve from this transaction. If you cannot 
        achieve any profit, return 0.
         */
        
        // Complete

    }

    public static void question5(int arr[]) {
        for(int i=0 ; i<arr.length ; i++) {
            for(int j=i+1 ; j<arr.length ; j++) {
                for(int k=j+1 ; k<arr.length ; k++) {
                    if((arr[i]+arr[j]+arr[k])==0){
                        System.out.print(arr[i]+","+arr[j]+","+arr[k]);
                    System.out.print(" |  ");
                    }
                }
                
            }
            System.out.println();
        } 
    }

    public static void main(Strings[] args) {
        // int num[] = { 1, 2, 3, 1 };
        // System.out.print(question1(num));
        int arr[] = {-1,0,1,2,-1,-4};
        //System.out.println(question2(arr, 0));
        //System.out.println(question2(arr, 3));
        question5(arr);
    }
}
