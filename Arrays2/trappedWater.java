public class trappedWater {

    public static int calTrappedWater(int height[]) {
        int n = height.length;
        // Calculate left max
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
            System.out.println(leftMax[i]+" ");
        }

        // Calculate right max
        int rightMax[] = new int[n];
        rightMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
            System.out.println(rightMax[i]+" ");
        }
        // loop
        int totalTrappedWater = 0;
        for (int i = 0; i < n; i++) {
            // Calculate min of left max and right max
            int waterLevel = Math.min(leftMax[i], rightMax[i]);

            // Calculate Trapped   Water = min(leftMax, rightMax) - height[i]
            int trappedWater = waterLevel - height[i];
            totalTrappedWater += trappedWater;
        }
        return totalTrappedWater;

    }

    public static void main(String args[]) {
        int height[] = { 4, 2, 0, 6, 3, 2, 5 };
        System.out.println("Total Trapped Water: " + calTrappedWater(height));
    }
}