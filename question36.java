// Algorithm:
// 1. Use backtracking to generate all subsets.
// 2. At each step, include or exclude the current element recursively.

import java.util.*;

public class question36 {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(0, nums, new ArrayList<>(), res);
        return res;
    }

    void backtrack(int index, int[] nums, List<Integer> temp, List<List<Integer>> res) {
        res.add(new ArrayList<>(temp));
        for (int i = index; i < nums.length; i++) {
            temp.add(nums[i]);
            backtrack(i + 1, nums, temp, res);
            temp.remove(temp.size() - 1);
        }
    }

    public static void main(String[] args) {
        question36 obj = new question36();
        System.out.println(obj.subsets(new int[]{1,2,3}));
    }
}

// Time Complexity: O(2^n)
// Space Complexity: O(n)
