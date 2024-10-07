public class BubbleSort{
    public static void bubbleSort(int[] arr) {
        int swap=0;
        for (int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    swap++;  // count number of swaps
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("number of swaps: " + swap);
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
        bubbleSort(arr);
        System.out.println("Sorted array: ");
        printArray(arr);
    }
}