// Algorithm:
// Bit manipulation refers to direct operations on binary digits of integers using operators like &, |, ^, ~, <<, >>.
// Advantages:
// 1. Faster operations (no loops for bitwise tasks).
// 2. Space-efficient (e.g., bitmasks).
// 3. Simplifies problems involving powers of 2, subsets, etc.

public class question24 {
    public static void main(String[] args) {
        int a = 5, b = 3;
        System.out.println("AND: " + (a & b));
        System.out.println("OR: " + (a | b));
        System.out.println("XOR: " + (a ^ b));
        System.out.println("Left Shift: " + (a << 1));
        System.out.println("Right Shift: " + (a >> 1));
    }
}

// Time Complexity: O(1)
// Space Complexity: O(1)
