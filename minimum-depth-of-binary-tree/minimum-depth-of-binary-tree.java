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
    public int minDepth(TreeNode root) {
        Queue <TreeNode> queue = new LinkedList();
        if ( root == null ) return 0;
        int height = 0;
        queue.add(root);
        while(!queue.isEmpty()) {
            height++;
            int queueLength = queue.size();
            for( int i= 0 ; i< queueLength; i++ ) {
                TreeNode currentNode = queue.remove();
                if(currentNode.left == null && currentNode.right == null) return height;
                if ( currentNode.left != null ) queue.add(currentNode.left);
                if ( currentNode.right!= null ) queue.add(currentNode.right);
            }
        }
        return height;
    }
}