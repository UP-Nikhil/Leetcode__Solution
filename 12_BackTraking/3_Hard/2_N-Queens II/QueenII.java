// https://leetcode.com/problems/n-queens-ii/description/

import java.util.*;
class QueenII {

    public int Queen(char[][] bord, int row) {

        int n = bord.length;

        if (row == n) {
            return 1;
        }

        int count = 0;

        for (int col = 0; col < n; col++) {

            if (isSafe(bord, row, col)) {

                bord[row][col] = 'Q';

                count += Queen(bord, row + 1); // possible hone pe base case se 1 return mil k add  ho raha hai ;

                bord[row][col] = '.';
            }
        }

        return count;
    }

     private boolean isSafe(char bord[][], int row, int col) {

        int n = bord.length;

        // Check Column
        for (int i = 0; i < row; i++) {
            if (bord[i][col] == 'Q')
                return false;
        }

        int i, j;

        // Upper Left Diagonal
        i = row;
        j = col;
        while (i >= 0 && j >= 0) {
            if (bord[i][j] == 'Q')
                return false;
            i--;
            j--;
        }

        // Upper Right Diagonal
        i = row;
        j = col;
        while (i >= 0 && j < n) {
            if (bord[i][j] == 'Q')
                return false;
            i--;
            j++;
        }

        return true;
    }

    public int totalNQueens(int n) {

        char[][] bord = new char[n][n];

        for (int i = 0; i < n; i++) {
            Arrays.fill(bord[i], '.');
        }

        return Queen(bord, 0);
    }
    public static void main(String[] args) {
        
    }
}