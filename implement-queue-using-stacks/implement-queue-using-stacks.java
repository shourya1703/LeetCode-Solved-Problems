class MyQueue {
      private Stack<Integer> input,output;
    
    public MyQueue() {
        input=new Stack<Integer>();
        output=new Stack<Integer>();
    }
    public void util(){
        if(output.isEmpty()){
            while(!input.isEmpty()){
                output.push(input.pop());
            }
        }
    }
    
    public void push(int x) {
        input.push(x);
    }
    
    public int pop() {
        util();
        return output.pop();
    }
    
    public int peek() {
        util();
        return output.peek();
    }
    
    public boolean empty() {
        util();
        return output.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */