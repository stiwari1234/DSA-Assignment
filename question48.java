// Algorithm:
// 1. Find first decreasing element from right.
// 2. Swap with just larger element.
// 3. Reverse the remaining.

import java.util.*;

public class question48 {
    public void nextPermutation(int[] nums) {
        int i = nums.length - 2;
        while (i >= 0 && nums[i] >= nums[i + 1]) i--;
        if (i >= 0) {
            int j = nums.length - 1;
            while (nums[j] <= nums[i]) j--;
            swap(nums, i, j);
        }
        reverse(nums, i + 1);
    }

    void swap(int[] nums, int i, int j) {
        int t = nums[i]; nums[i] = nums[j]; nums[j] = t;
    }

    void reverse(int[] nums, int start) {
        int end = nums.length - 1;
        while (start < end) swap(nums, start++, end--);
    }

    public static void main(String[] args) {
        question48 obj = new question48();
        int[] nums = {1,2,3};
        obj.nextPermutation(nums);
        for (int n : nums) System.out.print(n + " ");
    }
}

// Time Complexity: O(n)
// Space Complexity: O(1)
