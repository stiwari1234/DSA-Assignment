// Algorithm:
// 1. For n = 0, return 1.
// 2. For each digit count from 1 to n:
//    - Calculate unique combinations using 9 * 9 * 8 * ... pattern.

public class question20 {
    public int countNumbersWithUniqueDigits(int n) {
        if (n == 0) return 1;
        int res = 10, unique = 9, available = 9;
        for (int i = 2; i <= n && available > 0; i++) {
            unique *= available;
            res += unique;
            available--;
        }
        return res;
    }

    public static void main(String[] args) {
        question20 obj = new question20();
        System.out.println(obj.countNumbersWithUniqueDigits(2));
    }
}

// Time Complexity: O(n)
// Space Complexity: O(1)
