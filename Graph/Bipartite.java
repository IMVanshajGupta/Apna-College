import java.util.*;
import java.util.LinkedList;

public class Bipartite {
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

        graph[4].add(new Edge(4, 2, 1));
        graph[4].add(new Edge(4, 3, 1));

    }

    public static boolean isBipartite(ArrayList<Edge> graph[]) {
        int col[] = new int[graph.length];// colour array
        for (int i = 0; i < col.length; i++) {
            col[i] = -1;// assigning each block with -1 means no colour yet
        }

        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < graph.length; i++) {
            if (col[i] == -1) {// agar vertex pr koi colour nahi hai toh
                q.add(i);// use add karo queue me and
                col[i] = 0;// give it a colour yellow
                while (!q.isEmpty()) {
                    int curr = q.remove();
                    for (int j = 0; j < graph[curr].size(); j++) {
                        Edge e = graph[curr].get(j);
                        if (col[e.dest] == -1) {// agar neighbour pr colour nahi hai toh use colour doo
                            int nextCol = col[curr] == 0 ? 1 : 0;// depends ki parent ka colour kya hai
                            col[e.dest] = nextCol;// colour value assigned opposite of it parent vertex
                            q.add(e.dest);// vertex ke neighbour add kardo queue me
                        } else if (col[e.dest] == col[curr]) {// agar neighbour or vertex ke colour same hojate hai toh
                            return false;// return false for it
                        }
                    }
                }
            }
        }
        return true;
    }

    public static void main(String args[]) {
        int V = 5;
        ArrayList<Edge> graph[] = new ArrayList[V];
        creategraph(graph);
        System.out.println(isBipartite(graph));
    }
}
