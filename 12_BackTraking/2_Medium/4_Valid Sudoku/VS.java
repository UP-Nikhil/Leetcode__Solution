//https://leetcode.com/problems/valid-sudoku/description/
 class VS{

    // Helper method to check if a number can be placed at board[row][col]
    public boolean isValid(char[][] board, int row, int col, char num) {
        // 1. Check the row for duplicates
        for (int j = 0; j < 9; j++) {
            if (board[row][j] == num) return false;
        }

        // 2. Check the column for duplicates
        for (int i = 0; i < 9; i++) {
            if (board[i][col] == num) return false;
        }

        // 3. Check the specific 3x3 sub-grid
        int sRow = (row / 3) * 3;
        int sCol = (col / 3) * 3;
        for (int i = sRow; i < sRow + 3; i++) {
            for (int j = sCol; j < sCol + 3; j++) {
                if (board[i][j] == num) return false;
            }
        }

        return true;
    }

    // Main validation function shown in the video screenshot
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                // Only validate cells that contain a digit
                if (board[i][j] != '.') {
                    char num = board[i][j];
                    
                    // Temporarily empty the cell to avoid self-comparison in isValid
                    board[i][j] = '.';
                    
                    // If the number breaks Sudoku rules, the board is invalid
                    if (isValid(board, i, j, num) == false) {
                        return false;
                    }
                    // Restore the original number back to the board
                    board[i][j] = num;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        
    }
}