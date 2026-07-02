//https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/

public class FSL {
     // first try,  TC = O(n); SC = O(1);
   /* public char nextGreatestLetter(char[] letters, char target) {
        for(int i =0; i< letters.length; i++){
            if(letters[i]> target){
                return letters[i];
            }
        }
        return letters[0];
    }
    */
    public char nextGreatestLetter(char[] letters, char target) {
        int left=0;
        int right = letters.length -1;
        while(left <= right){
            int mid = left +( right - left )/2;
            if( letters [ mid] <= target ){
                left =mid+1;
            }
            else {
                right = mid - 1;
            }
        }
        return letters[left % letters.length ];
        
    }
    public static void main(String[] args) {
        
    }
}
