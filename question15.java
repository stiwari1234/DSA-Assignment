//
//Algorithm:
//
//Use a min-heap to efficiently retrieve the smallest elements.
//Push the first element of each row into the heap.
//Extract the smallest element from the heap, then insert the next element from the same row.
import java.util.*;

public class question15 {
    public static int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        for (int i = 0; i < matrix.length; i++) {
            minHeap.offer(new int[]{matrix[i][0], i, 0});
        }
        while (k > 1) {
            int[] curr = minHeap.poll();
            if (curr[2] + 1 < matrix[0].length) {
                minHeap.offer(new int[]{matrix[curr[1]][curr[2] + 1], curr[1], curr[2] + 1});
            }
            k--;
        }
        return minHeap.poll()[0];
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 5, 9},
                {10, 11, 13},
                {12, 13, 15}
        };
        int k = 8;
        System.out.println(kthSmallest(matrix, k));
    }
}//Time Complexity:O(klog(n))

