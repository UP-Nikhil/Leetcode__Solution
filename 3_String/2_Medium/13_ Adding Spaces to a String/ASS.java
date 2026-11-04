//https://leetcode.com/problems/adding-spaces-to-a-string/description/

public class ASS {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder ans = new StringBuilder();
        int j = 0; // spaces index

        for (int i = 0; i < s.length(); i++) {
            if (j < spaces.length && i == spaces[j]) {
                ans.append(' ');
                j++;
            }
            ans.append(s.charAt(i));
        }

        return ans.toString();
    }
    public static void main(String[] args) {
        
    }
}
