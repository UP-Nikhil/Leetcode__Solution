//https://leetcode.com/problems/fruit-into-baskets/description/

import java.util.*;

public class FIB {

    public int totalFruit(int[] fruits) {

        HashMap<Integer, Integer> map = new HashMap<>();

        int max = 0;
        int left = 0;
        int right = 0;

        while (right < fruits.length) {

            map.put(fruits[right], map.getOrDefault(fruits[right], 0) + 1);

            while (map.size() > 2) {

                map.put(fruits[left], map.get(fruits[left]) - 1);

                if (map.get(fruits[left]) == 0) {
                    map.remove(fruits[left]);
                }

                left++;
            }

            max = Math.max(max, right - left + 1);

            right++;
        }

        return max;
    }

    public static void main(String[] args) {

    }
}
