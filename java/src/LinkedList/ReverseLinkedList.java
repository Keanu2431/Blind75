package LinkedList;

public class ReverseLinkedList {
    public static ListNode solution(ListNode head) {
        ListNode p = null;
        ListNode q = null;
        ListNode r = head;
        while (r != null) {
            System.out.println(r);
            p = q;
            q = r;
            r = r.next;
            q.next = p;
        }
        return q;

    }
}
