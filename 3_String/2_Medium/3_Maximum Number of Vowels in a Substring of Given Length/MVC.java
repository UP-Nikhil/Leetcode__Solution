// https://leetcode.com/problems/maximum-number-of-vowels-in-a-substring-of-given-length/description/?envType=problem-list-v2&envId=sliding-window
public class MVC {
    private static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i'
                || ch == 'o' || ch == 'u';
    }

    public static int maxVowels(String s, int k) {

        int count = 0;
    

        for (int i = 0; i < k; i++) {
            if (isVowel(s.charAt(i))) {
                count++;
            }
        }

        int maxCount = count;

        for (int j = k; j < s.length(); j++) {

            if (isVowel(s.charAt(j))) {
                count++;
            }

            if (isVowel(s.charAt(j - k))) {
                count--;
            }

            maxCount = Math.max(maxCount, count);
        }

        return maxCount;
    }

    public static void main(String args[]) {
        String s= "abciiidef";
        System.out.println(maxVowels(s, 3));
    }
}
