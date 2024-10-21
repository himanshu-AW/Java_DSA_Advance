public class MajorityElem {
    private static int majorityHelper(int nums[], int i, int count,int current){
        if(i==0) return current;

        // kaam
        if(count > nums.length/2){
            return current;
        }else if(nums[i]==current){
            count++;
            return majorityHelper(nums, i-1, count, current);
        }else{
            return majorityHelper(nums, i-1, count, nums[i]);
        }
    }
    public static int findMajorityElement(int[] nums){
       

        // kaam
        return majorityHelper(nums, 0, 0, nums[0]);

    }
    public static void main(String[] args) {
        int nums[]= {3,2,3};
        System.out.println(findMajorityElement(nums));
        int nums1[]={2,2,1,1,1,2,2};
        System.out.println(findMajorityElement(nums1));
    }
}
