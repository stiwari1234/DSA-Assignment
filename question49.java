// Algorithm:
// 1. Use two pointers technique to align lengths and meet at intersection.

public class question49 {
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
        ListNode common = new ListNode(4);
        common.next = new ListNode(5);
        ListNode a = new ListNode(1);
        a.next = new ListNode(2);
        a.next.next = common;
        ListNode b = new ListNode(3);
        b.next = common;
        question49 obj = new question49();
        System.out.println(obj.getIntersectionNode(a, b).val);
    }
}

// Time Complexity: O(n + m)
// Space Complexity: O(1)
