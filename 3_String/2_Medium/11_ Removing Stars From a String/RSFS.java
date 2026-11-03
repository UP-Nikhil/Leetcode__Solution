//https://leetcode.com/problems/removing-stars-from-a-string/description/

public class RSFS {
    /* My Thinking 
    public String removeStars(String s) {
    
        StringBuilder ans = new StringBuilder();
        for(int i =0; i<s.length(); i++){
                char ch = s.charAt(i);
                if(ch == '*' && ans.length() > 0){
                  ans.deleteCharAt(ans.length() - 1);
                }
                else{
                    ans.append(ch);
                }
        }
        return ans.toString();
        
    }
    */

    public String removeStars(String s) {

        char[] arr = s.toCharArray();
        int j = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == '*') {
                if (j > 0) {
                    j--;
                }
            } else {
                arr[j++] = arr[i];
            }
        }

        return new String(arr, 0, j);// ye ek type ka constructer hia jo Srtring bana k deta hia new String(charArray, offset, count);
    }

    public static void main(String[] args) {
        
    }
}
