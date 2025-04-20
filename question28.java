// Algorithm:
// 1. Use two pointers: top1 from start, top2 from end.
// 2. Push and pop from respective directions.

public class question28 {
    int[] arr;
    int top1, top2;

    public question28(int size) {
        arr = new int[size];
        top1 = -1;
        top2 = size;
    }

    public void push1(int val) {
        if (top1 + 1 < top2) arr[++top1] = val;
    }

    public void push2(int val) {
        if (top1 + 1 < top2) arr[--top2] = val;
    }

    public int pop1() {
        return (top1 >= 0) ? arr[top1--] : -1;
    }

    public int pop2() {
        return (top2 < arr.length) ? arr[top2++] : -1;
    }

    public static void main(String[] args) {
        question28 s = new question28(10);
        s.push1(1);
        s.push2(9);
        System.out.println(s.pop1());
        System.out.println(s.pop2());
    }
}

// Time Complexity: O(1)
// Space Complexity: O(n)
