// https://leetcode.com/problems/largest-number-after-digit-swaps-by-parity/description/

import java.util.*;

public class LNADS {
    public int largestInteger(int num) {

        char arr[] = Integer.toString(num).toCharArray();

        PriorityQueue<Integer> odd = new PriorityQueue<>((a, b) -> Integer.compare(b, a));
        PriorityQueue<Integer> even = new PriorityQueue<>((a, b) -> Integer.compare(b, a));

        for (int i = 0; i < arr.length; i++) {
            int digit = arr[i] - '0';

            if (digit % 2 == 0) {
                even.offer(digit);
            } else {
                odd.offer(digit);
            }
        }

        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < arr.length; i++) {
            int digit = arr[i] - '0';

            if (digit % 2 == 0) {
                ans.append(even.poll());
            } else {
                ans.append(odd.poll());
            }
        }

        return Integer.parseInt(ans.toString());
    }

    public static void main(String[] args) {

    }
}
