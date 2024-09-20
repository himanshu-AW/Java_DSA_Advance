import java.util.ArrayList;
// Given an array arr containing only 0s, 1s, and 2s. Sort the array in ascending order.

// Examples:

// Input: arr[]= [0, 2, 1, 2, 0]
// Output: 0 0 1 2 2
// Explanation: 0s 1s and 2s are segregated into ascending order.
// Input: arr[] = [0, 1, 0]
// Output: 0 0 1
// Explanation: 0s 1s and 2s are segregated into ascending order.
// Expected Time Complexity: O(n)
// Expected Auxiliary Space: O(1)

public class Sorts0s1s2s {
    public static void sort012(ArrayList<Integer> arr) {
        // code here
        int left = 0;
        int mid = 0;
        int right = arr.size() - 1;
        int temp = 0;

        while (mid <= right) {
            switch (arr.get(mid)) {
                case 0:
                    temp = arr.get(left);
                    arr.set(left, arr.get(mid));
                    arr.set(mid, temp);
                    left++;
                    mid++;

                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    temp = arr.get(mid);
                    arr.set(mid, arr.get(right));
                    arr.set(right, temp);
                    right--;
                    break;
            }
        }
        return ;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(2);
        list.add(1);
        list.add(2);
        list.add(0);

        System.out.println(list);
        sort012(list);
        System.out.println(list);
    }
}