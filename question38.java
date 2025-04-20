// Algorithm:
// 1. Use backtracking with visited boolean array.
// 2. Build permutations by choosing each unused element.

import java.util.*;

public class question38 {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(nums, new boolean[nums.length], new ArrayList<>(), res);
        return res;
    }

    void backtrack(int[] nums, boolean[] used, List<Integer> temp, List<List<Integer>> res) {
        if (temp.size() == nums.length) res.add(new ArrayList<>(temp));
        for (int i = 0; i < nums.length; i++) {
            if (used[i]) continue;
            used[i] = true;
            temp.add(nums[i]);
            backtrack(nums, used, temp, res);
            temp.remove(temp.size() - 1);
            used[i] = false;
        }
    }

    public static void main(String[] args) {
        question38 obj = new question38();
        System.out.println(obj.permute(new int[]{1,2,3}));
    }
}

// Time Complexity: O(n * n!)
// Space Complexity: O(n)
