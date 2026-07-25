// https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/description/
import java.util.*;
public  class RADS {

     public String removeDuplicates(String s) {
      Stack<Character> st = new Stack<>(); 

     for(int i = 0; i < s.length(); i++){ 
        char ch = s.charAt(i);
        if (!st.empty() && st.peek() == ch) { 
            st.pop(); 
        } else { 
          st.push(ch); 
        } 
      } 
 
     StringBuilder ans = new StringBuilder(); 

     while (!st.empty()) { 
        ans.append(st.pop()); 
     } 

     return ans.reverse().toString();
    }
    public static void main(String[] args) {
        
    }
}