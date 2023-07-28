public class MaxMin {
    static int tree[];

    public static void init(int n) {
        tree = new int[4 * n];
    }

    public static void maxST(int i, int si, int sj, int arr[]) {
        if (si == sj) {
            tree[i] = arr[si];
            return;
        }
        int mid = (si + sj) / 2;
        maxST(2 * i + 1, si, mid, arr);
        maxST(2 * i + 2, mid + 1, sj, arr);
        tree[i] = Math.max(tree[2 * i + 1], tree[2 * i + 2]);
    }

    public static int getMax(int arr[], int qi, int qj) {
        int n = arr.length;
        return getMaxUtil(0, 0, n - 1, qi, qj);
    }

    public static int getMaxUtil(int i, int si, int sj, int qi, int qj) {
        if (si > qj || sj < qi) {
            return Integer.MIN_VALUE;// agar over lap nahi ho rha hai toh hum wah -infnity dedenge so that bad me
                                     // comare hokar us se bada ans milaega
        } else if (si >= qi && sj <= qj) {
            return tree[i];
        } else {
            int mid = (si + sj) / 2;
            int leftAns = getMaxUtil(2 * i + 1, si, mid, qi, qj);
            int rightAns = getMaxUtil(2 * i + 2, mid + 1, sj, qi, qj);
            return Math.max(leftAns, rightAns);
        }
    }

    public static void update(int arr[], int idx, int newVal) {
        arr[idx] = newVal;
        int n = arr.length;
        updateUtil(0, 0, n - 1, idx, newVal);

    }

    // helper function
    public static void updateUtil(int i, int si, int sj, int idx, int newVal) {
        if (idx < si || idx > sj) {// agar non-over laping hai toh
            return;
        }if(si==sj){
            tree[i]=newVal;
        }
        if (si != sj) {
            tree[i] = Math.max(tree[i], newVal);// warna us idx pr check karlenge ki kon zada hai and update kardenge
            int mid = (si + sj) / 2;
            updateUtil(2 * i + 1, si, mid, idx, newVal);// left
            updateUtil(2 * i + 2, mid + 1, sj, idx, newVal);// right
        }

        // mid nikal kar hum niche wali choti choti indx pr jaa rhe hai jo update honi
        // chaiye
    }

    public static void main(String args[]) {
        int arr[] = { 6, 8, -1, 2, 17, 13, 2, 4 };
        int n = arr.length;
        init(n);
        maxST(0, 0, n - 1, arr);
        for (int i = 0; i < tree.length; i++) {
            System.out.print(tree[i] + " ");
        }
        System.out.println();

        int max = getMax(arr, 2, 5);
        System.out.print("max value in this range is " + max);
        System.out.println();
        update(arr, 2, 20);
        max = getMax(arr, 2, 5);
        System.out.print("max value in this range is " + max);
    }
}