
public class MKM {
    private static void Knight(char[][] bord, int row, int col, int num) {
        int n = bord.length;

        // base base ;
        // N Knights place ho gaye
        if (num == n) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(bord[i][j]);
                }
                System.out.println();
            }
            System.out.println();
            return;
        }

        // Board khatam
        if (row == n) {
            return;
        }

        else if (isSafe(bord, row, col)) {

            bord[row][col] = 'K';

            if (col != n - 1)
                Knight(bord, row, col + 1, num + 1);
            else
                Knight(bord, row + 1, 0, num + 1);

            bord[row][col] = '.'; // Backtracking

        } // if not safe;
        if (col != n - 1)
            Knight(bord, row, col + 1, num + 1);
        else
            Knight(bord, row + 1, 0, num + 1);

    }

    private static boolean isSafe(char[][] grid, int row, int col) {

        int n = grid.length;

        // Up 2, Right 1
        int i = row - 2;
        int j = col + 1;
        if (i >= 0 && i < n && j >= 0 && j < n && grid[i][j] == 'K') {
            return false;
        }

        // Up 2, Left 1
        i = row - 2;
        j = col - 1;
        if (i >= 0 && i < n && j >= 0 && j < n && grid[i][j] == 'K') {
            return false;
        }

        // Down 2, Right 1
        i = row + 2;
        j = col + 1;
        if (i >= 0 && i < n && j >= 0 && j < n && grid[i][j] == 'K') {
            return false;
        }
        // Down 2, Left 1
        i = row + 2;
        j = col - 1;
        if (i >= 0 && i < n && j >= 0 && j < n && grid[i][j] == 'K') {
            return false;
        }

        // Right 2, Up 1
        i = row - 1;
        j = col + 2;
        if (i >= 0 && i < n && j >= 0 && j < n && grid[i][j] == 'K') {
            return false;
        }

        // Right 2, Down 1
        i = row + 1;
        j = col + 2;
        if (i >= 0 && i < n && j >= 0 && j < n && grid[i][j] == 'K') {
            return false;
        }
        // Left 2, Up 1
        i = row - 1;
        j = col - 2;
        if (i >= 0 && i < n && j >= 0 && j < n && grid[i][j] == 'K') {
            return false;
        }

        // Left 2, Down 1
        i = row + 1;
        j = col - 2;
        if (i >= 0 && i < n && j >= 0 && j < n && grid[i][j] == 'K') {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int n = 4;
        char bord[][] = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                bord[i][j] = '.';
            }
        }
        Knight(bord, 0, 0, 0);

    }

}
