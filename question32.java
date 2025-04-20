// Algorithm:
// 1. Use a stack to store indices of bars.
// 2. For each bar, compute area when smaller bar is encountered.

import java.util.*;

public class question32 {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int maxArea = 0, n = heights.length;
        for (int i = 0; i <= n; i++) {
            int h = (i == n) ? 0 : heights[i];
            while (!stack.isEmpty() && h < heights[stack.peek()]) {
                int height = heights[stack.pop()];
                int width = stack.isEmpty() ? i : i - stack.peek() - 1;
                maxArea = Math.max(maxArea, height * width);
            }
            stack.push(i);
        }
        return maxArea;
    }

    public static void main(String[] args) {
        question32 obj = new question32();
        System.out.println(obj.largestRectangleArea(new int[]{2,1,5,6,2,3}));
    }
}

// Time Complexity: O(n)
// Space Complexity: O(n)
