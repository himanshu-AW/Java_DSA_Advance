// package DivideAndConqure;

public class SearchInSortedRotatedArr {
    private static int searchHelper(int arr[], int si, int ei, int target){
        if(si>ei) return -1;

        // kaam
        int mid  = si + (ei -si) / 2;
        // 1st line 
        if(arr[mid] == target) return mid;
        else if(arr[mid]>=target){
            // case a: elem present on left side of array
            if(arr[si]<=target && target <=arr[mid]){
                return searchHelper(arr, si, mid-1, target);
            }else{  // case b: elem present on right side of array
                return searchHelper(arr, mid+1, ei, target);
            }
        }else{
            // case c: elem present on the right side of array
            if(arr[mid]<=target && target <=arr[ei]){
                return searchHelper(arr, mid+1, ei, target);
            }else{
                return searchHelper(arr, si, mid-1, target);
            }
        }
        
    }
    public static int search(int arr[], int target) {
        return searchHelper(arr,0, arr.length-1, target);
    }

    public static void main(String[] args) {
       int arr[] = {4,5,6,7,0,1,2,3};
       int target = 1;
       System.out.println(search(arr,target)); 
    }
}