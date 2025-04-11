import java.util.*;
import java.io.*;

class Solution {

   public static boolean isTree(int v, ArrayList<ArrayList<Integer>> graph, boolean[] visited, int parent) {
      visited[v] = true;

      for (int i = 0; i < graph.get(v).size(); i++) {
         int child = graph.get(v).get(i);
         if (!visited[child]) {
            if (isTree(child, graph, visited, v)) {
               return true;
            }
         } else if (child != parent) {
            return true;
         }
      }
      return false;
   }

   public static void main(String args[]) throws IOException {

      // write your code here

      Scanner sc = new Scanner(System.in);
      int t = sc.nextInt();
      while (t-- > 0) {
         int V = sc.nextInt();
         int n = sc.nextInt();
         ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
         for (int i = 0; i < V; i++) {
            graph.add(i, new ArrayList<>());
         }
         for (int i = 0; i < n; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            graph.get(u).add(v);
            graph.get(v).add(u);
         }
         boolean[] visited = new boolean[V];
         boolean flag = isTree(0, graph, visited, -1);

         for (int i = 0; i < V; i++) {
            if (!visited[i]) {
               flag = true;
               break;
            }
         }
         if (flag) {
            System.out.println("NO");
         } else {
            System.out.println("YES");
         }

      }

   }
}
