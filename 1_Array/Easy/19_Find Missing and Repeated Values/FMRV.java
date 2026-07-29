
//https://leetcode.com/problems/find-missing-and-repeated-values/description/
public class FMRV {
    private void cyclic( int arr[]){
       int i=0;
       while(i <arr.length){
          int correct = arr[i]-1;
          if( arr[i] != arr[correct]){
            int temp = arr[i];
            arr[i] = arr[correct];
            arr[correct] = temp;
          }
          else{
            i++;
          }
       }             
    }
    public int[] findMissingAndRepeatedValues(int[][] grid) {
         int n =grid.length;
         int ans[] = new int[n*n];
        int count =0;
        for(int i =0; i < n; i++ ){
            for( int j =0; j < n; j++){
                ans[count++] = grid[i][j];   
            }
        }
        cyclic(ans);
       for(int i =0; i < ans.length; i++){
          if(ans[i] != i+1){
            return new int []{ans[i],i+1};
          }
       }
       return new int[]{-1,-1};
        
    }
    public static void main(String[] args) {
        
    }
}
