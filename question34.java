// Algorithm:
// 1. Use hashmap to store prefix sums.
// 2. For each index, check if (currSum - k) exists in map.

import java.util.*;

public class question34 {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int sum = 0, count = 0;
        for (int num : nums) {
            sum += num;
            count += map.getOrDefault(sum - k, 0);
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;
    }

    public static void main(String[] args) {
        question34 obj = new question34();
        System.out.println(obj.subarraySum(new int[]{1,1,1}, 2));
    }
}

// Time Complexity: O(n)
// Space Complexity: O(n)
