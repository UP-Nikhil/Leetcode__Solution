//https://leetcode.com/problems/car-pooling/description/

import java.util.*;
public class CP {
 
   
    // TC = O(n log n);
    // SC = O(n);
    public boolean carPooling(int[][] trips, int capacity) {
   
        Map<Integer, Integer> tree = new TreeMap<>();
        for (int arr[] : trips) {
            int pass = arr[0],
                    st = arr[1],
                    end = arr[2];

            tree.put(st, tree.getOrDefault(st, 0) + pass);
            tree.put(end, tree.getOrDefault(end, 0) - pass);

        }
        int cap = 0;
        for (var entry : tree.entrySet()) {

            cap  = cap + entry.getValue();
            if (cap > capacity) {
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        
    }
} 

