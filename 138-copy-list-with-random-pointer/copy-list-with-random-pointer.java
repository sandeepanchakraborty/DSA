/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
            if(head==null) return null;
        insertCopyInBetween(head);
        connectRandomPointers(head);
        return getDeepCopyList(head);
    }
     void insertCopyInBetween (Node head){
        Node temp=head;
        while(temp!=null){
            Node nextElement=temp.next;
            Node copy=new Node(temp.val);
            copy.next=nextElement;
            temp.next=copy;
            temp=nextElement;
        }
    }

    void connectRandomPointers(Node head){
        Node temp=head;
        while(temp!=null){
            Node copyNode=temp.next;
            if(temp.random!=null){
                copyNode.random=temp.random.next;

            }else{
                copyNode.random=null;
            }
            temp=temp.next.next;
        }
    }

    Node getDeepCopyList(Node head){
        Node temp=head;
        Node dummyNode=new Node(-1);
        Node res=dummyNode;
        while(temp!=null){
            res.next=temp.next;
            res=res.next;
            temp.next=temp.next.next;
            temp=temp.next;
        }
        return dummyNode.next;
    }
}