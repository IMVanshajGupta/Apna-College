
public class KnapSack {
    public static int knapsack(int val[], int wt[], int W, int n) {
        // base case
        // yah toh bori puri bhar jae yah sare saman ko hum consider kar chuke hoo
        if (W == 0 || n == 0) {
            return 0;
        }
        // agar jo saman pr hum hai uska weight bori ke present weight se kam hia means
        // woh bori me asakta hai toh use dal lenge
        if (wt[n - 1] <= W) {// valid condition
            int ans1 = val[n - 1] + knapsack(val, wt, W - wt[n - 1], n - 1);// include
            int ans2 = knapsack(val, wt, W, n - 1);// exclude
            return Math.max(ans1, ans2);
        } else {// jab us saman ka weight zada hoga bori me present space se toh hume use chodna
                // padega means excluding it
            return knapsack(val, wt, W, n - 1);
        }
        // jab hum exlude karte hai means ki us se bori ke weight me koi pharak nahi
        // ayah
        // bas ek elemnt count kam hogya hai

        // jab include karte hai toh bori ka weight kam hota hai ,value increase hoti
        // hai ,ek element bhi kam hota hai

    }

    public static int Memoknapsack(int val[], int wt[], int W, int n, int dp[][]) {

        if (W == 0 || n == 0) {
            return 0;
        }
        if (dp[n][W] != -1) {// agar dp[n][W] pr -1 nahi hai means us block ke liyeh ans phele hi dhundha ja
                             // chuka hai so return it directly
            return dp[n][W];
        }
        if (wt[n - 1] <= W) {// valid condition
            int ans1 = val[n - 1] + Memoknapsack(val, wt, W - wt[n - 1], n - 1, dp);// include
            int ans2 = Memoknapsack(val, wt, W, n - 1, dp);// exclude
            dp[n][W] = Math.max(ans1, ans2);// if not finded for that bloc find and update
            return dp[n][W];
        } else {
            dp[n][W] = Memoknapsack(val, wt, W, n - 1, dp);
            return dp[n][W];// find and update
        }

    }

    public static int TabknapSack(int val[], int wt[], int W) {
        int n = val.length;// item numbers
        int dp[][] = new int[n + 1][W + 1];// dp array
        // initialising first row and column with zero;
        for (int i = 0; i < dp.length; i++) {
            dp[i][0] = 0;
        }
        for (int j = 0; j < dp[0].length; j++) {
            dp[0][j] = 0;
        }

        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < W + 1; j++) {
                int v = val[i - 1];// ith item value
                int w = wt[i - 1];// ith item weight

                // condition for including
                if (w <= j) {
                    int incProfit = v + dp[i - 1][j - w];// agar us item ko include kare toh
                    int excProfit = dp[i - 1][j];// agar us item ko exclude karde toh
                    dp[i][j] = Math.max(incProfit, excProfit);
                } else {// invalid for condition match
                    int excProfit = dp[i - 1][j];
                    dp[i][j] = excProfit;
                }
            }
        }

        return dp[n][W];
    }

    public static void main(String args[]) {
        int val[] = { 15, 14, 10, 45, 30 };
        int wt[] = { 2, 5, 1, 3, 4 };
        int W = 7;
        int dp[][] = new int[val.length + 1][W + 1];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                dp[i][j] = -1;
            }
        }
        System.out.println(knapsack(val, wt, W, val.length));
        System.out.println(Memoknapsack(val, wt, W, val.length, dp));
        System.out.println(TabknapSack(val, wt, W));

    }
}
