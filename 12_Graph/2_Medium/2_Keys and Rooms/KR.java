//https://leetcode.com/problems/keys-and-rooms/description/

import java.util.*;

public class KR {
    private void bfs(int i, boolean[] vis, List<List<Integer>> adj) {
        vis[i] = true;
        Queue<Integer> q = new LinkedList<>();
        q.add(i);

        while (q.size() > 0) {
            int front = q.remove();
            for (int key : adj.get(front)) {
                if (!vis[key]) {

                    vis[key] = true;
                    q.add(key);

                }
            }
        }
    }

    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n = rooms.size();
        boolean vis[] = new boolean[n];
        bfs(0, vis, rooms);
        for (int i = 0; i < n; i++) {
            if (vis[i] != true) {
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {

    }
}
