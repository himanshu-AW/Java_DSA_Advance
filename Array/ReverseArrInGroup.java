// Given an array arr of positive integers. Reverse every sub-array group of size k.

// Note: If at any instance, k is greater or equal to the array size, then reverse the entire array. You shouldn't return any array, modify the given array in place.

// Examples:

// Input: k = 3, arr= [1, 2, 3, 4, 5]
// Output: [3, 2, 1, 5, 4]
// Explanation: First group consists of elements 1, 2, 3. Second group consists of 4,5.
// Input: k = 5, arr = [5, 6, 8, 9]
// Output: [9, 8, 6, 5]
// Explnation: Since k is greater than array size, the entire array is reversed.
// Expected Time Complexity: O(n)
// Expected Auxiliary Space: O(1)

// Constraints:
// 1 ≤ arr.size(), k ≤ 107
// 1 ≤ arr[i] ≤ 1018

import java.util.ArrayList;

public class ReverseArrInGroup {
    // Helper function to reverse a sub-array from start to end.
    void reverseSubArray(ArrayList<Long> arr,int n, int i,int j) {
        while(i<j){
            long temp = arr.get(i);
            arr.set(i,arr.get(j));
            arr.set(j, temp);
            i++;
            j--;
        }
        return;
    }
    // Function to reverse every sub-array group of size k.
    void reverseInGroups(ArrayList<Long> arr, int k) {
        int n=arr.size();
        for(int i=0;i<n;i+=k){
            int j=Math.min(i+k-1,n-1);
            reverseSubArray(arr, n, i, j); // Reverse the sub-array from i to j.
        }
        return;
    }
    public static void main(String[] args) {
        ReverseArrInGroup obj = new ReverseArrInGroup();
        ArrayList<Long> arr = new ArrayList<>();
        arr.add(1L);
        arr.add(2L);
        arr.add(3L);
        arr.add(4L);
        arr.add(5L);
        int k = 3;
        System.out.println(arr); // input: [1, 2, 3, 5, 4]
        obj.reverseInGroups(arr, k);
        System.out.println(arr); // Expected output: [3, 2, 1, 5, 4]
        
    }
}
