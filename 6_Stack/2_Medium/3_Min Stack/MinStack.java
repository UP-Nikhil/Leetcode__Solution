class MinStack {
    int top;
    int arr[];
    int size = 30000;
    

    public MinStack() {
        arr = new int [size];
        top = -1;
        
    }
    
    public void push(int value) {
        if(top == size -1 ){
            return;
        }
        top++;
        arr[top]= value;
    }
    
    public void pop() {
        if(top == -1){
            return;
        }
        top--;
    }
    
    public int top() {
        return arr[top];
        
    }
    
    public int getMin() {
        int n= arr[0];
        for( int i = 0; i <= top; i++ ){
            n= Math.min(n,arr[i]);
        }
        return n;
    }
    public static void main(String[] args) {
        
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