import java.util.*;

public class ManualImplementation {
    static class HashMap<K, V> {// these are {generic} applicable datatype for all type
        private class Node {
            K key;
            V value;

            public Node(K key, V vlaue) {
                this.key = key;
                this.value = value;
            }
        }

        private int size;// n
        private LinkedList<Node> buckets[];// N

        @SuppressWarnings("unchecked")
        public HashMap() {
            this.size = 0;
            this.buckets = new Linkedlist[4];
            for (int i = 0; i < 4; i++) {
                this.buckets[i] = new LinkedList<>();
            }
        }

    }

}
