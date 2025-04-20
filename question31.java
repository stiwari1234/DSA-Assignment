// Algorithm:
// 1. Use deque to store indices of potential max values.
// 2. Remove indices out of window or smaller than current.

import java.util.*;

public class question31 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> dq = new LinkedList<>();
        int[] res = new int[nums.length - k + 1];
        for (int i = 0; i < nums.length; i++) {
            if (!dq.isEmpty() && dq.peek() <= i - k) dq.poll();
            while (!dq.isEmpty() && nums[dq.peekLast()] < nums[i]) dq.pollLast();
            dq.offer(i);
            if (i >= k - 1) res[i - k + 1] = nums[dq.peek()];
        }
        return res;
    }

    public static void main(String[] args) {
        question31 obj = new question31();
        int[] res = obj.maxSlidingWindow(new int[]{1,3,-1,-3,5,3,6,7}, 3);
        for (int i : res) System.out.print(i + " ");
    }
}

// Time Complexity: O(n)
// Space Complexity: O(k)
