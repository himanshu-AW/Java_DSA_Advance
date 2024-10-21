// package DivideAndConqure;

public class QuickSort {
    private static int partition(int arr[], int low, int high) {
        int pivot = arr[high];
        int i = low-1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        arr[high]= arr[i];
        arr[i] = pivot;
        return i;
    }

    public static void quickSortHelper(int arr[], int low, int high) {
        if (low >= high) {
            return;
        }
        int pivot = partition(arr, low, high);
        quickSortHelper(arr, low, pivot - 1);
        quickSortHelper(arr, pivot + 1, high);
    }

    public static void quickSort(int arr[]) {
        quickSortHelper(arr, 0, arr.length - 1);
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 6, 3, 4, 8, 2, 9, 5 };
        quickSort(arr);
        printArr(arr);
    }
}
