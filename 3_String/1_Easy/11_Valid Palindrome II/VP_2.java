//https://leetcode.com/problems/valid-palindrome-ii/description/

public class VP_2 {
    private static boolean palindrome(int i, int j, String s) {
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static boolean validPalindrome(String s) {

        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            char left = s.charAt(i),
                    right = s.charAt(j);

            if (left != right) {
                return palindrome(i + 1, j, s) || palindrome(i, j - 1, s);

            } else {
                i++;
                j--;
            }
        }
        return true;
    }

    public static void main(String[] args) {
           
        String s = "abca";
        System.out.println(validPalindrome(s));
    }
}