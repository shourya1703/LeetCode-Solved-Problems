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
        int c1=0;
        int c2=0;
        int c3=0;
        ListNode tempA=headA;
        ListNode tempB=headB;
        while(tempA!=null){
            tempA=tempA.next;
            c1++;
        }
        while(tempB!=null){
            tempB=tempB.next;
            c2++;
        }
        tempA=headA;
        tempB=headB;
        c3=Math.abs(c1-c2);
        if(c1>c2){
            while(c3!=0){
                tempA=tempA.next;
                c3--;
            }
        }
        else{
            while(c3!=0){
                tempB=tempB.next;
                c3--;
            }
        }
        while(tempA!=null && tempB!=null){
            if(tempA==tempB){
                return tempA;
            }
            tempA=tempA.next;
            tempB=tempB.next;
        }
        return null;
    }
}