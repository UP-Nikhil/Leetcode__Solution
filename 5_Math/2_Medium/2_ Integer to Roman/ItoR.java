// https://leetcode.com/problems/integer-to-roman/description/

public class ItoR {
    public static  String intToRoman(int num) {

        int[] values = {
                1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };

        String[] romans = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"
        };

        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < values.length; i++) {

            while (num >= values[i]) {
                ans.append(romans[i]);
                num -= values[i];
            }
        }

        return ans.toString();
    }

    public static void main(String[] args) {
        int n= 298;
        System.out.println(intToRoman(n));

    }         
}
