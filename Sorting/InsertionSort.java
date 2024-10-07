public class InsertionSort {
    
    public static void insertionSort(int[] arr) {
        for (int i=1;i<arr.length;i++){
            int currElem = arr[i];
            int prev = i-1;
            while(prev>=0 && arr[prev]>currElem){
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev+1]=currElem;
        }
         
    }
    
    public static void printArray(int[] arr) {
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        // int arr[] = {0,1,2,3,4,5,6,7};
        int arr[] = {100,14,2,23,44,5,33};
        System.out.println("Original array: ");
        printArray(arr);
        insertionSort(arr);
        System.out.println("Sorted array: ");
        printArray(arr);
    }
}