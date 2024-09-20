public class RotateArray{
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        rotateRight(arr, k);
        System.out.println("Array after rotation: ");  
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        
    }
    private static void rotateRight(int arr[], int k){
        reverseArr(arr, 0, k);
        reverseArr(arr, k+1, arr.length-1);
        reverseArr(arr, 0,arr.length-1);
    }
    private static void reverseArr(int arr[],int i, int j){
        while(i<=j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}