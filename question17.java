// Algorithm:
// 1. Initialize two pointers, left and right.
// 2. Track leftMax and rightMax.
// 3. Move pointers inward, and at each step, calculate trapped water by:
//    min(leftMax, rightMax) - height[i]
// 4. Accumulate total water.

public class question17 {
    public int trap(int[] height) {
        int left = 0, right = height.length - 1, leftMax = 0, rightMax = 0, water = 0;
        while (left < right) {
            if (height[left] < height[right]) {
                leftMax = Math.max(leftMax, height[left]);
                water += leftMax - height[left];
                left++;
            } else {
                rightMax = Math.max(rightMax, height[right]);
                water += rightMax - height[right];
                right--;
            }
        }
        return water;
    }

    public static void main(String[] args) {
        question17 obj = new question17();
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(obj.trap(height));
    }
}

// Time Complexity: O(n)
// Space Complexity: O(1)
