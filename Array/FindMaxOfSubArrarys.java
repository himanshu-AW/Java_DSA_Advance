public class FindMaxOfSubArrarys {
    // Function to find maximum sum of subarrays
    static void fintMaxSumOfSubArrays(int arr[]) {
        int n = arr.length;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[n];

        prefix[0] = arr[0];
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        for (int i = 0; i < n; i++) {
            int startIndex = i;
            int currSum = 0;
            for (int j = i; j < n; j++) {
                int endIndex = j;
                currSum = startIndex == 0 ? prefix[endIndex]
                        : prefix[endIndex] -
                                prefix[startIndex - 1];
                maxSum = Math.max(maxSum, currSum);
            }
        }
        System.out.println("Max sum: " + maxSum);
    }

    public static void main(String[] args) {
        int arr[] = { 1, -2, 6, -1, 3 };
        fintMaxSumOfSubArrays(arr);
    }
}
