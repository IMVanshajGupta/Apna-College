import java.util.*;

public class ConnectingCitiesMinCost {
    static class Edge implements Comparable<Edge> {
        int dest;
        int cost;

        public Edge(int d, int c) {
            this.cost = c;
            this.dest = d;
        }

        @Override
        public int compareTo(Edge e2) {
            return this.cost - e2.cost;// cost ke base prcompare karna hai hume toh
        }
    }

    public static int ConnectingCities(int cities[][]) {
        PriorityQueue<Edge> pq = new PriorityQueue<>();
        boolean visted[] = new boolean[cities.length];

        pq.add(new Edge(0, 0));// stating from src as 0;
        int finalCost = 0;
        while (!pq.isEmpty()) {// jab tak pq empty nahi hoti hum pq ki andar ki edges ko nikalte jaenge
            Edge curr = pq.remove();
            if (!visted[curr.dest]) {
                visted[curr.dest] = true;// agar woh visted nahi hongi toh vist kardenge True karke
                finalCost += curr.cost;// and finalcost update kardenge

                for (int i = 0; i < cities[curr.dest].length; i++) {
                    if (cities[curr.dest][i] != 0) {// us edge se connected edges ko travel karenge
                        pq.add(new Edge(i, cities[curr.dest][i]));
                    }
                }
            }
        }
        return finalCost;
    }

    public static void main(String args[]) {
        int cities[][] = { { 0, 1, 2, 3, 4 },
                { 1, 0, 5, 0, 7 },
                { 2, 5, 0, 6, 0 },
                { 3, 0, 6, 0, 0 },
                { 4, 7, 0, 0, 0 } };
        System.out.print(ConnectingCities(cities));
    }
}
