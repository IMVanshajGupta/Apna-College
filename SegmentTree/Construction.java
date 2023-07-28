public class Construction {
    static int tree[];// yeh gloably ban liyah hai so that bar bar initialize nahi karna padega

    public static void init(int n) {
        tree = new int[4 * n];// array tree ko apne initialize kardiya
    }

    public static int buildST(int arr[], int i, int start, int end) {
        // base condition
        // agar start end barabr hai means leaf pr hai hum toh matalb direct use hi
        // store karwadenge tree arr me
        if (start == end) {
            tree[i] = arr[start];
            return arr[start];
        }
        int mid = (start + end) / 2;
        buildST(arr, 2 * i + 1, start, mid);// left subtree
        buildST(arr, 2 * i + 2, mid + 1, end);// right subtree
        tree[i] = tree[2 * i + 1] + tree[2 * i + 2];
        return tree[i];

        // how code is working

        // arr ke start and end se mid nikal kar i=0 se fill krna shuru kara
        // recursively phele woh mid ke left wale blocks ke liyeh value store karwaega
        // till base case hit
        // and thn same for left part
        // and after finding the value of left and right for that index it store there
        // sum
    }

    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int n = arr.length;
        init(n);
        buildST(arr, 0, 0, n - 1);

        for (int i = 0; i < tree.length; i++) {
            System.out.print(tree[i] + " ");
        }
    }
}
