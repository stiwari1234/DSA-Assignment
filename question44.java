// Algorithm:
// 1. Use HashMap to store (target - current) lookup.
// 2. If complement exists in map, return indices.

import java.util.*;

public class question44 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int comp = target - nums[i];
            if (map.containsKey(comp)) return new int[]{map.get(comp), i};
            map.put(nums[i], i);
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        question44 obj = new question44();
        int[] res = obj.twoSum(new int[]{2,7,11,15}, 9);
        for (int i : res) System.out.print(i + " ");
    }
}

// Time Complexity: O(n)
// Space Complexity: O(n)
