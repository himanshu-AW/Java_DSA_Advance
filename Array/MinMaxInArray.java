//     Given an array arr. Your task is to find the minimum and maximum elements in the array.

// Note: Return an array that contains two elements the first one will be a minimum element and the second will be a maximum of an array.

// Examples:

// Input: arr = [3, 2, 1, 56, 10000, 167]
// Output: 1 10000
// Explanation: minimum and maximum elements of array are 1 and 10000.
// Input: arr = [1, 345, 234, 21, 56789]
// Output: 1 56789
// Explanation: minimum and maximum element of array are 1 and 56789.
// Input: arr = [56789]
// Output: 56789 56789
// Explanation: Since the array contains only one element so both min & max are same.
// Expected Time Complexity: O(n)
// Expected Auxiliary Space: O(1)

// Constraints:
// 1 <= arr.size() <= 105
// 1 <= arr[i] <=1012

class Pair<K, V> {
    private final K key;
    private final V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}

public class MinMaxInArray {

    public Pair<Long, Long> getMinMax(int[] arr) {
        // Code Here
        // Pair<Long,Long> pair = new Pair<>();
        
        long min,max;
        
        if(arr.length == 1){
         return new Pair(arr[0],arr[0]);
        }
        
           if(arr[0]>arr[1]){
               max = arr[0];
               min = arr[1];
           }else{
               min = arr[0];
               max = arr[1];
           }
  
        
        
        for(int i=2;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }else if(arr[i]<min){
                min = arr[i];
            }
        }
        
        return new Pair(min,max);
    }
    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 56, 10000, 167};
        int[] arr2 = {1, 345, 234, 21, 56789};

        MinMaxInArray ob = new MinMaxInArray();
        Pair<Long, Long> pair = ob.getMinMax(arr);
        System.out.println(pair.getKey() + " " + pair.getValue());

        Pair<Long, Long> pairr = ob.getMinMax(arr2);
        System.out.println(pair.getKey() + " " + pairr.getValue());
    }
}
