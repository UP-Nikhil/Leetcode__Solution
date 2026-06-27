//https://leetcode.com/problems/rotate-string/description/

public class RS {
      public boolean rotateString(String s, String goal) {
        String ans= s+s;
        if(s.length()!= goal.length()){
            return false;
        }
        if(ans.contains(goal)){
            return true;
        }
        return false;
        
    }
    public static void main(String[] args) {
        
    }
}
