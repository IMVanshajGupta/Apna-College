public class UnBoundedKnapsack {
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
                    // include profit wali line me change hai
                    int incProfit = v + dp[i][j - w];// agar us item ko include kare toh
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

        System.out.println(TabknapSack(val, wt, W));

    }
}
