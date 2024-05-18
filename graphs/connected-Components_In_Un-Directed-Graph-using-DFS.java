public class Solution {
    
    public int solve(int A, ArrayList<Integer> B, ArrayList<ArrayList<Integer>> C, int D) {
      boolean[] visited = new boolean[A+1];
      for(int i=0;i<visited.length;i++){
            visited[i] = false;
      }
      ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();
      for(int i=0;i<=A;i++){
          graph.add(new ArrayList<Integer>());
      }
      for(int i=0;i<C.size();i++){
          int u = C.get(i).get(0);
          int v = C.get(i).get(1);
          graph.get(u).add(v);
          graph.get(v).add(u);
      }
      int count = 0;
      for(int i=1;i<=A;i++){
        int sum = 0;
        ArrayList<Integer> a = new ArrayList<Integer>();
             if(!visited[i]){
                 dfs(i,graph,visited,a);

                 for(int j=0;j<a.size();j++){
                             sum = sum + B.get(a.get(j)-1);
                 }
                 if(sum >= D){
                     count++;
                 }
             }
       }
       return count;
    }

    public void dfs(int child, ArrayList<ArrayList<Integer>> graph, boolean[] visited,ArrayList<Integer> a){
           visited[child] = true;
           a.add(child);
            ArrayList<Integer> list = graph.get(child);
           for(int x:list){
                if(!visited[x]){
                    dfs(x,graph,visited,a);
                }
           }
    }

}
