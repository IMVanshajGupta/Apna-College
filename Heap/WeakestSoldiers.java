import java.util.*;

public class WeakestSoldiers {
    static class Row implements Comparable<Row> {// compare karenge humari row ko
        int soldiers;
        int indx;

        public Row(int soldiers, int indx) {
            this.soldiers = soldiers;
            this.indx = indx;
        }

        @Override
        public int compareTo(Row r2) {
            if (this.soldiers == r2.soldiers) {// jab soldiers ki value same hoti hai tb hum indx ke base pr compare
                                               // karenge
                return this.indx - r2.indx;
            } else {// warna hum soldiers ke base pr compare karenge
                return this.soldiers - r2.soldiers;
            }

        }
    }

    public static void main(String arg[]) {
        int army[][] = { { 1, 0, 0, 0 },
                { 1, 1, 1, 1 },
                { 1, 0, 0, 0 },
                { 1, 0, 0, 0 } };
        int k = 2;
        PriorityQueue<Row> pq = new PriorityQueue<>();// priority Queue Row class ki
        for (int i = 0; i < army.length; i++) {
            int count = 0;
            for (int j = 0; j < army.length; j++) {
                count += army[i][j] == 1 ? 1 : 0;// terenary operation count update kardo if army me soldier milte hai
                                                 // toh
            }
            pq.add(new Row(count, i));
        }
        for (int i = 0; i < k; i++) {
            System.out.print("R" + pq.remove().indx + " ");
        }
    }
}
