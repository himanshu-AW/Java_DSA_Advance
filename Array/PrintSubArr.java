public class PrintSubArr {

    // Function to print all subarrays
    public static void printSubarrays(int arr[]) {
        int n = arr.length;
        int totalSubArr = 0;

        for (int i = 0; i < n; i++) {
            int startIndex = i;
            for (int j = i; j < n; j++) {
                int endIndex = j;
                System.out.print("[ ");
                for (int k = startIndex; k <= endIndex; k++) {
                    System.out.print(arr[k] + " ");
                }
                totalSubArr++;
                System.out.println("]");
            }
            System.out.println();
        }
        System.out.println("Total subarrays: "+totalSubArr);
    }

    
    public static void findMinSumMaxSumOfSubArr(int arr[]) {
        int n = arr.length;
        int minSum=Integer.MAX_VALUE;
        int maxSum=Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int startIndex = i;
            for (int j = i; j < n; j++) {
                int endIndex = j;
                int sum=0;
                for (int k = startIndex; k <= endIndex; k++) {
                   sum += arr[k];
                }
                minSum = Math.min(minSum, sum);
                maxSum = Math.max(maxSum, sum);
            }
            // System.out.println();
        }
        System.out.println("Minimum sum of subarrays: "+minSum);
        System.out.println("Maximum sum of subarrays: "+maxSum);
    }

    public static void main(String[] args) {
        // int arr[] = { 2, 3, 4, 5, 6 };
        int arr[] = { 1, -3,6,-1,3 };
        printSubarrays(arr);
        findMinSumMaxSumOfSubArr(arr);
    }
}