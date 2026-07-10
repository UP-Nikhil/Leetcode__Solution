//https://leetcode.com/problems/design-a-stack-with-increment-operation/description/

public class DSIO {
     int arr[];
    int top;
    int size;
    public DSIO(int maxSize) {
        top = -1;
        this.size = maxSize;
        arr = new int[size];
    }
    
    public void push(int x) {
        if (top == size - 1) {
            return;
        }
        top++;
        arr[top] = x;
        
    }
    
    public int pop() {
        if(top == -1 ){
            return -1;
        }
        return arr[top--];     
    }
    
    public void increment(int k, int val) {
        int limit= Math.min(k , top+1);
        for(int i=0; i < limit; i++ ){
            arr[i] =arr[i] + val;
        }
        
    }
    public static void main(String[] args) {
        
    }
}
