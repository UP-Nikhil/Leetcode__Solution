//https://leetcode.com/problems/find-eventual-safe-states/description/

import java.util.*;

public class FESS {
    public List<Integer> eventualSafeNodes(int[][] graph) {

        int n = graph.length;

        // Reverse graph
        List<List<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        for (int i = 0; i < n; i++) {
            for (int ele : graph[i]) {
                // Original: i -> ele
                // Reverse: ele -> i
                adj.get(ele).add(i);
            }
        }

        // Out-degree of original graph
        int[] outDegree = new int[n];

        for (int i = 0; i < n; i++) {
            outDegree[i] = graph[i].length;
        }

        Queue<Integer> q = new LinkedList<>();

        // Terminal nodes
        for (int i = 0; i < n; i++) {
            if (outDegree[i] == 0) {
                q.add(i);
            }
        }

        List<Integer> ans = new ArrayList<>();

        // Kahn's algorithm
        while (!q.isEmpty()) {
            int top = q.remove();
            ans.add(top);

            for (int num : adj.get(top)) {
                outDegree[num]--;

                if (outDegree[num] == 0) {
                    q.add(num);
                }
            }
        }

        Collections.sort(ans);
        return ans;
    }
    public static void main(String[] args) {
        
    }
}