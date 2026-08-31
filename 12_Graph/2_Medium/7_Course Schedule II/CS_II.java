//https://leetcode.com/problems/course-schedule-ii/description/

import java.util.*;

class CS_II { 
    public int[] findOrder(int V, int[][] prerequisites) { 
      
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>(); 
        for (int i = 0; i < V; i++) { 
            adj.add(new ArrayList<>()); 
        } 
        
        for (int[] edge : prerequisites) { 
            int u = edge[0]; 
            int v = edge[1]; 
            adj.get(v).add(u); 
        } 

        int[] inDegree = new int[V]; 
        for (int u = 0; u < V; u++) { 
            for (int num : adj.get(u)) { 
                inDegree[num]++; 
            } 
        } 

        // 3. Queue me un nodes ko dalna jinki in-degree 0 hai
        Queue<Integer> q = new LinkedList<>(); 
        for (int i = 0; i < V; i++) { 
            if (inDegree[i] == 0) { 
                q.add(i); 
            } 
        } 

        // 4. Kahn's Algorithm (BFS) se order nikalna
        int[] result = new int[V];
        int index = 0; 

        while (!q.isEmpty()) { 
            int top = q.poll(); 
            result[index++] = top; 

            for (int next : adj.get(top)) { 
                inDegree[next]--; 
                if (inDegree[next] == 0) { 
                    q.add(next); 
                } 
            } 
        } 

        // 5. Agar saare nodes visit nahi hue, toh order impossible hai
        if (index == V) {
            return result; 
        } else {
            return new int[0]; // Empty array [] return karega
        }
    } 
}
