package BackTracking;

// 78. Subsets
// Given an integer array nums of unique elements, return all possible 
// subsets
//  (the power set).

// The solution set must not contain duplicate subsets. Return the solution in any order.
 
// Example 1:

// Input: nums = [1,2,3]
// Output: [[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]
// Example 2:

// Input: nums = [0]
// Output: [[],[0]]
 
// Constraints:

// 1 <= nums.length <= 10
// -10 <= nums[i] <= 10
// All the numbers of nums are unique.

import java.util.ArrayList;
import java.util.List;

public class Subsets {

    private void subsetsHelper(int nums[], int i, List<Integer> list, List<List<Integer>> listOfList) {
        // Base case: If we have considered all elements
        if (i == nums.length) {
            listOfList.add(new ArrayList<>(list));  // Add a copy of list to listOfList
            return;
        }

        // Exclude the current element
        subsetsHelper(nums, i + 1, list, listOfList);

        // Include the current element
        list.add(nums[i]);
        
        subsetsHelper(nums, i + 1, list, listOfList);

        // Backtrack: Remove the last added element before returning
        list.remove(list.size() - 1); // Remove last added element to explore other subsets
    }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> listOfList = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        subsetsHelper(nums, 0, list, listOfList);
        return listOfList;
    }

    public static void main(String[] args) {
        Subsets subsets = new Subsets();
        int[] nums = {1, 2, 3};
        List<List<Integer>> result = subsets.subsets(nums);
        System.out.println(result); // Output: [[], [1], [1, 2], [1, 2, 3], [1, 3], [2], [2, 3], [3]]
    }
}
