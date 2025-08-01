/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
         List<Integer> arr=new ArrayList<>();
        func(root,arr);
        return arr;
    }
       public void func(TreeNode root,List<Integer> ans){
        if(root==null){
            return;

        }
        func(root.left,ans); 
        func(root.right,ans);
        ans.add(root.val);
    }
}