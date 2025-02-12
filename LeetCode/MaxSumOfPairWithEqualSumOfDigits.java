import java.util.HashMap;

public class MaxSumOfPairWithEqualSumOfDigits {
    public static void main(String[] args) {
        MaxSumOfPairWithEqualSumOfDigits obj = new MaxSumOfPairWithEqualSumOfDigits();
        
        // Test cases
        int[] nums1 = {51, 71, 17, 42};
        System.out.println("Maximum Sum (Test 1): " + obj.maximumSum(nums1)); // Expected: 93 (51 + 42)

        int[] nums2 = {42, 33, 60};
        System.out.println("Maximum Sum (Test 2): " + obj.maximumSum(nums2)); // Expected: 102 (42 + 60)

        int[] nums3 = {51, 32, 43};
        System.out.println("Maximum Sum (Test 3): " + obj.maximumSum(nums3)); // Expected: -1 (No pairs)

        int[] nums4 = {99, 99, 99, 99};
        System.out.println("Maximum Sum (Test 4): " + obj.maximumSum(nums4)); // Expected: 198 (99 + 99)

        int[] nums5 = {};
        System.out.println("Maximum Sum (Test 5): " + obj.maximumSum(nums5)); // Expected: -1 (Empty array)

        int[] nums6 = {100, 1000, 10, 1};
        System.out.println("Maximum Sum (Test 6): " + obj.maximumSum(nums6)); // Expected: -1 (No pairs)
    }

    private int sumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    public int maximumSum(int[] nums) {
        // Edge Case: If nums is null or length is less than 2, return -1
        if (nums == null || nums.length < 2) {
            return -1;
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        int maxSum = -1;
        
        for (int elem : nums) {
            int digitSum = sumOfDigits(elem);
            if (map.containsKey(digitSum)) {
                // Update the maximum sum of pairs with the same digit sum
                maxSum = Math.max(maxSum, elem + map.get(digitSum));
                // Store the maximum element for the digit sum
                if (map.get(digitSum) < elem) {
                    map.put(digitSum, elem);
                }
            } else {
                map.put(digitSum, elem);
            }
        }
        
        return maxSum;
    }
}
