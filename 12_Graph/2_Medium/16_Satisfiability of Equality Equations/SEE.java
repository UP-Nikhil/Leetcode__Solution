//https://leetcode.com/problems/satisfiability-of-equality-equations/description/


 public class SEE {

    // DSU
    static int[] size, parrent;

    public int find(int i) {
        if (i == parrent[i]) {
            return i;
        }
        return parrent[i] = find(parrent[i]);
    }

    public void union(int a, int b) {
        int u = find(a);
        int v = find(b);

        if (u == v) {
            return;
        }
        if (size[u] > size[v]) {
            parrent[v] = u;
            size[u] += size[v];
        } else {
            parrent[u] = v;
            size[v] += size[u];
        }

    }

    public boolean equationsPossible(String[] equations) {
        size = new int[26];
        parrent = new int[26];

        for (int i = 0; i < 26; i++) {
            size[i] = 1;
            parrent[i] = i;
        }

        for (String s : equations) {
            if (s.charAt(1) == '=') {
                int u = s.charAt(0) - 'a';
                int v = s.charAt(3) - 'a';
                union(u, v);
            }
        }

        for (String s : equations) {
            if (s.charAt(1) == '!') {
                int u = s.charAt(0) - 'a';
                int v = s.charAt(3) - 'a';
                if (find(u) == find(v)) {
                    return false;
                }
            }
        }

        return true;
    }
    public static void main(String[] args) {
        
    }
}