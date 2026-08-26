//https://leetcode.com/problems/find-if-path-exists-in-graph/description/


import java.util.*;
public class FPEG {
    private void bfs(int start, boolean[] vis, List<List<Integer>> adj) {
        vis[start] = true;
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        
        while (!q.isEmpty()) {
            int front = q.poll();
            for (int num : adj.get(front)) {
                if (!vis[num]) {
                    vis[num] = true;
                    q.add(num);
                }
            }
        }
    }

    public boolean validPath(int n, int[][] edges, int source, int destination) {

        if(source == destination) return true; 

        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }
        
        for (int[] edge : edges) {
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]);
        }
        
        boolean[] vis = new boolean[n];
    
        bfs(source, vis, adj);
        
        return vis[destination];
    }
    public static void main(String[] args) {
        
    }
}
