// Algorithm:
// 1. Sort the array and use backtracking.
// 2. At each step, include the current number if target not exceeded.

import java.util.*;

public class question37 {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(0, target, candidates, new ArrayList<>(), res);
        return res;
    }

    void backtrack(int index, int target, int[] nums, List<Integer> temp, List<List<Integer>> res) {
        if (target == 0) res.add(new ArrayList<>(temp));
        for (int i = index; i < nums.length && target >= nums[i]; i++) {
            temp.add(nums[i]);
            backtrack(i, target - nums[i], nums, temp, res);
            temp.remove(temp.size() - 1);
        }
    }

    public static void main(String[] args) {
        question37 obj = new question37();
        System.out.println(obj.combinationSum(new int[]{2,3,6,7}, 7));
    }
}

// Time Complexity: O(2^target)
// Space Complexity: O(target)
