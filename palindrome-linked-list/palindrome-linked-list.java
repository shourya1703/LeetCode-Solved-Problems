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
    public boolean isPalindrome(ListNode head) {
        Stack<Integer> stack=new Stack<>();
        ListNode temp=head;
        boolean flag=false;
        while(temp!=null){
            stack.push(temp.val);
            temp=temp.next;
        }
        while(head!=null){
            int i=stack.pop();
            if(i==head.val){
                flag=true;
            }else{
                flag=false;
                break;
        }
            head=head.next;
        }
        return flag;
    }
}