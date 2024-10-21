// package DivideAndConqure;

public class MergeSort {
    private static void merge(int[] arr, int left, int mid, int right) {
        int[] tempArr = new int[right-left+1];
        int i=left,j=mid+1,k=0;
        while(i<=mid && j<=right) {
            if(arr[i]<arr[j]){
                tempArr[k++] = arr[i++];
            }else{
                tempArr[k++] = arr[j++];
            }
        }
        while(i<=mid){
            tempArr[k++] = arr[i++];
        }
        while (j<=right) {
            tempArr[k++]=arr[j++];
        }

        for(k=0,i=left; i<=right; i++) {
            arr[i]=tempArr[k++];
        }
    }
    private static void merge(String arr[], int si, int mid, int ei) {
        String[] tempArr = new String[ei - si + 1];
        int i = si, j = mid + 1, k = 0;  // Note mid + 1 for the start of the right half
        while (i <= mid && j <= ei) {
            int ans = arr[i].compareTo(arr[j]);
            if (ans <= 0) { // Compared first string is less than or equal to the other string
                tempArr[k++] = arr[i++];
            } else {  // Compared first string is greater than the other string
                tempArr[k++] = arr[j++];
            }
        }
        // Add remaining elements from left half
        while (i <= mid) {
            tempArr[k++] = arr[i++];
        }
        // Add remaining elements from right half
        while (j <= ei) {
            tempArr[k++] = arr[j++];
        }
        // Copy temporary array back into original array
        for (i = si, k = 0; i <= ei; i++) {
            arr[i] = tempArr[k++];
        }
    }
    private static void mergeSortHelper(int[] arr, int left, int right) {
        if(left>=right){
            return;
        }
        int mid = left + (right-left)/2;
        mergeSortHelper(arr,left,mid);
        mergeSortHelper(arr,mid+1,right);
        merge(arr,left,mid,right);
    }

    public static void mergeSortHelper(String arr[], int si, int ei) {
        if (si >= ei) return;  // Fix: change condition to si >= ei to avoid invalid recursion
        int mid = si + (ei - si) / 2;
        mergeSortHelper(arr, si, mid);
        mergeSortHelper(arr, mid + 1, ei);
        merge(arr, si, mid, ei);
    }
    public static void mergeSort(String[] arr) {
        mergeSortHelper(arr,0,arr.length-1);
    }
    public static void mergeSort(int[] arr) {
        mergeSortHelper(arr,0,arr.length-1);
    }

    public static void printArr(int arr[]){
        for(int x: arr){
            System.out.print(" "+x);
        }
        System.out.println();
    }
    public static void printArr(String arr[]){
        for(String x: arr){
            System.out.print(" "+x);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr ={6,3,4,8,2,9,5};
        mergeSort(arr);
        printArr(arr);
        String[] str = new String[]{"sun", "earth", "march", "mercury"};
        mergeSort(str);
        printArr(str);
    }
}
