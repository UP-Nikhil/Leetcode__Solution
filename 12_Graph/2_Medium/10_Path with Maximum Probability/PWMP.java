//https://leetcode.com/problems/path-with-maximum-probability/description/
import java.util.*
;
public class PWMP {

    static class Pair {
        int node;
        double prob;

        Pair(int node, double prob) {
            this.node = node;
            this.prob = prob;
        }
    }

    public double maxProbability( int n, int[][] edges, double[] succProb, int start_node, int end_node ) {

        List<List<Pair>> adj = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        for (int i = 0; i < edges.length; i++) {

            int u = edges[i][0];
            int v = edges[i][1];

            double prob = succProb[i];

            adj.get(u).add( new Pair(v, prob));

            adj.get(v).add( new Pair(u, prob));
        }

        // 5. Dijkstra  Algorithim 
        double[] dist = new double[n];

        Arrays.fill(dist, 0.0);
        dist[start_node] = 1.0;

        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) ->  Double.compare( b.prob, a.prob)); // Max heap;

        pq.add(new Pair(start_node, 1.0));

        while (!pq.isEmpty()) {

            Pair current = pq.remove();

            int node = current.node;
            double prob = current.prob;

            if (prob < dist[node]) {
                continue;
            }

            // Destination mil gaya
            if (node == end_node) {
                return prob;
            }

            for (Pair next : adj.get(node)) {

                int neighbor = next.node;
                double E_prob = next.prob;

                double total_prob = prob * E_prob;

                // Maximum prob update
                if (total_prob > dist[neighbor]) {

                    dist[neighbor] = total_prob;

                    pq.add(new Pair( neighbor, total_prob) );
                }
            }
        }

        return 0.0;
    }
    public static void main(String[] args) {
        
    }
}
