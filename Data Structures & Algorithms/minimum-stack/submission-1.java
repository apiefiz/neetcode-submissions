class MinStack {

    static class Pair {
        int first;
        int second;
        Pair(int first, int second){
            this.first= first;
            this.second= second;
        }
    }

    Stack<Pair> s;

    public MinStack() {
        s = new Stack<>();
    }
    
    public void push(int val) {
        if(s.isEmpty()){
            s.push(new Pair(val,val));
        }
        else
        {
            if(s.peek().second < val){
                s.push(new Pair(val, s.peek().second));
            }
            else
            {
                s.push(new Pair(val,val));
            }
        }
    }
    
    public void pop() {
          s.pop();  
    } 
    
    public int top() {
        return s.peek().first;
    }
    
    public int getMin() {
        return s.peek().second;
    }
}
