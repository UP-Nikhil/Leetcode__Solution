//https://leetcode.com/problems/find-median-from-data-stream/description/

import java.util.*;

// brute force 

/*
class MedianFinder {

    List<Integer> list;

    public MedianFinder() {
        list = new ArrayList<>();
    }

    public void addNum(int num) {
        list.add(num);
    }

    public double findMedian() {
        Collections.sort(list);
        int n = list.size();

        if (n % 2 == 0) {

            return (list.get(n / 2) + list.get((n / 2) - 1)) / 2.0;

        } else {

            return list.get(n / 2);
        }

    }
}
*/

 public class MedianFinder {
    PriorityQueue<Integer> max;
    PriorityQueue<Integer> min;

    public MedianFinder() {
        max = new PriorityQueue<>((a, b) -> Integer.compare(b, a));
        min = new PriorityQueue<>((a, b) -> Integer.compare(a, b));

    }

    public void addNum(int num) {
        if (max.isEmpty() || num <= max.peek()) {
            max.add(num);
        } else {
            min.add(num);
        }
        // balanc 
        if (max.size() > min.size() + 1) {
            min.add(max.poll());
        } else if (min.size() > max.size()) {
            max.add(min.poll());
        }
    }

    public double findMedian() {

        if (min.size() == max.size()) {

            return (max.peek() + min.peek()) / 2.0;

        } else {

            return max.peek();

        }

    }

    public static void main(String[] args) {
        MedianFinder m = new MedianFinder();
        m.addNum(2);
        m.addNum(13);
        m.addNum(10);
        m.addNum(20);
        System.out.println(m.findMedian());
    }
}
