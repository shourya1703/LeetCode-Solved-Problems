public class Solution {
    public boolean hasCycle(ListNode head) {
        // using single pointer for head and slow helps in lower memory consumption
        // ListNode slow = head;
        ListNode fast = head;
        
        while(head != null && fast != null){
            head = head.next;
            if(fast.next != null){
                fast = fast.next.next;
            } else {
                break;
            }
            if(fast == head){
                return true;
            }
        }
        return false;
        
    }
}