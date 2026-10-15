//https://leetcode.com/problems/find-the-kth-largest-integer-in-the-array/description/


import java.util.*;
 public class FKLIA {
    /*   
    // give NumberFormatException;
    
    public String kthLargestNumber(String[] nums, int k) {
        PriorityQueue<Integer> q = new PriorityQueue<>();
    
        for (int i = 0; i < nums.length; i++) {
    
            int num = Integer.parseInt(nums[i]);
            q.offer(num);
    
            if (q.size() > k) {
                q.poll();
            }
        }
    
        String s = Integer.toString(q.peek());
    
        return s;
    
    }
    */

    //  second;

    /*
    public String kthLargestNumber(String[] nums, int k) {
        PriorityQueue<String> q = new PriorityQueue<>((a, b) -> {
    
            if (a.length() != b.length()) {  // "8" , "10" ->  to length k base pe compare karega;
                return Integer.compare(a.length(), b.length());
            }
    
            return a.compareTo(b); // nahi to value k base pe;   "8" ,"9";
        });
    
        for (int i = 0; i < nums.length; i++) {
            q.offer(nums[i]);
    
            if (q.size() > k) {
                q.poll();
            }
        }
    
        return q.peek();
    }
    
    */

    public String kthLargestNumber(String[] nums, int k) {

        Arrays.sort(nums, (a, b) -> {
            if (a.length() != b.length()) {
                return Integer.compare(a.length(), b.length());
            }
            return a.compareTo(b);
        });

        return nums[nums.length - k];
    }

    public static void main(String args[]){

    }
}
