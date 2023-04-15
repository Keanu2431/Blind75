package LinkedList;

public class ReverseLinkedList {
    public static ListNode solution(ListNode head) {
        ListNode prev = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
        
    }
}
