// https://leetcode.com/problems/strobogrammatic-number/description/

public class StemopGrammatic_number {
    public static boolean check(String s) {
        // Digits 0 se 9 tak ki mapping array mein store ki hai
        // Index:    0  1   2   3   4   5  6   7  8  9
        int[] map = {0, 1, -1, -1, -1, -1, 9, -1, 8, 6};
        
        int i = 0;
        int j = s.length() - 1;
        
        while (i <= j) {
            int left = s.charAt(i) - '0';
            int right = s.charAt(j) - '0';
            
            // Agar digit valid nahi hai (jaise 2, 3, 4, 5, 7)
            if (map[left] == -1) {
                return false;
            }
            
            // Left digit ka rotation right digit ke barabar hona chahiye
            if (map[left] != right) {
                return false;
            }
            
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        // Example check
        // System.out.println(check("69"));   // Output: true

        
        System.out.println(check("198861")); // Output: false
    }
}
