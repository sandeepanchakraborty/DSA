class Solution {
    private int[] parent;

    public int[] findRedundantConnection(int[][] edges) {
        int n = edges.length;
        parent = new int[n + 1];
        
        // Initialize the parent array
        for (int i = 1; i <= n; i++) {
            parent[i] = i;
        }
        
        // Iterate through the edges
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            if (find(u) == find(v)) {
                return edge;
            }
            union(u, v);
        }
        
        return new int[0];
    }
    
    // Find the root of the node
    private int find(int x) {
        if (parent[x] != x) {
            parent[x] = find(parent[x]);
        }
        return parent[x];
    }
    
    // Union two nodes
    private void union(int x, int y) {
        parent[find(x)] = find(y);
    }
}
