public class SelectionSort {
    
    public static void selectionSort(int[] arr) {
        for(int i=0;i<arr.length-1;i++){
            int minIndex = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[minIndex]>arr[j]){
                    minIndex = j;
                }
            }
            if(i!=minIndex){
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }
    
    public static void printArray(int[] arr) {
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {0,1,2,3,4,5,6,7};
        // int arr[] = {100,14,2,23,44,5,33};
        System.out.println("Original array: ");
        printArray(arr);
        selectionSort(arr);
        System.out.println("Sorted array: ");
        printArray(arr);
    }
}