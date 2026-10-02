//https://www.geeksforgeeks.org/problems/attend-all-meetings/1

import java.util.*;

public class MR_1 {

	static   boolean canAttend(int[][] arr) {
		Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));
		for (int i = 1; i < arr.length; i++) {
			int st[] = arr[i - 1];
			int curr[] = arr[i];
			if (st[1] > curr[0]) {
				return false;
			}
		}
		return true;
	}

	public static void main(String args[]) {
		int[][] meetings = {{0, 30}, {5, 10}, {15, 20}};
		System.out.println(canAttend(meetings));
	}
}
