//https://leetcode.com/problems/n-queens/description/
import java.util.*;

class Queen  {
     public void Queen(char bord[][], int row ,List<List<String>> ans) {

        int n = bord.length;

        if (row == n) {
            ArrayList<String> l= new ArrayList<>();
            for(int  i=0 ; i < n; i++){
                String s= "";
                for(int j =0; j< n; j++){
                    s += bord[i][j];
                }
                l.add(s);
            }
            ans.add(l);
            return;
        }

        for (int j = 0; j < n; j++) {

            if (isSafe(bord, row, j)) {

                bord[row][j] = 'Q';

                Queen(bord, row + 1,ans);

                bord[row][j] = '.';   // Backtracking
            }
        }
    }

    private boolean isSafe(char bord[][], int row, int col) {

        int n = bord.length;

        // Check Row
        for (int j = 0; j < n; j++) {
            if (bord[row][j] == 'Q')
                return false;
        }

        // Check Column
        for (int i = 0; i < n; i++) {
            if (bord[i][col] == 'Q')
                return false;
        }

        int i = row;
        int j = col;

        // NE
        while (i >= 0 && j < n) {
            if (bord[i][j] == 'Q')
                return false;
            i--;
            j++;
        }

        // SE
        i = row;
        j = col;
        while (i < n && j < n) {
            if (bord[i][j] == 'Q')
                return false;
            i++;
            j++;
        }

        // SW
        i = row;
        j = col;
        while (i < n && j >= 0) {
            if (bord[i][j] == 'Q')
                return false;
            i++;
            j--;
        }

        // NW
        i = row;
        j = col;
        while (i >= 0 && j >= 0) {
            if (bord[i][j] == 'Q')
                return false;
            i--;
            j--;
        }

        return true;
    }
    public List<List<String>> solveNQueens(int n) {
        char bord[][] = new char[n][n];
        for(int i=0 ; i< n; i++){
            for(int j = 0; j < n; j++){
                bord[i][j]='.';
            }
        }
        List<List<String>> ans = new ArrayList<>();
        Queen(bord, 0, ans);
        return ans;
    }
    public static void main(String[] args) {
        
    }
}