public class BinarySearch {
    static int bSeach(int arr[],int start,int end,int target){
        if(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid]==target){
                return mid;
            }else if(arr[mid]>target){
                return bSeach(arr,start,mid-1,target);
            }else{
                return bSeach(arr, mid+1, end, target);
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        System.out.println(bSeach(new int[]{2,4,5,7,8,10,21}, 0, 6, 10));
    }
}
