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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode sorted=new ListNode();
        ListNode head=sorted;
        if(l1==null && l2==null){
            return null;
        }
        while(l1!=null && l2!=null){
            if(l1.val<=l2.val){
                sorted.next=l1;
                l1=l1.next;
                sorted=sorted.next;
            }
            else{
                sorted.next=l2;
                l2=l2.next;
                  sorted=sorted.next;
            }
        }
        if(l1==null && l2!=null){
            while(l2!=null){
                sorted.next=l2;
                l2=l2.next;
                  sorted=sorted.next;
            }
        }
        else if(l2==null && l1!=null){
            while(l1!=null){
                sorted.next=l1;
                l1=l1.next;
                  sorted=sorted.next;
            }
        }
        return head.next;
    }
}