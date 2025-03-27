/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) 
        return;
        ListNode m = findMiddle(head);
        ListNode sh = reverse(m.next);
        m.next = null;
        mergelist(head, sh);
        
    }
    public void mergelist(ListNode h1,ListNode h2)
    {
        ListNode x=h1,y=h2;
        while(y!=null)
        {
            ListNode t1=x.next;
            ListNode t2=y.next;
            x.next=y;
            y.next=t1;
            x=t1;
            y=t2;
        }
    }
    public ListNode reverse(ListNode h)
    {
    ListNode prev = null;
    ListNode curr = h;
    while (curr != null) {
        ListNode nextNode = curr.next;
        curr.next = prev;
        prev = curr;
        curr = nextNode;
    }
    return prev;
    }
    public ListNode findMiddle(ListNode head) {
        if (head == null) return null;
        ListNode slow = head;
    ListNode fast = head;

    while (fast != null && fast.next != null) {
        slow = slow.next; 
        fast = fast.next.next;
    }
        return slow;
    }
}