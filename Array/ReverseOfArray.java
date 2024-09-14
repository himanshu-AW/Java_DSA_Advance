// You are given an array of integers arr . Your task is to reverse the given array and return the reversed array.

// Examples:

// Input: arr = [1, 2, 3, 4]
// Output: [4, 3, 2, 1]
// Explanation: The elements of the array are 1 2 3 4. After reversing the array, the first element goes to the last position,
// the second element goes to the second last position and so on. Hence, the answer is 4 3 2 1.
// Input: arr = [1]
// Output: [1]
// Explanation: The array has only single element, hence the reversed array is same as the original.
// Expected Time Complexity: O(n)
// Expected Space Complexity: O(1)

// Constraints:
// 1<=arr.size()<=105
// 0<=arr[i]<=10

public class ReverseOfArray {
    public int[] reverseArray(int arr[]) {
        // code here
        int start = 0;
        int last = arr.length -1;
        
        while(last>start){
            int temp = arr[start];
            arr[start] = arr[last];
            arr[last] = temp;
            start++;
            last--;
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        ReverseOfArray obj = new ReverseOfArray();
        int[] ans =obj.reverseArray(arr);
        System.out.println("Reverse of Given array:-");
        for(int i=0; i<ans.length; i++){
            System.out.print(ans[i]+" ");
        }
    }
}
