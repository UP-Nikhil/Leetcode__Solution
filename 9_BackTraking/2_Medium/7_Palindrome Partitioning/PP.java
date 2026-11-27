//https://leetcode.com/problems/palindrome-partitioning/description/

import java.util.*;
public class PP {
   
    public List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>();
        List<String> list = new ArrayList<>();

        helper(s, 0 ,list, result);
        return result;
    }
    
    private void helper(String s, int st, List<String> list, List<List<String>> result ){
          if(st == s.length()){
           result.add(new ArrayList<>(list));
            return;
          }

          String temp = "";
          for(int i = st; i< s.length(); i++){
            temp += s.charAt(i);
            if(isPalindrome(temp)){
                list.add(temp);
                helper(s, i + 1, list, result);
                list.remove(list.size() - 1); // baktring;
            }
          }
    }


    private boolean isPalindrome(String s){
        int i =0; 
        int j = s.length() -1;
        while(i < j){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
public static void main(String[] args) {
    
}
}
