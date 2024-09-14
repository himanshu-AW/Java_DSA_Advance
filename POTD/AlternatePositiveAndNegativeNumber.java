import java.util.ArrayList;

// Alternate positive and negative numbers

// Given an unsorted array arr containing both positive and negative numbers. Your task is to create an array of alternate positive and negative numbers without changing the relative order of positive and negative numbers.
// Note: Array should start with a positive number and 0 (zero) should be considered a positive element.

// Examples:

// Input: arr[] = [9, 4, -2, -1, 5, 0, -5, -3, 2]
// Output: 9 -2 4 -1 5 -5 0 -3 2
// Explanation: Positive elements : [9,4,5,0,2]
// Negative elements : [-2,-1,-5,-3]
// As we need to maintain the relative order of postive elements and negative elements we will pick each element from the positive and negative and will store them. If any of the positive and negative numbersare completed. we will continue with the remaining signed elements.
// The output is 9,-2,4,-1,5,-5,0,-3,2.
// Input: arr[] = [-5, -2, 5, 2, 4, 7, 1, 8, 0, -8]
// Output: 5 -5 2 -2 4 -8 7 1 8 0
// Explanation : Positive elements : [5,2,4,7,1,8,0]
// Negative elements : [-5,-2,-8]
// The output is 5, -5, 2, -2, 4, -8, 7, 1, 8, 0.
// Expected Time Complexity: O(n)
// Expected Auxiliary Space: O(n)

// Constraints:
// 1 ≤ arr.size() ≤ 107
// -106 ≤ arr[i] ≤ 107

public class AlternatePositiveAndNegativeNumber{
     void rearrange(ArrayList<Integer> arr) {
        // code here
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        
        // adding elements +ve in pos arr & -ve in neg arr
        for(int num : arr){
            if(num >= 0){
                pos.add(num);
            }else{
                neg.add(num);
            }
        }
        
        // rearrange elements using pos and neg arr.
        int i=0,j=0,k=0;
        while(i < pos.size() && j < neg.size()){
            if((k&1) == 0){
                arr.set(k++,pos.get(i++));
            }else{
                arr.set(k++,neg.get(j++));
            }
        }
        
        while(i < pos.size()){
            arr.set(k++,pos.get(i++));
        }
        
        while(j < neg.size()){
            arr.set(k++,neg.get(j++));
        }
    }
    public static void main(String[] args) {
        AlternatePositiveAndNegativeNumber obj = new AlternatePositiveAndNegativeNumber();
        ArrayList<Integer> arr = new ArrayList<>();
        // Input: arr[] = [9, 4, -2, -1, 5, 0, -5, -3, 2]
        arr.add(9);
        arr.add(4);
        arr.add(-2);
        arr.add(-1);
        arr.add(5);
        arr.add(0);
        arr.add(-5);
        arr.add(-3);
        arr.add(2);
        obj.rearrange(arr);
        System.out.println(arr);  // Output: 9 -2 4 -1 5 -5 0 -3 2
    }
}