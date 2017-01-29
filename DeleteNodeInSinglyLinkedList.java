public class DeleteNodeInSinglyLinkedList {
  public class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
  }
  public void delete(ListNode node) {
    ListNode tempNode = node.next;

    while (tempNode != null) {
      node.val = tempNode.val;
      tempNode = tempNode.next;
      if (tempNode != null) {
        node = node.next;
      } else {
        node.next = null;
      }
    }
  }
}
