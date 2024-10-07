public class MissingNumber {
    public static int findMissingNum(int arr[]) {
        int n = arr.length;
        int total = (n + 1) * (n + 2) / 2;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        return total - sum;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 5, 6, 7, 8 };

        System.out.println("Missing Number is " + findMissingNum(arr));
    }
}
