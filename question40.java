// Algorithm:
// 1. Count frequency of all elements using HashMap.
// 2. Track element with max count.

import java.util.*;

public class question40{
    public int mostFrequent(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int maxFreq = 0, element = 0;
        for (int n : nums) {
            int freq = map.getOrDefault(n, 0) + 1;
            map.put(n, freq);
            if (freq > maxFreq) {
                maxFreq = freq;
                element = n;
            }
        }
        return element;
    }

    public static void main(String[] args) {
        question40 obj = new question40();
        System.out.println(obj.mostFrequent(new int[]{1,3,2,3,4,3}));
    }
}

// Time Complexity: O(n)
// Space Complexity: O(n)
