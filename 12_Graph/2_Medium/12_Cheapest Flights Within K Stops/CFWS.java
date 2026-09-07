//https://leetcode.com/problems/cheapest-flights-within-k-stops/description/

import java.util.*;

public class CFWS {

    static class Pair {
        int node;
        int cost;

        Pair(int node, int cost) {
            this.node = node;
            this.cost = cost;
        }
    }

    static class triplet {
        int node;
        int cost;
        int stops;

        public triplet(int node, int cost, int stops) {
            this.node = node;
            this.cost = cost;
            this.stops = stops;
        }
    }

    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {

        List<List<Pair>> adj = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        for (int[] airport : flights) {
            int u = airport[0];
            int v = airport[1];
            int cost = airport[2];

            adj.get(u).add(new Pair(v, cost));
        }

        // usinf dijkstra algorithm;

        int[] ans = new int[n];
        Arrays.fill(ans, Integer.MAX_VALUE);

        ans[src] = 0;

        Queue<triplet> pq = new LinkedList<>();

        pq.offer(new triplet(src, 0, 0));

        while (!pq.isEmpty()) {

            triplet top = pq.poll();

            int node = top.node;
            int cost = top.cost;
            int stops = top.stops;

            if (stops == k + 1) {
                continue;
            }

            for (Pair p : adj.get(node)) {

                int totalcost = cost + p.cost;

                if (totalcost < ans[p.node]) {

                    ans[p.node] = totalcost;

                    pq.offer(new triplet(p.node, totalcost, stops + 1));
                }
            }
        }

        if (ans[dst] == Integer.MAX_VALUE) {
            return -1;
        }
        return ans[dst];
    }
    public static void main(String[] args) {
        
    }
}
