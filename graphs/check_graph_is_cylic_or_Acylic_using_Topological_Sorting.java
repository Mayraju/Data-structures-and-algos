import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

class Solution {
    public int solve(int A, ArrayList<Integer> B, ArrayList<Integer> C) {
        ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i <= A; i++) {
            graph.add(new ArrayList<Integer>());
        }
        int[] indegree = new int[A + 1];
        for (int i = 0; i < B.size(); i++) {
            int u = B.get(i);
            int v = C.get(i);
            graph.get(u).add(v);
            indegree[v]++;
        }
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        for (int i = 1; i < indegree.length; i++) {
            if (indegree[i] == 0) {
                pq.add(i);
            }
        }

        while (!pq.isEmpty()) {
            int curr = pq.poll();
            ArrayList<Integer> arr = graph.get(curr);
            for (int v : arr) {
                indegree[v]--;
                if (indegree[v] == 0) {
                    pq.add(v);
                }
            }
        }

        boolean flag = false;
        for (int i = 1; i < indegree.length; i++) {
            if (indegree[i] != 0) {
                flag = true;
            }
        }

        if (flag == true) {
            return 0;
        }
        return 1;

    }
}
