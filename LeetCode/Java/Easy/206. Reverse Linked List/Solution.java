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
    public ListNode reverseList(ListNode head) {
        if(head==null)
        return head;
    
    ListNode ll=new ListNode(-1);
    ListNode bell=ll;
    ListNode temp=head;
    Stack<ListNode>stk=new Stack<>();
    while(temp!=null){
        stk.push(temp);
        temp=temp.next;
    }
    while(!stk.isEmpty()){
        bell.next=stk.pop();
        bell=bell.next;
    }
    bell.next=null;
    return ll.next;   
    }
}