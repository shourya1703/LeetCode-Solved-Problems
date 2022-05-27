/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<Integer> preorder(Node root) {
        List<Integer> l1=new ArrayList<>();
        Stack<Node> s1=new Stack<>();
        if(root==null){
            return l1;
        }
        s1.push(root);
        while(!s1.isEmpty()){
            Node n1=s1.peek();
            s1.pop();
            l1.add(n1.val);
            Collections.reverse(n1.children);
            for(Node n3:n1.children){
                s1.push(n3);
            }
        }
        //Collections.reverse(l1);
        return l1;
    }
}