
// https://leetcode.com/problems/happy-number/description/?envType=problem-list-v2&envId=math

public class HN {
    private int to_sum(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n = n / 10;
        }
        return sum;
    }

    public boolean isHappy(int num) {
        int slow = num;
        int fast = num;
        do {
            slow = to_sum(slow);
            fast = to_sum(to_sum(fast));
        } while (slow != fast);
        return slow == 1;
    }
    public static void main(String[] args) {
        
    }
}
