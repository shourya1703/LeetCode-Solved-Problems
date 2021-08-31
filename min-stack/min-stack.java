class MinStack {
     Stack<Integer> s1=new Stack<>();
    Stack<Integer> s2=new Stack<>();
    /** initialize your data structure here. */
    public MinStack() {
       
    }
    
    public void push(int val) {
        s1.push(val);
        if(s2.isEmpty() || s2.peek()>=val){
            s2.push(val);
        }
    }
    
    public void pop() {   
        if(s1.peek().equals(s2.peek())){
             s2.pop();
    }
        s1.pop();
    }
    
    public int top() {
        return s1.peek();
    }
    
    public int getMin() {
        return s2.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */