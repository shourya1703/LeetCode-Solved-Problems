/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode temp=headB;
        while(headA!=null){
            while(temp!=null){
                if(headA==temp){
                    return headA;
                }
                temp=temp.next;
            }
            temp=headB;
            headA=headA.next;
        }
        return null;
    }
}