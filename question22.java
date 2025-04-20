// Algorithm:
// 1. Check n > 0 and n & (n - 1) == 0.

public class question22 {
    public boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }

    public static void main(String[] args) {
        question22 obj = new question22();
        System.out.println(obj.isPowerOfTwo(16));
    }
}

// Time Complexity: O(1)
// Space Complexity: O(1)
