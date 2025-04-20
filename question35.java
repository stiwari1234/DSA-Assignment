// Algorithm:
// 1. Count frequency using HashMap.
// 2. Use a min-heap (priority queue) of size k to track top frequencies.
// 3. Add elements from map to heap, remove smallest when size exceeds k.
// 4. Extract elements from heap into result array.

import java.util.*;

public class question35 {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int num : nums) freq.put(num, freq.getOrDefault(num, 0) + 1);
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[1] - b[1]);
        for (Map.Entry<Integer, Integer> e : freq.entrySet()) {
            pq.offer(new int[]{e.getKey(), e.getValue()});
            if (pq.size() > k) pq.poll();
        }
        int[] res = new int[k];
        for (int i = k - 1; i >= 0; i--) res[i] = pq.poll()[0];
        return res;
    }

    public static void main(String[] args) {
        question35 obj = new question35();
        int[] res = obj.topKFrequent(new int[]{1,1,1,2,2,3}, 2);
        for (int n : res) System.out.print(n + " ");
    }
}

// Time Complexity: O(n log k)
// Space Complexity: O(n)
