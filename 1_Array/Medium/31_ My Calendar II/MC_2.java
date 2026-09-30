//https://leetcode.com/problems/my-calendar-ii/description/
import java.util.*;

public class  MC_2 {

    /*
    
    List<int[]> bookings;
    List<int[]> overlaps;
    
    public MyCalendarTwo() {
        bookings = new ArrayList<>();
        overlaps = new ArrayList<>();
    }
    
    public boolean book(int start, int end) {
    
        for (int[] overlap : overlaps) {
            if (start < overlap[1] && end > overlap[0]) {
                return false;
            }
        }
    
        for (int[] booking : bookings) {
            if (start < booking[1] && end > booking[0]) {
                overlaps.add(new int[] {
                        Math.max(start, booking[0]),
                        Math.min(end, booking[1])
                });
            }
        }
    
        bookings.add(new int[] { start, end });
        return true;
    }
    
    */
    private Map<Integer, Integer> tree;

    public  void  MyCalendarTwo() {
        tree = new TreeMap<>();
    }

    public boolean book(int start, int end) {

        tree.put(start, tree.getOrDefault(start, 0) + 1);
        tree.put(end, tree.getOrDefault(end, 0) - 1);

        int booking = 0;
        for (var entry : tree.entrySet()) {
            booking += entry.getValue();

            if (booking >= 3) {

                tree.put(start, tree.getOrDefault(start, 0) - 1);
                tree.put(end, tree.getOrDefault(end, 0) + 1);

                return false;
            }
        }
        return true;
    }

    public static void main(String args []){

    }

}

/*
  Your MyCalendarTwo object will be instantiated and called as such:
  MyCalendarTwo obj = new MyCalendarTwo();
  boolean param_1 = obj.book(startTime,endTime);
 */