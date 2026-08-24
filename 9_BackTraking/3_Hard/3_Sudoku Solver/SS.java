//https://leetcode.com/problems/sudoku-solver/description/
class SS {
    static int check =0;
    private void salve(char board[][], int row, int col){
        if(row == 9){
            check =1;
            return;
        }
        if(board[row][col] != '.'){
            if(col !=8 ) salve(board,row,col+1);
            else salve(board, row +1, 0);
        }
        else{ // board[row][col] == '.';
           for(char ch = '1'; ch <= '9'; ch++){
             if(isSafe( board,row,col, ch)){
                board[row][col] = ch;
                if(col !=8 ) salve(board,row,col+1);
                else salve(board,row+1, 0);
                if(check == 1) return ;
                board[row][col]='.'; // backtraking;
             }
           }

        }
    }

    // isSafe function;
   public boolean isSafe(char[][] board, int row, int col, char num) {
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

    public void solveSudoku(char[][] board) {
        salve(board, 0, 0 );
        check = 0;
        
    }
    public static void main(String[] args) {
        
    }
}