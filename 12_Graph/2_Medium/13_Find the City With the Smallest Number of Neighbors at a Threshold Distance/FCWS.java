//https://leetcode.com/problems/find-the-city-with-the-smallest-number-of-neighbors-at-a-threshold-distance/description/

 public  class FCWS {

    public int findTheCity(int n, int[][] edges, int distanceThreshold) {

        int INF = Integer.MAX_VALUE;

        // Distance matrix
        int[][] dist = new int[n][n];

        // Initially sabko INF
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                dist[i][j] = INF;
            }
        }

        // Same city ka distance 0
        for (int i = 0; i < n; i++) {
            dist[i][i] = 0;
        }

        // Edges ko matrix mein convert karo
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            int wt = edge[2];

            dist[u][v] = wt;
            dist[v][u] = wt;
        }

        // Floyd-Warshall
        for (int via = 0; via < n; via++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {

                    if (dist[i][via] != INF &&
                            dist[via][j] != INF) {

                        dist[i][j] = Math.min(
                                dist[i][j],
                                dist[i][via] + dist[via][j]);
                    }
                }
            }
        }
        // find city 
        int result = -1;
        int minCount = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {

            int count = 0;

            for (int j = 0; j < n; j++) {

                if (dist[i][j] <= distanceThreshold) {
                    count++;
                }
            }

            // Tie hone par larger index
            if (count <= minCount) {
                minCount = count;
                result = i;
            }
        }

        return result;
    }
    public static void main(String[] args) {
        
    }
}