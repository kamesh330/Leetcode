class MinStack {
    Stack<Integer> stack;
    Stack<Integer> Minstack;

    public MinStack() {
        stack=new Stack<>();
        Minstack=new Stack<>();
    }
    
    public void push(int value) {
        if(Minstack.isEmpty()){
            stack.push(value);
            Minstack.push(value);
        }
        else{
            stack.push(value);
            Minstack.push(Math.min(stack.peek(),Minstack.peek()));
        }
    }
    
    public void pop() {
        stack.pop();
        Minstack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        // int min=Integer.MAX_VALUE;
        // for(int i:stack) min=Math.min(min,i);
        return Minstack.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */