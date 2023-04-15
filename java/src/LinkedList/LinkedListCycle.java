package LinkedList;

public class LinkedListCycle {
    public static boolean solution(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) return true;
        }
        return false;
        
        
        
//
//        HashSet<ListNode> unique = new HashSet<ListNode>();
//        ListNode curr = head;
//        while (curr != null){
//            boolean added = unique.add(curr);
//            if (!added){
//                return true;
//            }
//            curr = curr.next;
//        }
//        return false;
    
    }
}

//[-21,10,17,8,4,26,5,35,33,-7,-16,27,-12,6,29,-12,5,9,20,14,14,2,13,-24,21,23,-21,5]