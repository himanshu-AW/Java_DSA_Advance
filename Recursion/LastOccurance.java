public class LastOccurance {
    static int helperFun(int arr[], int i,int key){
        if(i==0) return -1;
        if(key == arr[i]) return i;
        return helperFun(arr, i-1, key);  
    }
    static int getLastOccurance(int arr[], int i, int key){
        return helperFun(arr, arr.length-1,key);
    }
    public static void main(String[] args) {
        System.out.println(getLastOccurance(new int[]{51,20,4,5,54,4,5,6,7}, 0, 4));
    }
}
