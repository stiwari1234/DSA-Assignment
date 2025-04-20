// Algorithm:
// 1. Use two pointers a and b.
// 2. Move both, if either hits end, redirect to other head.
// 3. They will meet at intersection or null.

public class question27 {
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) { this.val = val; }
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode a = headA, b = headB;
        while (a != b) {
            a = (a == null) ? headB : a.next;
            b = (b == null) ? headA : b.next;
        }
        return a;
    }

    public static void main(String[] args) {
        ListNode common = new ListNode(8);
        common.next = new ListNode(10);
        ListNode a = new ListNode(3);
        a.next = new ListNode(7);
        a.next.next = common;
        ListNode b = new ListNode(99);
        b.next = common;
        question27 obj = new question27();
        System.out.println(obj.getIntersectionNode(a, b).val);
    }
}

// Time Complexity: O(n + m)
// Space Complexity: O(1)
