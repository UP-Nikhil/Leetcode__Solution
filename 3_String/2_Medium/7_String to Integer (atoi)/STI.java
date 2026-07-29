
// https://leetcode.com/problems/string-to-integer-atoi/description/
public class STI {
      public int myAtoi(String s) {

        int i = 0;
        int n = s.length();

        while (i < n && s.charAt(i) == ' ') {
            i++;
        }
        
        int sign = 1;

        if (i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
            if (s.charAt(i) == '-') {
                sign = -1;
            }
            i++;
        }

        int ans = 0;
        while (i < n && Character.isDigit(s.charAt(i))) {

            int digit = s.charAt(i) - '0';

            if (ans > Integer.MAX_VALUE / 10 ||
               (ans == Integer.MAX_VALUE / 10 && digit > 7)) {

                if (sign == 1)
                    return Integer.MAX_VALUE;
                else
                    return Integer.MIN_VALUE;
            }

            ans = ans * 10 + digit;
            i++;
        }

        return sign * ans;
    }
    public static void main(String[] args) {
        
    }
}
