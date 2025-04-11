
// BFS is a graph traversal algorithm
// BFS traverse level by level
// BFS uses the queue data structre.
// the graph we are using in this code as undirected graph.
import java.util.*;

class Bfs {
    public static ArrayList<Integer> main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int V = sc.nextInt(); // no of vertices V=vertices
        int e = sc.nextInt(); // no of edges e = edges
        int[][] edges = new int[e][2]; // how veritices are connected each other;
        for (int i = 0; i < e; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            edges[i][0] = u;
            edges[i][1] = v;
        }
        // how to form the graph from the edges
        ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();
        // This for loop makes graph like this =[[],[],[],[]]
        for (int i = 0; i < V; i++) {
            graph.add(new ArrayList<Integer>());
        }
        // we are making the undirected graph
        for (int i = 0; i < edges.length; i++) {
            int u = edges[i][0];
            int v = edges[i][1];
            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        boolean[] visited = new boolean[V + 1];
        ArrayList<Integer> bfs = new ArrayList<Integer>();
        Arrays.fill(visited, false);
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(0); // start with some vertext or any vertex
        visited[0] = true;
        while (!queue.isEmpty()) {
            int curr = queue.poll();
            bfs.add(curr);
            ArrayList<Integer> nghrs = graph.get(curr);
            for (int ele : nghrs) {
                if (visited[ele] == false) {
                    visited[ele] = true;
                    queue.add(ele);
                }
            }
        }
        return bfs;

    }
}