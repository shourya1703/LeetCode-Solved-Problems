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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        TreeNode curr=root;
        if(curr==null){
            return new TreeNode(val);
        }
        else if(val<curr.val){
            curr.left=insertIntoBST(curr.left,val);
        }
        else if(val>curr.val){
            curr.right=insertIntoBST(curr.right,val);
        }
        else{
            return curr;
        }
        return root;
    }
}