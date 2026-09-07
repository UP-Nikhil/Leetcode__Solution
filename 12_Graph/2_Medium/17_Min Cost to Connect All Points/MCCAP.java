//https://leetcode.com/problems/min-cost-to-connect-all-points/description/

import  java.util.*;
 public class MCCAP {

    static class Pair {
        int node;
        int weight;
    
        Pair(int node, int weight) {
            this.node = node;
            this.weight = weight;
        }
    }
    
    public int minCostConnectPoints(int[][] points) {
    
        int n = points.length;
    
        PriorityQueue<Pair> pq = new PriorityQueue<>( (a, b) -> Integer.compare(a.weight, b.weight));
    
        boolean[] vis = new boolean[n];
    
        int totalCost = 0;
        int count = 0; // extra calculation se bachata hai;
    
        pq.add(new Pair(0, 0));
    
        while (count < n) {
    
            Pair curr = pq.poll();
    
            int node = curr.node;
            int cost = curr.weight;
    
            if (vis[node]) {
                continue;
            }
    
            vis[node] = true;
            count++;
    
            totalCost += cost;
    
            for (int next = 0; next < n; next++) {
    
                if (!vis[next]) {
    
                    int x1 = points[node][0];
                    int y1 = points[node][1];
    
                    int x2 = points[next][0];
                    int y2 = points[next][1];
    
                    int distance = Math.abs(x1 - x2) + Math.abs(y1 - y2);
    
                    pq.add(new Pair(next, distance));
                }
            }
        }
    
        return totalCost;
    }
    
    // Kruskal's Algorithim 

    /*
    static int[] parent;
    static int[] size;

    static int find(int x) {
        if (parent[x] == x) {
            return x;
        }

        return parent[x] = find(parent[x]);
    }

    static void union(int u, int v) {

        int x = find(u);
        int y = find(v);

        if (x == y) {
            return;
        }

        if (size[x] < size[y]) {
            parent[x] = y;
            size[y] += size[x];
        } else {
            parent[y] = x;
            size[x] += size[y];
        }
    }

    public int minCostConnectPoints(int[][] points) {
        int n = points.length;
        size = new int[n];
        parent = new int[n];
        for (int i = 0; i < n; i++) {
            parent[i] = i;
            size[i] = 1;
        }

        // Saare possible edges banao
        List<int[]> edges = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            for (int j = i + 1; j < n; j++) {

                int x1 = points[i][0];
                int y1 = points[i][1];

                int x2 = points[j][0];
                int y2 = points[j][1];

                int wt = Math.abs(x1 - x2) + Math.abs(y1 - y2);

                edges.add(new int[] { i, j, wt });
            }
        }

        // Weight ke according sort
        edges.sort((a, b) -> Integer.compare(a[2], b[2]));

        int sum = 0;
        int minEdge = 0;
        for (int edge[] : edges) {
            int u = edge[0];
            int v = edge[1];
            int wt = edge[2];

            if (find(u) != find(v)) {
                union(u, v);
                sum += wt;
                minEdge++;
            }

            if (minEdge == n - 1) {
                break;
            }
        }

        return sum;
    }
    */

    public static void main(String[] args) {
        
    }

}