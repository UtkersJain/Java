package apna;
import java.util.*;
public class TrappingRainWater {
    public static void trappingRainWaterByMe(int arr[]) {
        int trap = 0;
        for (int i = 0; i < arr.length; i++) {
            int maxRight = 0;
            int maxLeft = 0;
            
            for (int j = 0; j < i; j++) {
                maxLeft = Math.max(maxLeft, arr[j]);
            }
            for (int k = i + 1; k < arr.length; k++) {
                maxRight = Math.max(maxRight, arr[k]);
            }
            if(arr[i]<maxLeft && arr[i]<maxRight) {
            trap = (i==0 || i==(arr.length-1)) ? trap : trap + ((Math.min(maxRight, maxLeft))-arr[i]);
            }
            System.out.println(trap);
        }
        System.out.println(trap);
    }

    public static void trappingRainWater(int arr[]) {
        
        //left array
        int leftMax[] = new int[arr.length];
        leftMax[0] = arr[0];
        for(int i=1 ; i<arr.length ; i++) {
            leftMax[i] =  Math.max(arr[i], leftMax[i-1]);
        }

        //right arry
        int rightMax[] = new int[arr.length];
        rightMax[arr.length-1] = arr[arr.length-1] ;
        for(int i=arr.length-2 ; i>=0 ; i--) {
            rightMax[i] = Math.max(arr[i], rightMax[i+1]) ; 
        }
        int trap = 0;
        for(int i=0 ; i<arr.length ; i++) {
            int waterLevel = Math.min(leftMax[i],rightMax[i]) ; 
            trap += waterLevel-arr[i] ;
            
        }
        System.out.println(trap);
    }

    public static void main(Strings args[]) {
        int num[] = { 4, 2, 0, 6, 3, 2, 5 };
        trappingRainWater(num);
    }
}
