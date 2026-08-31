//https://leetcode.com/problems/course-schedule/description/

import java.util.*;
class CS_I {

    // 
    /*
    public boolean canFinish(int n, int[][] prerequisites) {
       // convert in list;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
    
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }
    
        for (int[] sem : prerequisites) {
            int u = sem[0];
            int v = sem[1];
    
            adj.get(u).add(v);
        }
        
        // define inDegree array;
        int[] inDegree = new int[n];
         
        // fill the degree; ;
        for (int u = 0; u < n; u++) {
            for (int num : adj.get(u)) {
                inDegree[num]++;
            }
        }
      
        Queue<Integer> q = new LinkedList<>();
    
         // fill the degree, jis node k degree 0 hia usko fill kar do arr me ;
        for (int i = 0; i < n; i++) {
            if (inDegree[i] == 0) {
                q.add(i);
            }
        }
    
         // store the result;
      int count = 0;
        
       // Kahn’s Algorithm (BFS)
        while (!q.isEmpty()) {
    
            int top = q.poll();
    
            count++;
    
            for (int next : adj.get(top)) {
    
                inDegree[next]--;
    
                if (inDegree[next] == 0) {
                    q.add(next);
                }
            }
        }
    
        return count == n;
    }
    */

    private boolean dfs(int i, List<List<Integer>> adj,
            boolean[] visited, boolean[] path) {

        visited[i] = true;
        path[i] = true;

        for (int num : adj.get(i)) {

            if (path[num]) {
                return true;
            }

            if (!visited[num]) {
                if (dfs(num, adj, visited, path)) {
                    return true;
                }
            }
        }

        // Current DFS path se bahar
        path[i] = false;

        return false;
    }

    public boolean canFinish(int V, int[][] prerequisites) {

        List<List<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        for (int[] edge : prerequisites) {
            int u = edge[0];
            int v = edge[1];

            adj.get(u).add(v);
        }

        boolean[] visited = new boolean[V];
        boolean[] path = new boolean[V];

        for (int i = 0; i < V; i++) {

            if (!visited[i]) {

                if (dfs(i, adj, visited, path)) {
                    return false; 
                }
            }
        }

        return true; 
    }

}