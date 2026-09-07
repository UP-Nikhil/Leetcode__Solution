//https://leetcode.com/problems/redundant-connection/description/

public class RC {
     static int[] size, parrent, rank;

    public int find(int i){
        if(i == parrent[i]){
            return i;
        }
        return parrent[i] = find(parrent[i]);
    }

    public void union(int a, int b){
        int u = find(a);
        int v = find(b);
        
        if(u == v){
            return;
        }
        if(size[u] > size[v]){
           parrent[v] = u;
           size[u] += size[v];
        }
        else {
            parrent[u] =v;
            size[v] += size[u];
        }

    }
    public int[] findRedundantConnection(int[][] edges) {
        int n = 1 + edges.length;
        size = new int[n];
        rank = new int[n];
        parrent = new int[n];
       
        for(int i = 1; i< n; i++){
             size[i]= 1;
             rank[i] = 0;
             parrent[i] =i;
        }

        for(int edge []: edges){
            int u = edge[0];
            int  v = edge[1];
            
            if(find(u) == find(v)){
                return  edge;
            }
            union(u,v);
        }
        return new int [0];
    }
    public static void main(String[] args) {
        
    }
}