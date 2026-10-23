//https://leetcode.com/problems/random-pick-with-weight/description/


public class RPW {


    int pSum[];

    public RPW(int[] w) {
        pSum = new int[w.length];
        pSum[0] = w[0];

        for (int i = 1; i < w.length; i++) {
            pSum[i] = pSum[i - 1] + w[i];
        }
    }

    public int pickIndex() {
        double rand = Math.random();
        double target = rand * pSum[pSum.length - 1];

        // Binary Search;

        int l = 0;
        int r = pSum.length - 1;

        while (l < r) {
            int mid = l + (r - l) / 2;

            if (target <= pSum[mid]) {
                r = mid;
            } else {
                l = mid + 1;
            }

        }

        return l;

    }
    public static void main(String[] args) {
        
    }
}


