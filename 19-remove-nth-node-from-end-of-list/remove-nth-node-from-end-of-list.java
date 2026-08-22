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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // ListNode fast = head;
        // for(int i = 0;i<n;i++){
        //     fast = fast.next;
        // }
        // if(fast == null){
        //     return head.next;
        // }
        // ListNode slow = head;
        // while(fast.next != null){
        //     slow = slow.next;
        //     fast = fast.next;
        // }
        // ListNode del = slow.next;
        // slow.next = slow.next.next;

        // return head;

        ListNode fast = head;
        int count = 0;
        while(fast != null){
            fast = fast.next;
            count++;
        }

        if(n == count){
            return head.next;
        }

        ListNode temp = head;
        for(int i = 0; i < count - n - 1; i++){
            temp = temp.next;
        }

        ListNode del = temp.next;
        temp.next = temp.next.next;

        return head;
    }
}