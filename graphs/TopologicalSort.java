public class Solution {
    public ArrayList<Integer> solve(int A, ArrayList<ArrayList<Integer>> B) {
        ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();
        int[] indegree = new int[A+1];
        int m = B.size();
        for(int i=0;i<=A;i++){
            graph.add(new ArrayList<Integer>());
        }
        for(int i=0;i<m;i++){ // building the graph and indegree values.
             int u = B.get(i).get(0);
             int v = B.get(i).get(1);
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
