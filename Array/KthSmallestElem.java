
// Given an array arr[] and an integer k where k is smaller than the size of the array, the task is to find the kth smallest element in the given array. It is given that all array elements are distinct.

// Follow up: Don't solve it using the inbuilt sort function.

// Examples :

// Input: arr[] = [7, 10, 4, 3, 20, 15], k = 3
// Output:  7
// Explanation: 3rd smallest element in the given array is 7.
// Input: arr[] = [2, 3, 1, 20, 15], k = 4 
// Output: 15
// Explanation: 4th smallest element in the given array is 15.
// Expected Time Complexity: O(n+(max_element) )
// Expected Auxiliary Space: O(max_element)
// Constraints:
// 1 <= arr.size <= 106
// 1<= arr[i] <= 106
// 1 <= k <= n

public class KthSmallestElem{

    private static int maxOfArr(int[] arr){
        int max = Integer.MIN_VALUE;
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    
    public static int kthSmallest(int[] arr, int k) {
        // Your code here
        
        int max_elem = maxOfArr(arr);
        
        // initialize an count array with max_elem
        int count[] = new int[max_elem+1];
        // fill count array with zeos
        for(int i = 0; i < count.length; i++) {
            count[i] = 0;
        }
        
        // store the frequency of each number
        for(int num : arr){
            count[num]+=1;
        }
        
        
        int count_sum =0;
        int ans =0;
        for(int i=0;i<count.length;i++){
            count_sum +=count[i];
            if(count_sum>=k){
                ans = i;
                break;
            }
        }
        return ans;
                
    }
    public static void main(String[] args) {
        int[] arr = {7, 10, 4, 3, 20, 15};
        int k = 3;
        System.out.println(k+" smallest element in array : "+kthSmallest(arr, k));
        
        int[] arr1 = {2, 3, 1, 20, 15};
        k=4;
        System.out.println(k+" smallest element in array : "+kthSmallest(arr1, k));

    }
}