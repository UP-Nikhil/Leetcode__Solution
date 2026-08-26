
//https://www.geeksforgeeks.org/problems/detect-cycle-in-an-undirected-graph/1
import java.util.*;

public class UGC {

    static class Pair {
        int node;
        int parent;

        Pair(int node, int parent) {
            this.node = node;
            this.parent = parent;
        }
    }

    private static boolean bfs(int start, List<List<Integer>> adj, boolean[] visited) {

        Queue<Pair> q = new LinkedList<>();

        q.add(new Pair(start, -1));
        visited[start] = true;

        while (!q.isEmpty()) {

            Pair curr = q.poll();

            int node = curr.node;
            int parent = curr.parent;

            for (int num : adj.get(node)) {

                if (!visited[num]) {

                    visited[num] = true;

                    q.add(new Pair(num, node));
                } else if (num != parent) {

                    return true;
                }
            }
        }

        return false;
    }

    // // DFS CODE
    // private boolean dfs(int i, int p, List<List<Integer>> arr, boolean vis[]) {
    // vis[i] = true;
    // for (int num : arr.get(i)) {
    // if (!vis[num]) {
    // if (dfs(num, i, arr, vis)) {
    // return true;
    // }
    // } else if (num != p) {
    // return true;
    // }
    // }
    // return false;

    // }

    public boolean isCycle(int V, int[][] edges) {
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];

            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        boolean[] visited = new boolean[V];

        // Graph disconnected bhi ho sakta hai
        for (int i = 0; i < V; i++) {
            if (!visited[i]) {

                // for DFS

                // if (dfs(i, -1, adj, visited)) {
                // return true;
                // }

                // using BFS
                if (bfs(i, adj, visited)) {
                    return true;
                }
            }
        }

        return false;
    }
    public static void main(String[] args) {
        
    }

}
