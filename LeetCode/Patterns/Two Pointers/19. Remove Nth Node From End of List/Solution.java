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
        if (head==null){
        return head;
        }
        ListNode curr=head;
        int len=0;
        while(curr!=null){
            len++;
            curr=curr.next;
        }
        if(n==len){
            return head.next;
        }
        curr=head;
        int del=len-n-1;
        while(del>0){
            curr=curr.next;   
            del-=1;
        }
        curr.next=curr.next.next;
        return head;
    }
}