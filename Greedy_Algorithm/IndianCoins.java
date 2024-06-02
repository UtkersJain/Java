package Greedy_Algorithm;

import java.util.*;

public class IndianCoins {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 5, 10, 20, 50, 100, 500, 2000 };
        ArrayList<Integer> note = new ArrayList<>();
        int V = 1059 ;
        Arrays.sort(arr);
        int count = 0;
        int i = arr.length-1 ;
        while(i>=0 && V>0) {
            while (arr[i] <= V) {
                count++;
                V = V - arr[i];
                note.add(arr[i]);
            }
            i-- ;   
        }
        System.out.println(count);
        System.out.println(note);

    }
}
