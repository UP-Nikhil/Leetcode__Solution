
public class P_string2 {
     public char processStr(String s, long k) {

        long len = 0;

        // Final length calculate karo
        for (char ch : s.toCharArray()) {

            if (Character.isLetter(ch)) {
                len++;
            }
            else if (ch == '*') {
                if (len > 0) {
                    len--;
                }
            }
            else if (ch == '#') {
                len *= 2;
            }
            else if (ch == '%') {
                // length same rahegi
            }
        }

        if (k < 0 || k >= len) {
            return '.';
        }

        // Reverse traversal
        for (int i = s.length() - 1; i >= 0; i--) {

            char ch = s.charAt(i);

            if (Character.isLetter(ch)) {

                if (k == len - 1) {
                    return ch;
                }

                len--;
            }

            else if (ch == '*') {

                len++;
            }

            else if (ch == '#') {

                long half = len / 2;

                if (k >= half) {
                    k -= half;
                }

                len = half;
            }

            else if (ch == '%') {

                k = len - 1 - k;
            }
        }

        return '.';
    }
}
