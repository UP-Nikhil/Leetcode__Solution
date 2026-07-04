
//https://leetcode.com/problems/find-the-difference/description/
public class  FD {
  
    public char findTheDifference(String s, String t) {

        char ans = 0;

        for (char c : s.toCharArray()) {
            ans ^= c;
        }

        for (char c : t.toCharArray()) {
            ans ^= c;
        }

        return (char) ans;
    }
    public static void main (String args []){

    }
}

