class MyStack {
    public Queue<Integer> q= new LinkedList<>();
    public MyStack() {
        
    }
    
    public void push(int x) {
        q.add(x);
    }
    
    public int pop() {
        int n=q.size();
        while(n>1){
            q.add(q.poll());
            n--;
        }
        return q.poll();
    }
    
    public int top() {
        int n=q.size();
        while(n>1){
            q.add(q.poll());
            n--;
        }
        n=q.peek();
        q.add(q.poll());
        return n;
    }
    
    public boolean empty() {
        return q.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */