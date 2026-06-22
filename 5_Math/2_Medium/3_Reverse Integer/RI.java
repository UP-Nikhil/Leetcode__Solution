// https://leetcode.com/problems/reverse-integer/description/
public class RI {
    public static int reverse(int x) {

        long reverse = 0;

        while (x != 0) {
            int digit = x % 10;
            reverse = reverse * 10 + digit;
            x /= 10;
        }

        if (reverse > Integer.MAX_VALUE || reverse < Integer.MIN_VALUE) {
            return 0;
        }

        return (int) reverse;
    }

    public static void main(String[] args) {

        int n = 99898676;
        System.out.println(reverse(n));
    }
}