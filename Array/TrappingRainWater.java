public class TrappingRainWater {
    static int trappingRainWater(int[] height, int width) { // TC-> O(n) and SC-> O(n)

        int n = height.length;

        if(n <3) return -1;


        int leftArr[] = new int[n];
        int rightArr[] = new int[n];

        leftArr[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftArr[i] = Math.max(leftArr[i - 1], height[i]);
        }

        rightArr[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightArr[i] = Math.max(rightArr[i + 1], height[i]);
        }

        int trappedWaater = 0;
        for (int i = 0; i < n; i++) {
            int waterLevel = Math.min(leftArr[i], rightArr[i]);

            trappedWaater += (waterLevel - height[i]) * width;
        }
        return trappedWaater;
    }

    public static void main(String[] args) {
        int height[] = { 4, 2, 0, 6, 3, 2, 5 };
        int width = 1;
        System.out.println("Total Trapped Water: " + trappingRainWater(height, width));
        System.out.println("Total Trapped Water: " + trappingRainWater(new int[]{}, width));
        System.out.println("Total Trapped Water: " + trappingRainWater(new int[]{1}, width));
        System.out.println("Total Trapped Water: " + trappingRainWater(new int[]{1,2}, width));
    }
}
