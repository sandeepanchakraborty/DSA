/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode temp=head;
        Map<ListNode,Integer> mp=new HashMap<>();
        while(temp!=null){
            if(mp.containsKey(temp)){
                return true;
            }
            mp.put(temp,1);
            temp=temp.next;
        }
        return false;
    }
}