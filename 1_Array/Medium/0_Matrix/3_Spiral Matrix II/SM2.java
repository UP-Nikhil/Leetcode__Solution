// https://leetcode.com/problems/spiral-matrix-ii/description/

public class SM2 {
    public int[][] generateMatrix(int s) {
        int ans[][]= new int[s][s];
        int top=0,
            left=0, 
            bottom = ans.length -1, 
            right= ans[0].length -1;
        int n = 1;
        while(top<=bottom && left<= right){
            for (int i = left; i <= right; i++) {
                    ans[top][i]=n;
                    n++;
            }
            top++;

            // Top -> Bottom
            for (int i = top; i <= bottom; i++) {
                ans[i][right]=n;
                n++;
            }
            right--;

            // Right -> Left
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    ans[bottom][i]=n;
                    n++;
                }
                bottom--;
            }

            // Bottom -> Top
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    ans[i][left]=n;
                    n++;
                }
                left++;
            }
        }
        return ans;
        
        
    }
    public static void main(String args [])
    {
        
    }
}
