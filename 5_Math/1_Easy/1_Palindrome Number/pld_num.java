//https://leetcode.com/problems/palindrome-number/description/
public class pld_num {
    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int reverse = 0;
        int original = x;
        while (x > 0) {
            int digit = x % 10;
            reverse = reverse * 10 + digit;
            x = x / 10;
        }
        if (reverse == original) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        int n= 121;
        System.out.println(isPalindrome(n));
    }
}
