// Notes: 
// it is a Topological sort Algorithm
// it is main algorithm for detect the given directed graph is cyclic or acyclic.
// if all the indegree values are zero --> it is Acyclic graph
// if indegree values are not zero --> it is cyclic graph.
// it is works on DAG concept --> Directed Acyclic Graph.
// it is similar to BFS traversal algorithm

class TopologicalSort{
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
        int[] indegree = new int[V+1];
        // we are making the undirected graph
        for(int i=0;i<edges.length;i++){
             int u = edges[i][0];
             int v = edges[i][1];
             graph.get(u).add(v);
             indegree[v]++;
        }
        PriorityQueue<Integer> q = new PriorityQueue<Integer>();
        for(int i=1;i<=A;i++){  // initializing the queue with indegree zero.
             if(indegree[i] == 0){
                   q.add(i);
             }
        }
        ArrayList<Integer> ans = new ArrayList<Integer>();
        while(!q.isEmpty()){
            int curr = q.poll();
            ans.add(curr);
            ArrayList<Integer> nbr = graph.get(curr);
            for(int v:nbr){  // all adjacent of curr node indegree values decrementing
                indegree[v]--;
                if(indegree[v]==0){ // indegre of adjancent vertext value zero adding that value to queue
                    q.add(v);
                }

            }

        }
        return ans;
       

    }
}