//https://www.geeksforgeeks.org/problems/max-sum-subarray-of-size-k5313/1

public class MSS {
    public int maxSubarraySum(int[] arr, int k) {
       int sum=0;
       int max = Integer.MIN_VALUE;
       for(int i =0; i< k; i++){
           sum += arr[i];
       }
       max = Math.max(max, sum);
       int j = k;
       int  i =0;
       while(j < arr.length){
           sum = sum + arr[j] -arr[i];
           max = Math.max(max, sum);
           j++;
           i++;
       }
       return max;
    }
    public static void main(String[] args) {
        
    }
}