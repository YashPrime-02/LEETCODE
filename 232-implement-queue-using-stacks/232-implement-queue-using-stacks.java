class MyQueue {
    Stack<Integer> s,help;
    public MyQueue() {
        s= new Stack<>();
        help=new Stack<>();
    }
    
    public void push(int x) {
        while(!s.isEmpty())
        {
            help.add(s.pop());
        }
        s.push(x);
        while(!help.isEmpty())
        {
            s.add(help.pop());
        }
    }
    
    public int pop() {
        return s.pop();
    }
    
    public int peek() {
        return s.peek();
    }
    
    public boolean empty() {
        return s.isEmpty();
    }
}
 