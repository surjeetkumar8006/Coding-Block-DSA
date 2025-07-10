
public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxWater = 0;
        while (left < right) {
            int width = right-left;
            int water = Math.min(height[left], height[right]) * width;
            maxWater = Math.max(maxWater, water);
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxWater;
    }

    // Sample run
    public static void main(String[] args) {
        ContainerWithMostWater solution = new ContainerWithMostWater();

        int[] height1 = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        int[] height2 = { 1, 1 };

        System.out.println("Max Area 1: " + solution.maxArea(height1)); // Output: 49
        System.out.println("Max Area 2: " + solution.maxArea(height2)); // Output: 1
    }
}
