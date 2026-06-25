
// https://leetcode.com/problems/rotated-digits/description/
public class RD {
    public static int rotatedDigits(int n) {
        int count = 0;

        for (int i = 1; i <= n; i++) {
            int num = i;
            boolean valid = true, changed = false;

            while (num > 0) {
                int digit = num % 10;

                if (digit == 3 || digit == 4 || digit == 7) {
                    valid = false;
                    break;
                }

                if (digit == 2 || digit == 5 || digit == 6 || digit == 9) {
                    changed = true;
                }

                num /= 10;
            }

            if (valid && changed) {
                count++;
            }
        }

        return count;
    }
    
    public static void main(String[] args) {
        int ans= rotatedDigits(10);
        System.out.println(ans);
    }
}
