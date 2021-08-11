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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> l1=new ArrayList<>();
        hello(root,"",l1);
        return l1;
        
        
    }
    public void hello(TreeNode root,String str, List<String> l1){
        if(root!=null){
            str+=Integer.toString(root.val);
           
            if(root.left==null && root.right==null){
                l1.add(str);
            }
            else{
                str+="->";
                hello(root.left,str,l1);
                hello(root.right,str,l1);
            } 
            
                
}
        
    }
    
}