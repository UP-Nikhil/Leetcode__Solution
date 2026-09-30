//https://leetcode.com/problems/my-calendar-i/description/

import java.util.*;

public class Mc_1 {

    private Map<Integer, Integer> tree;

    public void MyCalendar() {
        tree = new TreeMap<>();
    }

    public boolean book(int start, int end) {
        tree.put(start, tree.getOrDefault(start, 0) + 1);
        tree.put(end, tree.getOrDefault(end, 0) - 1);

        int booking = 0;
        for (var entry : tree.entrySet()) {
            booking += entry.getValue();

            if (booking >= 2) {

                tree.put(start, tree.getOrDefault(start, 0) - 1);
                tree.put(end, tree.getOrDefault(end, 0) + 1);

                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

    }
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(startTime,endTime);
 */
