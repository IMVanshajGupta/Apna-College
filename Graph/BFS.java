import java.util.*;
import java.util.LinkedList;

public class BFS {
    static class Edge {
        int src;
        int dest;
        int wt;

        public Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }

    static void creategraph(ArrayList<Edge> graph[]) {// ek function hai graph create karne ke liye or kuch nhi

        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1, 1));
        graph[0].add(new Edge(0, 2, 1));

        graph[1].add(new Edge(1, 0, 1));
        graph[1].add(new Edge(1, 3, 1));

        graph[2].add(new Edge(2, 0, 1));
        graph[2].add(new Edge(2, 4, 1));

        graph[3].add(new Edge(3, 1, 1));
        graph[3].add(new Edge(3, 4, 1));
        graph[3].add(new Edge(3, 5, 1));

        graph[4].add(new Edge(4, 2, 1));
        graph[4].add(new Edge(4, 3, 1));
        graph[4].add(new Edge(4, 5, 1));

        graph[5].add(new Edge(5, 3, 1));
        graph[5].add(new Edge(5, 4, 1));
        graph[5].add(new Edge(5, 6, 1));

        graph[6].add(new Edge(6, 5, 1));

    }

    public static void bfs(ArrayList<Edge> graph[]) {// bfs ka function hai
        Queue<Integer> q = new LinkedList<>();// ek queue
        boolean vis[] = new boolean[graph.length];// ek boolean array
        q.add(0);// yeh humara soucre hai wese hum kahi se bhi shuru kar sakte hai

        while (!q.isEmpty()) {// jab tak queue empty nah hojae
            int curr = q.remove();// first value kohum remove kardenge

            if (!vis[curr]) {// agar visited nahi hai woh value
                System.out.print(curr + " ");// toh us value ko print karwaenge
                vis[curr] = true;// arrye me us value ke liyeh true karenge
                for (int i = 0; i < graph[curr].size(); i++) {
                    Edge e = graph[curr].get(i);
                    q.add(e.dest);// uske neighbours ki value queue me store karwaenge
                }
            }
        }
    }

    public static void main(String arg[]) {
        int V = 7;
        ArrayList<Edge> graph[] = new ArrayList[V];
        creategraph(graph);
        bfs(graph);

    }
}
