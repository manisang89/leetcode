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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    ListNode d=new ListNode(-1);
    ListNode td=d;
    ListNode p1=l1,p2=l2;
    int c=0;
    while(p1!=null||p2!=null)
    {
        int sum=(p1==null)?0:p1.val;
        sum+=(p2==null)?0:p2.val;
        sum+=c;
        td.next=new ListNode(sum%10);
        c=sum/10;
        if(p1!=null)
        p1=p1.next;
        if(p2!=null)
        p2=p2.next;
        td=td.next;
        
        
    }
    if(c!=0)
    {
        td.next=new ListNode(c);
    }
    return d.next;
    
    }
    
    
}