public class FirstOccurrence{
    static int getFirstOccurrence(int arr[],int i,int key){
        if(i==arr.length) return -1;
        if(arr[i]==key) return i;
        return getFirstOccurrence(arr, i+1, key);
    }
    public static void main(String[] args) {
        System.out.println(getFirstOccurrence(new int[]{51,20,4,5,54,4,5,6,7}, 0, 4));
    }
}