//https://leetcode.com/problems/koko-eating-bananas/description/

public class KEb {

    private boolean isPossible(int piles[], int h, int k) {
        long TH = 0;
        for (int pile : piles) {

            TH += (pile + k - 1) / k;

        }

        return TH <= h;
    }

    // brute force;

    
    //   public int minEatingSpeed(int[] piles, int h) {
      
    //   int maxEat = 0;
    //   for (int pile : piles) {
    //   maxEat = Math.max(maxEat, pile);
    //   }
      
    //   for (int i = 1; i <= maxEat; i++) {
    //   if (isPossible(piles, h, i)) {
    //   return i;
    //   }
    //   }
      
    //   return maxEat;
    //  }
     
    public int minEatingSpeed(int[] piles, int h) {

        int maxEat = 0;
        for (int pile : piles) {
            maxEat = Math.max(maxEat, pile);
        }
        int l = 1;
        int r = maxEat;
        int ans = 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (isPossible(piles, h, mid)) {
                ans = mid;
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {

    }

}
