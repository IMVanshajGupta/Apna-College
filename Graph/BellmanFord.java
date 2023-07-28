import java.util.*;

public class BellmanFord {
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
        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 2, 4));

        graph[1].add(new Edge(1, 2, -4));

        graph[2].add(new Edge(2, 3, 2));

        graph[3].add(new Edge(3, 4, 4));

        graph[4].add(new Edge(4, 1, -1));

    }

    public static void bellmanFord(ArrayList<Edge> graph[], int src) {
        int dist[] = new int[graph.length];
        for (int i = 0; i < dist.length; i++) {
            if (i != src) {
                dist[i] = Integer.MAX_VALUE;
            }

        }
        int V = graph.length;
        // algo
        for (int i = 0; i < V - 1; i++) {// v-1 wala loop
            // har edge pr jane ke liyeh
            for (int j = 0; j < graph.length; j++) {// har vertex pr
                for (int k = 0; k < graph[j].size(); k++) { // us vertex se har edge pr
                    Edge e = graph[j].get(k);
                    int u = e.src;
                    int v = e.dest;
                    int wt = e.wt;

                    // relaxtion
                    if (dist[u] != Integer.MAX_VALUE && dist[u] + wt < dist[v]) {// in java {infnity +something} is
                                                                                 // negative;so if the value of dist[u]
                                                                                 // is infnity means its already a big
                                                                                 // number can't be the the shortest
                                                                                 // path
                        dist[v] = dist[u] + wt;
                    }
                }
            }
        }
        for (int i = 0; i < dist.length; i++) {
            System.out.print(dist[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int V = 6;
        ArrayList<Edge> graph[] = new ArrayList[V];
        creategraph(graph);
        int src = 0;
        bellmanFord(graph, src);

    }
}
