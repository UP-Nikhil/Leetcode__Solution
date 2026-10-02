//https://leetcode.com/problems/my-calendar-iii/description/

import java.util.*;
 public class  MC_3 {

    private Map<Integer, Integer> tree;
    int maxbook = 0;

    public void  MyCalendarThree() {
        tree = new TreeMap<>();
    }

    public int book(int start, int end) {
        tree.put(start, tree.getOrDefault(start, 0) + 1);
        tree.put(end, tree.getOrDefault(end, 0) - 1);

        int booking = 0;
       
        for (var entry : tree.entrySet()) {
            booking += entry.getValue();
            maxbook = Math.max(maxbook, booking);

        }

        return maxbook;
    }
    public static void main(String[] args) {
        

    }
}

/**
 * Your MyCalendarThree object will be instantiated and called as such:
 * MyCalendarThree obj = new MyCalendarThree();
 * int param_1 = obj.book(startTime,endTime);
 */