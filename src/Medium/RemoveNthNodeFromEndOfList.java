package Medium;

/**
 * Diberikan head of a linked list, hapus node ke-n dari akhir list dan return head.
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: head = [1,2,3,4,5], n = 2
 * Output: [1,2,3,5]
 */

public class RemoveNthNodeFromEndOfList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy_head = new ListNode(0);
        dummy_head.next = head;

        ListNode slow = dummy_head;
        ListNode fast = dummy_head;

        for (int i = 1; i <= n + 1; i++) {
            fast = fast.next;
        }

        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }

        slow.next = slow.next.next;
        return dummy_head.next;
    }
}
