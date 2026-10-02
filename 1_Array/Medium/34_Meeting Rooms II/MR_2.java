//https://www.geeksforgeeks.org/problems/attend-all-meetings-ii/1

import java.util.*;
 public class MR_2 {
	public int minMeetingRooms(int[] start, int[] end) {
		
		Map<Integer, Integer> tree = new TreeMap<>();
		
		for (int i = 0; i < start.length; i++) {
			tree.put(start[i], tree.getOrDefault(start[i], 0) + 1);
			tree.put(end[i], tree.getOrDefault(end[i], 0) - 1);
		}
		
		int booking = 0,
		maxbook = 0;
		
		for (var entry : tree.entrySet()) {
			booking += entry.getValue();
			maxbook = Math.max(maxbook, booking);
			
		}
		
		return maxbook;
	}
	
}
