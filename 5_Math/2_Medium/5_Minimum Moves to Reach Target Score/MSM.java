//https://leetcode.com/problems/minimum-moves-to-reach-target-score/description/

public class MSM{
    public static  int minMoves(int target, int maxDoubles) {
        int moves = 0;
        while (target > 1 && maxDoubles > 0) {
            if (target % 2 != 0) {
                target = target - 1;
            } else {
                target = target /2;
                maxDoubles--;
            }
            moves++;
        }
        if (target > 1) {
            moves = moves + (target - 1);
        }
        
        return moves;
    }
    public static void main(String[] args) {
        int n=19;
        System.out.println(minMoves(n,0));
    }
}