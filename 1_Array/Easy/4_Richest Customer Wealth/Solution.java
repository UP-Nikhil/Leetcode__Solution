
//https://leetcode.com/problems/richest-customer-wealth/description/

public class Solution {
    public static int maxWealth(int[][] accounts) {
        int maxwealth=0;
        for(int i=0; i < accounts.length; i++)
        {
            int wealth =0;
            for (int j = 0; j < accounts[i].length; j++) {
                wealth= wealth + accounts[i][j];
            }
            maxwealth= Math.max(maxwealth, wealth);
        }
        return maxwealth;
    }
    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3 },
                        { 3, 2, 1 } };
        System.out.println(maxWealth(arr));                

    }
}
// [[1,2,3],[3,2,1]]
//output 6;