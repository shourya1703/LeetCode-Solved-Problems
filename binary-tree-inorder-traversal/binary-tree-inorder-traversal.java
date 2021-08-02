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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> l1=new ArrayList<>();
        Stack<TreeNode> s1=new Stack<>();
        TreeNode temp=root;
        while(!s1.isEmpty() || temp!=null){
            while(temp!=null){
                s1.push(temp);
                temp=temp.left;
            }
            temp = s1.pop();
            l1.add(temp.val);
            temp=temp.right;
        }
        return l1;
    }
}