public class RotatedSortedArray {
    public static void main(String[] args) {
        int arr[] = { 4, 5, 6, 7, 8, 9, 10, 1, 2, 3 };
        int target = 9;
        int result = searchRotatedSortedArr(arr, target);
        if (result == -1) {
            System.out.println(target + " not present in array");
        } else {
            System.out.println(target + " present at index " + result);
        }
    }

    private static int searchRotatedSortedArr(int arr[], int target) {
        int pivot = getPivot(arr);
        // search on first half of pivot
        int e = binarySearch(arr, 0, pivot, target);
        if (e == -1) { // search on second half of pivot
            e = binarySearch(arr, pivot + 1, arr.length - 1, target);
        }
        return e;
    }

    private static int getPivot(int arr[]) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] > arr[mid + 1]) {
                return mid;
            } else if (arr[mid] < arr[mid - 1]) {
                return mid - 1;
            } else if (arr[mid] > arr[left]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }

    private static int binarySearch(int arr[], int l, int r, int x) {
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (arr[mid] == x) {
                return mid;
            } else if (arr[mid] > x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return -1; // Element not found
    }
}
