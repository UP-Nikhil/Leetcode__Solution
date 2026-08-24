//https://leetcode.com/problems/check-knight-tour-configuration/description/
class CKTC {
    
   private boolean helper(int[][] grid, int row, int col, int num) {

    int n = grid.length;
    
    // base case;
    if (num == n * n) {
        return true;
    }

    // Up 2, Right 1
    int i = row - 2;
    int j = col + 1;
    if (i >= 0 && i < n && j >= 0 && j < n && grid[i][j] == num) {
        return helper(grid, i, j, num + 1);
    }

    // Up 2, Left 1
    i = row - 2;
    j = col - 1;
    if (i >= 0 && i < n && j >= 0 && j < n && grid[i][j] == num) {
        return helper(grid, i, j, num + 1);
    }

    // Down 2, Right 1
    i = row + 2;
    j = col + 1;
    if (i >= 0 && i < n && j >= 0 && j < n && grid[i][j] == num) {
        return helper(grid, i, j, num + 1);
    }

    // Down 2, Left 1
    i = row + 2;
    j = col - 1;
    if (i >= 0 && i < n && j >= 0 && j < n && grid[i][j] == num) {
        return helper(grid, i, j, num + 1);
    }

    // Right 2, Up 1
    i = row - 1;
    j = col + 2;
    if (i >= 0 && i < n && j >= 0 && j < n && grid[i][j] == num) {
        return helper(grid, i, j, num + 1);
    }

    // Right 2, Down 1
    i = row + 1;
    j = col + 2;
    if (i >= 0 && i < n && j >= 0 && j < n && grid[i][j] == num) {
        return helper(grid, i, j, num + 1);
    }

    // Left 2, Up 1
    i = row - 1;
    j = col - 2;
    if (i >= 0 && i < n && j >= 0 && j < n && grid[i][j] == num) {
        return helper(grid, i, j, num + 1);
    }

    // Left 2, Down 1
    i = row + 1;
    j = col - 2;
    if (i >= 0 && i < n && j >= 0 && j < n && grid[i][j] == num) {
        return helper(grid, i, j, num + 1);
    }

    return false;
}

    public boolean checkValidGrid(int[][] grid) {

       if(grid[0][0] != 0) return false;

       return  helper(grid,0,0,1);
    }
    public static void main(String[] args) {
        
    }
}