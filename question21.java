// Algorithm:
// 1. Initialize result array of size n+1.
// 2. Use pattern: result[i] = result[i >> 1] + (i & 1)

public class question21 {
    public int[] countBits(int n) {
        int[] res = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            res[i] = res[i >> 1] + (i & 1);
        }
        return res;
    }

    public static void main(String[] args) {
        question21 obj = new question21();
        int[] result = obj.countBits(5);
        for (int i : result) System.out.print(i + " ");
    }
}

// Time Complexity: O(n)
// Space Complexity: O(n)
