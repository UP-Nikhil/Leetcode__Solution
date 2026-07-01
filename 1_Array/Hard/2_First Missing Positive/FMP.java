// https://leetcode.com/problems/first-missing-positive/description/

public class FMP {
    public int firstMissingPositive(int[] arr) {
        // cyclic sort use to sort nums; in 0(n)
        int i = 0;
        while (i < arr.length) {

            int correct = arr[i] - 1;
            
            // check condition  for ArrayOutOfBound  and skip negative number;
            if ( arr[i] <= arr.length && arr[i] >0 && arr[i] != arr[correct]) {

                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;

            } else {
                i++;
            }
        }
        // serch first positive number;
        for(int j = 0; j < arr.length; j++){
            if(arr[j]!= j+1){
                return j+1;
            }
        }
        return i+1;
    }
    public static void main(String[] args) {
        
    }
}
