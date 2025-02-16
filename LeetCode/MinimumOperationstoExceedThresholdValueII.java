import java.util.PriorityQueue;

public class MinimumOperationstoExceedThresholdValueII {
    public int minOperations(int[] nums,int k){
        PriorityQueue<Long> minHeap = new PriorityQueue<>();

        for(int num:nums){
            minHeap.add((long)num);
        }
        int count =0;
        while(!minHeap.isEmpty()){
            long min1 = minHeap.peek();
            if(min1 >=k){
                break;
            }
            minHeap.poll();

            if(minHeap.isEmpty()){
                return -1;
            }
            long min2 = minHeap.poll();
            long newValue =2* Math.min(min1,min2) + Math.max(min1,min2);
            minHeap.add(newValue);
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        MinimumOperationstoExceedThresholdValueII solution = new MinimumOperationstoExceedThresholdValueII();
        int[] nums = {1, 2, 3, 9, 10, 12};
        int k = 7;
        int result = solution.minOperations(nums, k);
        System.out.println("Minimum operations required: " + result);
    }
}
