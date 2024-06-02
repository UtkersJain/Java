import java.util.Arrays;

public class OptimalMergePattern {

    public static int minComputation(int[] files) {
        
        Arrays.sort(files);

        // Initialize total computations
        int totalComputations = 0;

        // We need to merge (n - 1) times for n files
        for (int i = 1; i < files.length; i++) {
            // Merge the first two smallest files
            int mergedFile = files[i - 1] + files[i];

            // Add the merged file size to the total computations
            totalComputations += mergedFile;

            // Update the next element in the array to be the merged file size
            files[i] = mergedFile; 

            // Move the smallest merged file to the correct position
            int j = i;
            while (j > 1 && files[j] < files[j - 1]) {
                int temp = files[j];
                files[j] = files[j - 1];
                files[j - 1] = temp;
                j--;
            }
        }

        return totalComputations;
    }

    public static void main(String[] args) {
        int[] files = {2, 3, 4, 5, 6, 7};
        int result = minComputation(files);
        System.out.println("Minimum computations to reach Optimal Merge Pattern: " + result);
    }
}
