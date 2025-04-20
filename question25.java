// Algorithm:
// 1. Traverse array from end.
// 2. Use a stack to track next greater elements.
// 3. For each element, pop from stack until you find greater value or it's empty.

import java.util.*;

public class question25 {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        Stack<Integer> stack = new Stack<>();
        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() <= nums[i]) stack.pop();
            res[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(nums[i]);
        }
        return res;
    }

    public static void main(String[] args) {
        question25 obj = new question25();
        int[] res = obj.nextGreaterElements(new int[]{4, 5, 2, 10});
        for (int i : res) System.out.print(i + " ");
    }
}

// Time Complexity: O(n)
// Space Complexity: O(n)
