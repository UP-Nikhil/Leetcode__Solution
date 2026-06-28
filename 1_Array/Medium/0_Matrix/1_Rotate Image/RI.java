//https://leetcode.com/problems/rotate-image/description/

public class RI {
    public void rotate(int[][] matrix) {
        // transpose
        int n = matrix.length;
        for(int i=0; i< n; i++){
            for(int j =i; j< n; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        // reverse
        for(int i =0; i<n; i++){
            int l=0;
            int r = matrix[0].length -1;
            while(l<r){
                int temp = matrix[i][l];
                matrix[i][l] = matrix[i][r];
                matrix[i][r] = temp;
                l++;
                r--;
            }
        }
        
    }
    public static void main(String[] args) {
        
    }
}
