//https://leetcode.com/problems/number-of-islands/description/

public class NOI {
     private void dfs(char[][] arr, int r, int c) {
        int rows = arr.length;
        int cols = arr[0].length;
        if (r < 0 || c < 0 || r >= rows || c >= cols || arr[r][c] == '0') {
            return;
        }
        arr[r][c] = '0';
        dfs(arr, r + 1, c); // UP
        dfs(arr, r - 1, c); // DOWN
        dfs(arr, r, c + 1); // RIGTHT
        dfs(arr, r, c - 1); //LEFT
    }

    public int numIslands(char[][] arr) {
        if (arr == null || arr.length == 0) {
            return 0;
        }

        int rows = arr.length;
        int cols = arr[0].length;
        int count = 0;

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (arr[r][c] == '1') {
                    count++;
                    dfs(arr, r, c);
                }
            }
        }

        return count;
    }
    public static void main(String[] args) {
        
    }
}
