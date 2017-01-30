/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class ReverseLinkedList {
  public class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
  }
    public ListNode reverseList(ListNode head) {
        ListNode currNode = head;
        ListNode previous = null;
        ListNode next = null;
        while (currNode != null) {
            next = currNode.next;
            currNode.next = previous;
            previous = currNode;
            currNode = next;
        }
        head = previous;
        return head;
    }
}
