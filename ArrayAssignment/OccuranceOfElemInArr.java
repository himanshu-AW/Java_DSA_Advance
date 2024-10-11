package ArrayAssignment;
// Question 1: Given an integer array nums, return true if any value appears at least twice in the 

// array, and return false if every element is distinct. 
// Example 1:
// Input: nums = [1, 2, 3, 1]
// Output: true
// Example 2:
// Input: nums = [1, 2, 3, 4]
// Output: false
// Example 3:
// Input: nums = [1, 1, 1, 3, 3, 4, 3, 2, 4, 2]
// Output: true

// Constraints:
// • 1 <= nums . lengtth <= 105
// • -109 <= nums [ i ] <= 109

import java.util.HashSet;

public class OccuranceOfElemInArr {
    static boolean isOccuranceOfElem(int nums[]) {

        if (nums.length == 0 || nums.length == 1)
            return false;

        HashSet<Integer> set = new HashSet<Integer>();
        for (int num : nums) {
            if (set.contains(num))
                return true;
            set.add(num);
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isOccuranceOfElem(new int[]{ 1, 2, 3, 4 }));
        System.out.println(isOccuranceOfElem(new int[]{1, 2, 3, 1}));
        System.out.println(isOccuranceOfElem(new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4,2}));

    }
}
