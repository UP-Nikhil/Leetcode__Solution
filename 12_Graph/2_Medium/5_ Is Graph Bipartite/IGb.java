///https://leetcode.com/problems/is-graph-bipartite/description/

import java.util.*;
public class IGb {
       /*
    static boolean ans;
    private void bfs(int i, int arr[][], int vis[]){
       Queue<Integer> q = new LinkedList<>();
              vis[i] = 1;
       q.add(i);
       while(!q.isEmpty()){
             int front = q.poll();
             int color = vis[front];
             for(int num : arr[front]){
                if(vis[num] == vis[front]){
                    ans = false;
                    return;
                }
                else if( vis[num] == -1){
                    vis[num] = 1- color;
                    q.add(num);
                }
                  
             }
       }
    }
    public boolean isBipartite(int[][] graph) {
        ans = true;
        int n = graph.length;
        int vis[] = new int [n];
        Arrays.fill(vis, -1);
        for(int i = 0; i < n; i++){
            if( vis[i] == -1){
                if(ans ==  false) return ans;
                bfs(i, graph, vis);
            }
        }
        return ans;
    
    }
    */

    // Using DFS 
    private boolean dfs(int i, int color, int[][] arr, int[] vis) {
        vis[i] = color;

        for (int num : arr[i]) {
            if (vis[num] == vis[i]) {
                return false;

            } else if (vis[num] == -1) {

                if (dfs(num, 1 - color, arr, vis) == false) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean isBipartite(int[][] graph) {
        int n = graph.length;
        int vis[] = new int[n];
        Arrays.fill(vis, -1);
        for (int i = 0; i < n; i++) {
            if (vis[i] == -1) {
                
                // Red = 1; 
                // Blue = 0;

                if (dfs(i, 1, graph, vis) == false) { 
                    return false;
                }
            }
        }
        return true;

    }
    public static void main(String[] args) {
        
    }
}
