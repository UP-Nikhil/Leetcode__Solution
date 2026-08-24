
// https://leetcode.com/problems/letter-combinations-of-a-phone-number/
import java.util.*;
public class LC {
     private void combination(String digit, String kp[], String res, List<String> ans) { 
        if (digit.length() == 0) { 
            ans.add(res); 
            return; 
        } 
        
        int current = digit.charAt(0) - '0'; 
        String curChoice = kp[current]; 
        
        for (int i = 0; i < curChoice.length(); i++) { 
            combination(digit.substring(1), kp, res + curChoice.charAt(i), ans); 
        } 
    } 

    public List<String> letterCombinations(String digits) { 
        List<String> ans = new ArrayList<>();
    
      
        if (digits == null || digits.length() == 0) {
            return ans;
        }
        
        String kp[] = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"}; 

        combination(digits, kp, "", ans); 
        
        return ans;
    } 
    public static void main(String[] args) {
        
    }
}
