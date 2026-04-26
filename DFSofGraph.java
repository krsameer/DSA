// DFS of graph problem
//Given a connected undirected graph containing V vertices represented by a 2-d adjacency list adj[][], where each adj[i] represents the list of vertices connected to vertex i. Perform a Depth First Search (DFS) traversal starting from vertex 0, visiting vertices from left to right as per the given adjacency list, and return a list containing the DFS traversal of the graph.

// Note: Do traverse in the same order as they are in the given adjacency list.
//Input: adj[][] = [[2, 3, 1], [0], [0, 4], [0], [2]]
//Output: [0, 2, 4, 3, 1]

import java.util.*;

class DFSofGraph {
    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
        int V = adj.size();
        boolean[] vis = new boolean[V];
        ArrayList<Integer> ans = new ArrayList<>();  
        dfsHelper(0, adj, vis, ans); 
        return ans;
    }
    void dfsHelper(int source, ArrayList<ArrayList<Integer>> graph,
                   boolean[] vis, ArrayList<Integer> ans) {  
        vis[source] = true;
        ans.add(source);
        for (int neigh : graph.get(source)) {
            if (!vis[neigh]) {
                dfsHelper(neigh, graph, vis, ans);
            }
        }
    }
}