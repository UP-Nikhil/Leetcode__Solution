//https://leetcode.com/problems/network-delay-time/description/

import java.util.*;

public class NDT {

    static class Pair {
        int node;
        int distance;

        Pair(int node, int distance) {
            this.node = node;
            this.distance = distance;
        }
    }

    public int networkDelayTime(int[][] times, int n, int k) {

        List<List<Pair>> adj = new ArrayList<>();

        for (int i = 0; i <= n; i++) {
            adj.add(new ArrayList<>());
        }

        for (int[] edge : times) {

            int u = edge[0];
            int v = edge[1];
            int time = edge[2];

            adj.get(u).add(new Pair(v, time));
        }

        // Dijkstra's algorithim;
        int[] dist = new int[n + 1];

        Arrays.fill(dist, Integer.MAX_VALUE);

        dist[k] = 0;

        // ye minimum priority queeu hai; if max banana hai to bas compare(b,a) kar dena
        // hai bas;
        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> Integer.compare(a.distance, b.distance));

        pq.add(new Pair(k, 0));

        while (!pq.isEmpty()) {

            Pair current = pq.remove();

            int node = current.node;
            int distance = current.distance;

            if (distance > dist[node]) {
                continue;
            }
            for (Pair next : adj.get(node)) {

                int neighbor = next.node;
                int weight = next.distance;

                int newDistance = distance + weight;

                if (newDistance < dist[neighbor]) {

                    dist[neighbor] = newDistance; // Distance update
                    pq.add(new Pair(neighbor, newDistance));
                }
            }
        }

        int answer = -1;

        for (int i = 1; i <= n; i++) {
            if (dist[i] == Integer.MAX_VALUE)
                return -1;
            answer = Math.max(answer, dist[i]);
        }
        return answer;
    }

    public static void main(String[] args) {

    }
}
