
public class TargetSubsetSum {
    public static boolean targetsum(int val[], int sum) {
        int n = val.length;// items
        boolean dp[][] = new boolean[n + 1][sum + 1];// dp array initialization

        // for sum=0 and any number of items

        for (int i = 0; i < n + 1; i++) {
            dp[i][0] = true;
        }

        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < sum + 1; j++) {
                int v = val[i - 1];
                // include
                if (v <= j && dp[i - 1][j - v] == true) {
                    dp[i][j] = true;
                }
                // exclude
                else if (dp[i - 1][j] == true) {
                    dp[i][j] = true;
                }
            }
        }

        return dp[n][sum];
    }

    public static void main(String arg[]) {
        int val[] = { 4, 2, 7, 1, 3 };
        int sum = 10;
        System.out.print(targetsum(val, sum));

    }
}
