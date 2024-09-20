public class LinearSearch {
    public static void main(String[] args) {
        int arr[] = {2, 3, 4, 10, 40};
        int x = 10;
        int result = linearSearch(arr, x);
        if(result == -1) {
            System.out.println("Element not present in array");
        }else{
            System.out.println("Element found at index " + result);
        }
        
    }
    private static int linearSearch(int arr[],int x){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                return i;
            }
        }
        return -1;
    }
}
