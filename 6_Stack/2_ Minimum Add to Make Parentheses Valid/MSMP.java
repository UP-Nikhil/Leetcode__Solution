//https://leetcode.com/problems/minimum-add-to-make-parentheses-valid/description/

public class MSMP {
    public int minAddToMakeValid(String s) {
        int b = 0;
        int ex = 0;
        for( char ch : s.toCharArray()){
            if(ch == '('){
                b++;
            }
            else if(b > 0){
                b--;
            }
            else {
                ex++;
            }
        }
        return b+ex; 

        /* 
        // using stack 
        Stack<Character> st = new Stack<>();
        int ex = 0;
        for(char ch : s.toCharArray()){
            if(ch == '('){
                st.push(ch);
            }
            else{ 
                if(!st.empty()){
                    st.pop();
                }else{
                    ex++;
                }
            }
        }
        return ex + st.size();
        */
    }  
    public static void main(String[] args) {
        
    }
}
