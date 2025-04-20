// Algorithm:
// 1. Reverse half of the number and compare with the other half.

public class question29 {
    public boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) return false;
        int rev = 0;
        while (x > rev) {
            rev = rev * 10 + x % 10;
            x /= 10;
        }
        return x == rev || x == rev / 10;
    }

    public static void main(String[] args) {
        question29 obj = new question29();
        System.out.println(obj.isPalindrome(121));
    }
}

// Time Complexity: O(log n)
// Space Complexity: O(1)
