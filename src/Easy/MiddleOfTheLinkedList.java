package Easy;

/**
 * Diberikan head of singly linked list, kembalikan node tengah dari daftar tertaut.
 *
 * Jika ada dua node tengah, kembalikan node tengah kedua.
 *
 * Example 1:
 *
 * Input: head = [1,2,3,4,5]
 * Output: [3,4,5]
 * Explanation: The middle node of the list is node 3.
 */

public class MiddleOfTheLinkedList {
    public ListNode middleNode(ListNode head) {
        ListNode a_pointer = head;
        ListNode b_pointer = head;

        while(b_pointer != null && b_pointer.next != null){
            a_pointer = a_pointer.next;
            b_pointer = b_pointer.next.next;
        }
        return a_pointer;
    }
}
