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
    public ListNode middleNode(ListNode head) {
         ListNode temp=head;
        int cnt=0;
        while(temp!=null){
            cnt++;
            temp=temp.next;
        }
       int  midnode=(cnt/2)+1;
       temp=head;
       while(temp!=null){
        midnode-=1;
        if(midnode==0){
            break;
        }
        temp=temp.next;
       }
    return temp;
    }
}