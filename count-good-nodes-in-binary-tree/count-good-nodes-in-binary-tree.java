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
    public int count=0;
    public int goodNodes(TreeNode root) {
        return nodes(root,root.val);
    }
    public int nodes(TreeNode root,int value){
        if(root==null){
            return 0;
        }
        value=Math.max(root.val,value);
        if(root.val>=value){
            count++;
        }
        nodes(root.left,value);
        nodes(root.right,value);
        return count;
    }
}
