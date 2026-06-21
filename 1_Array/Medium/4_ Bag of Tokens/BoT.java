// https://leetcode.com/problems/bag-of-tokens/description/
import java.util.*;
public class BoT {
    public static  int bagOfTokensScore(int[] tokens, int power) {

        Arrays.sort(tokens);

        int left = 0;
        int right = tokens.length - 1;

        int score = 0;
        int maxScore = 0;

        while (left <= right) {

            if (power >= tokens[left]) {
                power -= tokens[left];
                score++;
                maxScore = Math.max(maxScore, score);
                left++;
            } else if (score > 0) {
                power += tokens[right];
                score--;
                right--;
            } else {
                break;
            }
        }

        return maxScore;
    }
    public static void main(String[] args) {
        int arr[]={100,200,300,400};
        int power = 200;
        System.out.println(bagOfTokensScore(arr, power));
    }
}
