class Solution {
    public int findCircleNum(int[][] isConnected) {
        int count=0;
        int v= isConnected.length;
        boolean[] vis=new boolean[v];

        for (int i = 0; i < v; i++) {
            if (!vis[i]){
                dfs(i,isConnected,vis);
                count++;
            }
        }
        return count;
    }

    public void dfs(int node, int[][] adj, boolean[] vis){
        vis[node]=true;
        for(int i=0;i< adj.length;i++){
            if (!vis[i] && adj[node][i]==1){
                dfs(i,adj,vis);
            }
        }
    }
}