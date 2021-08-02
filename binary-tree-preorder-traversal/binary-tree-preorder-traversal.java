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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> l1=new ArrayList<>();
        Stack<TreeNode> s1=new Stack<>();
        if(root==null){
            return l1;
        }
        s1.push(root);
        while(!s1.isEmpty()){
            TreeNode temp=s1.pop();
            l1.add(temp.val);
            if(temp.right!=null){
                s1.push(temp.right);
            }
            if(temp.left!=null){
                s1.push(temp.left);
            }
            
        }
        return l1;
    }
}