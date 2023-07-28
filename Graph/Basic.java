import java.util.*;

public class Basic {
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

    public static void main(String arg[]) {
        int V = 5;// total number of vertices
        // int arr[]=new array[v] //compare with this syntax
        ArrayList<Edge> graph[] = new ArrayList[V];
        for (int i = 0; i < V; i++) {
            graph[i] = new ArrayList<>();
        }
        // 0 vertex
        graph[0].add(new Edge(0, 1, 5));

        // 1 vertex
        graph[1].add(new Edge(1, 0, 5));
        graph[1].add(new Edge(1, 2, 1));
        graph[1].add(new Edge(1, 3, 3));

        // 2 vertex
        graph[2].add(new Edge(2, 1, 1));
        graph[2].add(new Edge(2, 3, 1));
        graph[2].add(new Edge(2, 4, 2));

        // 3 vertex
        graph[3].add(new Edge(3, 1, 3));
        graph[3].add(new Edge(3, 2, 1));

        // 4 vertex
        graph[4].add(new Edge(4, 2, 2));

        // 2's neighbour
        // as Arraylist graph[2] consist info of 3 edges so we have to travesal through
        // its length and grab the info accordingly which we need

        for (int i = 0; i < graph[2].size(); i++) {// vertex 2 ke size tak
            Edge e = graph[2].get(i);// e me vertex 2 ki info which contain all three src dest wt
            System.out.println(e.dest);// humne dest print karwali hai hum kuch bhi nikal sakte hai
        }
        // phele hum graph[2] pr gye and ask tere andar kitne log{Edges} hai phir humne
        // ek ek Edge ko uthaya ek ek karke and us se pucha ki teri destination ki info
        // dede hume bhai or woh info print karwadi ek ek karke
    }
}
