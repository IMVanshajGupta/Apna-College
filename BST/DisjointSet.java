public class DisjointSet {
    static int n = 7;
    static int par[] = new int[n];// do array par and rank
    static int rank[] = new int[n];

    public static void inti() {// initializing parent arr
        for (int i = 0; i < n; i++) {
            par[i] = i;
        }
    }

    public static int find(int x) {
        if (x == par[x]) {
            return x;
        }
        return par[x] = find(par[x]);
    }

    // agar judne wale dono elements ki rank same hai toh toh rank increase karenge
    // warna bas jode denge
    // kam rank wala badi rank wale me judta hai
    public static void union(int a, int b) {
        int parA = find(a);
        int parB = find(b);
        if (rank[parA] == rank[parB]) {
            par[parB] = parA;
            rank[parA]++;
        } else if (rank[parA] < rank[parB]) {
            par[parA] = parB;
        } else {
            par[parB] = parA;

        }
    }

    public static void main(String args[]) {
        inti();
        union(1, 3);
        System.out.println(find(3));
        union(2, 4);
        union(3, 6);
        union(1, 4);
        System.out.println(find(3));
        System.out.println(find(4));
        union(1, 5);

    }
}
