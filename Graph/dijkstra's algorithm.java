import java.util.ArrayList;
import java.util.PriorityQueue;

public class Solution {

    public static ArrayList<Integer> dijkstra(ArrayList<ArrayList<Integer>> vec, int vertices, int edges, int source) {
        ArrayList<ArrayList<Pair>> adj = new ArrayList<>();
        for (int i = 0; i < vertices; i++) {
            adj.add(new ArrayList<Pair>());
        }
        for (int i = 0; i < edges; i++) {
            adj.get(vec.get(i).get(0)).
            add(new Pair(vec.get(i).get(2), vec.get(i).get(1)));
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < vertices; i++) {
            ans.add(Integer.MAX_VALUE);
        }
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        pq.add(new Pair(0, source));
        ans.set(source, 0);
        while (!pq.isEmpty()) {
            Pair p = pq.remove();
            int parentNode = p.adjNode;
            int parentWt = p.wt;
            for (Pair e : adj.get(parentNode)) {
                int adjNode = e.adjNode;
                int finalWt = e.wt + parentWt;
                if (finalWt < ans.get(adjNode)) {
                    ans.set(adjNode, finalWt);
                    pq.add(new Pair(finalWt, adjNode));
                }
            }
        }
        return ans;
    }

    public static class Pair implements Comparable<Pair> {
        int wt;
        int adjNode;

        public Pair(int wt, int adjNode) {
            this.wt = wt;
            this.adjNode = adjNode;
        }

        @Override
        public int compareTo(Pair p) {
            return Integer.compare(this.wt, p.wt);
        }
    }
}
