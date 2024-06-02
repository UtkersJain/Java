package apna ;

import java.util.* ;
import org.apache.commons.math3.fraction.Fraction;


public class rou {
    public static void findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i = 0;
        int j = 0;
        int k = 0;
        int arr[] = new int[nums1.length + nums2.length];

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] <= nums2[j]) {
                arr[k++] = nums1[i++];
            } else {
                arr[k++] = nums2[j++];
            }
        }
        while (i < nums1.length) {
            arr[k++] = nums1[i++];
        }
        while (j < nums2.length) {
            arr[k++] = nums2[j++];
        }
        
        
        if ((k) % 2 != 0) {
            int mid = k / 2;
            System.out.println(arr[mid]);
        } else {
            int mid = arr[(k-1)/ 2];
            System.out.println(mid);
            int m = arr[k/ 2];
            System.out.println(m);
            double le = (mid+m)/2.0 ;
            System.out.println(le);
            
        }

    }
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>() ;
        for(int i=0 ; i<arr.lenngth-1 ; i++) {
            for(int j=i+1 ; j<arr.length ; j++) {
                Fraction fraction = new Fraction(i, j); 
                al.add(fraction) ;
            }
        }
        Collections.sort(al) ;
    }
}