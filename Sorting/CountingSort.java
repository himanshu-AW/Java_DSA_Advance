public class CountingSort {

    public static void countingSort(int[] arr) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }

        int count[] = new int[largest+1];
        // store frequecy of each elem in count array
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }

        int j=0;
        for(int i=0;i<count.length;i++){
            while(count[i]>0){
                arr[j]=i;
                j++;
                count[i]--;
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
        int arr[] = {8,5,1,7,2,8,1,5,3,7};
        System.out.println("Original array: ");
        printArray(arr);
        countingSort(arr);
        System.out.println("Sorted array: ");
        printArray(arr);
    }
}