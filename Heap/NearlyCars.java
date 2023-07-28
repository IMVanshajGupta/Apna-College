import java.util.*;

public class NearlyCars {
    //ek class banai point ki usme define kiya ki mughe compare karna hai 
    static class Point implements Comparable<Point> {
        int x;
        int y;
        int distsq;
        int indx;

        public Point(int x, int y, int distsq, int indx) {
            this.x = x;
            this.y = y;
            this.distsq = distsq;
            this.indx = indx;
        }

        @Override//kis base pr compare karna hai distsq ke base pr
        public int compareTo(Point p2) {
            return this.distsq - p2.distsq;
        }
    }

    public static void main(String arg[]) {
        int pts[][] = { { 3, 3 }, { 5, -1 }, { -2, 4 } };
        int k = 2;
        PriorityQueue<Point> pq = new PriorityQueue<>();//priorotyqueue banai 
        for (int i = 0; i < pts.length; i++) {//store karwai apni 2d array
            int distsq = pts[i][0] * pts[i][0] + pts[i][1] * pts[i][1];
            pq.add(new Point(pts[i][0], pts[i][1], distsq, i));
        }
        for (int i = 0; i < k; i++) {
            System.out.println("C" + pq.remove().indx);//as priority queue ka output toh asceding order me hi aega so chill
        }
    }
}
