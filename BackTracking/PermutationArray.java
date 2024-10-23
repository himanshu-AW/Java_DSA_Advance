package BackTracking;

import java.util.ArrayList;
import java.util.List;

public class PermutationArray {
    private static void backtrack(int[] nums,boolean[] used,List<Integer> tempList, List<List<Integer>> result){
         // Base case: if the current list size equals nums length, we found a valid permutation
         if (tempList.size() == nums.length) {
            result.add(new ArrayList<>(tempList)); // Add the current permutation to the result list
        } else {
            // Try to add each unused number to the permutation
            for (int i = 0; i < nums.length; i++) {
               if(used[i]) continue; // skip no. already used

            //add number and mark it
            tempList.add(nums[i]);
            used[i]=true;

            backtrack(nums, used, tempList, result);

            // remove it from the result list
            tempList.remove(tempList.size() - 1);
            used[i]=false; // backtrack: remove the last added element before returning
            }
        }
    }
    public static List<List<Integer>> permute(int[] nums){
        List<List<Integer>> result = new ArrayList<>();
        if(nums.length==0) return result;
        boolean[] used=new boolean[nums.length];
        backtrack(nums,used, new ArrayList<>(), result);
        return result;
    }
    public static void main(String[] args) {
         // Test case 1
        int[] nums1 = {1, 2, 3};
        System.out.println("Permutations for nums = [1,2,3]:");
        List<List<Integer>> permutations1 = PermutationArray.permute(nums1);
        System.out.println(permutations1);

        // Test case 2
        int[] nums2 = {0, 1};
        System.out.println("\nPermutations for nums = [0,1]:");
        List<List<Integer>> permutations2 = PermutationArray.permute(nums2);
        System.out.println(permutations2);

        // Test case 3
        int[] nums3 = {1};
        System.out.println("\nPermutations for nums = [1]:");
        List<List<Integer>> permutations3 = PermutationArray.permute(nums3);
        System.out.println(permutations3);
    }
}
