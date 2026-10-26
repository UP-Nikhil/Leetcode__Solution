//https://leetcode.com/problems/minimum-string-length-after-removing-substrings/description/
public class MSLR {
    /*
    public int minLength(String s) {
        if (s.length() == 0) {
            return 0;
        }
    
        Stack<Character> st = new Stack<>();
    
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
    
            if (!st.isEmpty() &&
                    ((st.peek() == 'A' && ch == 'B') ||
                            (st.peek() == 'C' && ch == 'D'))) {
                st.pop();
            } else {
                st.push(ch);
            }
        }
        return st.size();
    }
    */

    public int minLength(String s) {
        int len = 0;

        char[] arr = s.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            char ch = arr[i];

            if (len > 0 &&
                    ((arr[len - 1] == 'A' && ch == 'B') ||
                            (arr[len - 1] == 'C' && ch == 'D'))) {
                len--;
            } else {
                arr[len] = ch;
                len++;
            }
        }

        return len;
    }

    public static void main(String[] args) {
        
    }
}