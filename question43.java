// Algorithm:
// 1. Count frequencies with HashMap.
// 2. Use PriorityQueue to keep top K frequent.

import java.util.*;

public class question43 {
    public List<Integer> topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int n : nums) freq.put(n, freq.getOrDefault(n, 0) + 1);
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> freq.get(a) - freq.get(b));
        for (int key : freq.keySet()) {
            pq.offer(key);
            if (pq.size() > k) pq.poll();
        }
        return new ArrayList<>(pq);
    }

    public static void main(String[] args) {
        question43 obj = new question43();
        System.out.println(obj.topKFrequent(new int[]{1,1,1,2,2,3}, 2));
    }
}

// Time Complexity: O(n log k)
// Space Complexity: O(n)
