class Solution 
{
    int parent[];
    int cost[];
    public int[] minimumCost(int n, int[][] edges, int[][] query) 
    {
        cost=new int[n];
        parent=new int[n];
        for(int i=0;i<n;i++)
        {
            cost[i]=-1;
            parent[i]=i;
        }
        
        for(int edge[]:edges)
        {
            int u=edge[0];
            int v=edge[1];
            int wt=edge[2];
            int parent_u=find(u);
            int parent_v=find(v);
            if(parent_u!=parent_v)
            {
                union(parent_u,parent_v);
                cost[parent_u]&=cost[parent_v];
            }
            cost[parent_u]&=wt;
        }
        int indx=0;
        int result[]=new int[query.length];
        for(int querys[]:query)
        {
            int sr=querys[0];
            int des=querys[1];
            int parent_sr=find(sr);
            int parent_des=find(des);
            if(sr==des)
                result[indx]=0;
            else if(parent_sr==parent_des)
                result[indx]=cost[parent_sr];
            else
                result[indx]=-1;
            indx++;
        }
        return result;
    }
    private int find(int node)
    {
        if(parent[node]==node)
            return node;
        return parent[node]=find(parent[node]);
    }
    private void union(int node1, int node2)
    {
        parent[node2]=node1;
    }
}