
// DFS is a graph traversal Algorithm
// DFS is used in find connected components of the graph
// DFS uses the recursion
// In this code we are using the undirected graph
// used stack space for recursion

class Dfs{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int V = sc.nextInt() // no of vertices V=vertices
        int e = sc.nextInt() // no of edges e = edges
        int[][] edges = new int[e][2];  // how veritices are connected each other;
        for(int i=0;i<e;i++){
            int u = sc.nextInt();
            int v = sc.nextInt();
            edges[i][0] =u;
            edges[i][1] =v;
        }
        // how to form the graph from the edges
        ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();
        // This for loop makes graph like this =[[],[],[],[]]
        for(int i=0;i<V;i++){
            graph.add(new ArrayList<Integer>());
        }
        // we are making the undirected graph
        for(int i=0;i<edges.length;i++){
             int u = edges[i][0];
             int v = edges[i][1];
             graph.get(u).add(v);
             graph.get(v).add(u);
        }

        boolean[] visited = new boolean[V+1];
        ArrayList<Integer> dfs = new ArrayList<Integer>();
        Arrays.fill(visited,false);
        for(int i=0;i<V;i++){
            if(!visited[i]){
                dfsTraversal(i,graph,visited,dfs);
            }
        }
    }

    public void dfsTraversal(int vertex,ArrayList<ArrayList<Integer>> graph,int[] visited,ArrayList<Integer> dfs){
        visited[vertex] = true;
        dfs.add(vertex);
        ArrayList<Integer> nghrs = graph.get(vertex);
        for(int ele : nghrs){
             if(visited[ele] == false){
                 dfsTraversal(ele,graph,visited,dfs);
             }
        }
    }
}

// Tc: o(n+e);
// Sc : O(n+e)+stakcspace+O(n)