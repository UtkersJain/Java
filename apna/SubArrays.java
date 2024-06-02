package apna;

public class SubArrays {
    public static void subArrays(int num[]) {
        int total = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        for (int i = 0; i < num.length; i++) {
            // i---start
            for (int j = i; j < num.length; j++) {
                // j---end
                int sum = 0;
                for (int sub = i; sub <= j; sub++) {
                    System.out.print(num[sub] + "  ");
                    sum=sum+num[sub];

                }
                if(sum<min) {
                    min = sum;
                }
                if(sum>max) {
                    max = sum ;
                }
                System.out.print("Sum : "+sum);
                System.out.println();
                total++;
            }
            System.out.println();
        }
        System.out.println("Total subarrays : " + total);
        System.out.println("Min sum : "+min);
        System.out.print("Maximum sum : "+max);
    }

    public static void maxValue(int arr[]) {
        //int sum = 0 ;
        int maxSum = Integer.MIN_VALUE;
        //prefix array 
        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];
        for(int i= 1 ; i<arr.length ; i++) {
            prefix[i] = prefix[i-1] + arr[i];
        }
        
      
           
        for (int i=0 ; i<arr.length ; i++) {
            for(int j=i ; j<arr.length ; j++) {
                int sum = 0 ;
                sum = i==0 ? prefix[j] : prefix[j] - prefix[i-1];
                System.out.println(sum);
                if(sum>maxSum) {
                    maxSum=sum;
                }
                }
        }
        System.out.println("Max Sum : "+maxSum);
    
    }
    
    public static void kadanMethod(int arr[]) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        for (int i=0 ; i<arr.length ; i++ ) {
            currentSum = (currentSum+arr[i])<0 ? 0 : currentSum+arr[i];
            maxSum = Math.max(maxSum, currentSum);
        }
        System.out.println(maxSum);
    }
    public static void main(String args[]) {
        int num[] = { 2, 4 , 6 , 8, 10 };
        subArrays(num);
        //maxValue(num);
        //kadanMethod(num);
    }
}
