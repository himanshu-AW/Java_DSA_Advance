public class KadansAlgo_MaxOfSubArr {
    static void kadansAlgo(int arr[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            currSum += arr[i];
            if (currSum < 0) {
                currSum = 0;
            }
            maxSum = Math.max(maxSum, currSum);
        }
        System.out.println("maxSum: " + maxSum);
    }

    public static void main(String[] args) {
        int arr[] = { -7, -3, -1, -5, 4, -2, 6, -3 };
        kadansAlgo(arr);
    }
}
