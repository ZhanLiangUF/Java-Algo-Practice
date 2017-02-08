public class FloydCycleFindingAlgorithm {
    public boolean hasCycle(ListNode head) {
        if(head == null) // list does not exist..so no loop either.
        return false;
        ListNode slow, fast; // create two references.
        slow = fast = head; // make both refer to the start of the list.

    while(true) {
        slow = slow.next;
        if(fast.next != null) // next null means there is no loop
            fast = fast.next.next;
        else
            return false;
        if (slow == null || fast == null){
            return false;
        }
        if(slow == fast) {
            return true;
        }

    }
}
}
