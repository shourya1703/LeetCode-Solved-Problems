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
    public int countNodes(TreeNode root) {
        int count=0;
        Queue<TreeNode> q1=new LinkedList<>();
        if(root==null){
            return 0;
        }
        q1.add(root);
        while(!q1.isEmpty()){
            int len=q1.size();
            for(int i=0;i<len;i++){
                TreeNode temp=q1.remove();
                count++;
                if(temp.left!=null){
                    q1.add(temp.left);
                }
                if(temp.right!=null){
                    q1.add(temp.right);
                }
            }
         
        }
        return count;
            
    }
}