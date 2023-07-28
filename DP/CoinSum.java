public class CoinSum {
    // this code is similar to unbounded knapsack
    public static int coinsum(int coin[], int sum) {
        int n = coin.length;// item numbers
        int dp[][] = new int[n + 1][sum + 1];// dp array create kari hai for number of coins and sum
        // initialising first row and column with condition;
        for (int i = 0; i < dp.length; i++) {
            dp[i][0] = 1;// 0 coin sum pr sare pese denen ka ek tarika hai ki kuch bhi nah do
        }
        for (int j = 1; j < dp[0].length; j++) {
            dp[0][j] = 0;// agar pese hi nah ho toh kese pese denge toh yeh invalid hai isliyeh 0
        }

        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < sum + 1; j++) {

                // condition for valid
                if (coin[i - 1] <= j) {
                    // if valid thn we include it or exclude it
                    dp[i][j] = dp[i][j - coin[i - 1]] + dp[i - 1][j];
                } else {// invalid for condition match
                    int excProfit = dp[i - 1][j];
                    dp[i][j] = excProfit;
                }
            }
        }

        return dp[n][sum];
    }

    public static void main(String args[]) {
        int coin[] = { 2, 5, 3, 6 };
        int sum = 10;
        System.out.println(coinsum(coin, sum));
    }
}
