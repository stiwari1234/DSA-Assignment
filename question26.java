// Algorithm:
// 1. Use two pointers: fast and slow.
// 2. Move fast n steps ahead, then move both until fast reaches the end.
// 3. Remove the node after slow.

public class question26 {
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) { this.val = val; }
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0), slow = dummy, fast = dummy;
        dummy.next = head;
        for (int i = 0; i < n; i++) fast = fast.next;
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return dummy.next;
    }

    public static void main(String[] args) {
        question26 obj = new question26();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head = obj.removeNthFromEnd(head, 2);
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }
}

// Time Complexity: O(n)
// Space Complexity: O(1)
