public class BinarySearch {

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6};
        int x = 4;
        int result = binarySearch(arr, x);
        if(result == -1){
            System.out.println(x + " is not present in array");
        }else{
            System.out.println(x + " is present at index " + result);
        }
    }

    private static int binarySearch(int arr[], int x){
        int left = 0;
        int right = arr.length - 1;

        while(left <= right){
            int mid = left + (right-left)/2;
            if(arr[mid] == x){
                return mid;
            }else if(arr[mid] > x){
                right = mid -1;
            }else{
                left = mid +1;
            }
        }
        return -1; // Element not found
    }
}
