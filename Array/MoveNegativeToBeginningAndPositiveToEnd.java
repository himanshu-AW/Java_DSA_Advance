// Move all negative numbers to beginning and positive to end with constant extra space

// import java.util.Arrays;

public class MoveNegativeToBeginningAndPositiveToEnd {
    public static void moveNegative(int[] arr)
    {
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
    }

    // Driver code
    public static void main(String[] args)
    {
        int[] arr = { -1, 2, 3, 4, -5, 6, -7, 8, 9 };
        moveNegative(arr);
        for (int e : arr)
            System.out.print(e + " ");
    }
}
