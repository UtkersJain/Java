package apna ;
public class ro {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
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

        int mid = k / 2;
        if (k % 2 != 0) {
            return arr[mid];
        } else {
            int m = (k + 1) / 2;
            int n = arr[m];
            return (mid + n) / 2;
        }

    }
    public static void main(String[] args) {
        int num[] = {1,2} ;
        int num1[] = {3,4} ;
        System.out.println(findMedianSortedArrays(num,num1));

    }
}