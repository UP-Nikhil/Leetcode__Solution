//https://leetcode.com/problems/delete-characters-to-make-fancy-string/description/
public class DCMFS {

    public String makeFancyString(String s) {

        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (ans.length() > 1 && ch == ans.charAt(ans.length() - 1) && ch == ans.charAt(ans.length() - 2)) {
                continue;
            } else {
                ans.append(ch);
            }
        }

        return ans.toString();

    }

    public static void main(String[] args) {

    }
}
