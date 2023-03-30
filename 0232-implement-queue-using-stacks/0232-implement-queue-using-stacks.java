class MyQueue {
	 private Deque<Integer> in_stk = new ArrayDeque<>();
    private Deque<Integer> out_stk = new ArrayDeque<>();
   
    public void push(int x) {
        in_stk.push(x);
    }
    
    public int pop() {
        peek();
        return out_stk.pop();
    }
    
    public int peek() {
        if (out_stk.isEmpty())
        while (!in_stk.isEmpty())
            out_stk.push(in_stk.pop());
        return out_stk.peek();
    }
    
    public boolean empty() {
        return in_stk.isEmpty() && out_stk.isEmpty();
    }
}