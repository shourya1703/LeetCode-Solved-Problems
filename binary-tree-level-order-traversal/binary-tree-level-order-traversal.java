
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<>();
        
        Queue<TreeNode> q1=new LinkedList<>();
        if(root==null){
            return ans;
        }
        q1.add(root);
        while(!q1.isEmpty()){
            List<Integer> l1=new ArrayList<>();
            int len=q1.size();
            for(int i=0;i<len;i++){
                TreeNode temp=q1.remove();
                l1.add(temp.val);
                if(temp.left!=null){
                    q1.add(temp.left);
                }
                if(temp.right!=null){
                    q1.add(temp.right);
                }
            }
            ans.add(l1);
         
        }
        return ans;
            
    }
}
  