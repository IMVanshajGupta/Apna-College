import java.util.Arrays;

public class Catlan {
    public static int catlan(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int ans = 0;
        for (int i = 0; i <= n - 1; i++) {
            ans += catlan(i) * catlan(n - i - 1);
        }
        return ans;
    }

    // memoziation
    public static int Memcatlan(int n, int dp[]) {
        if (n == 0 || n == 1) {
            return 1;
        }
        if (dp[n] != -1) {
            return dp[n];
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans += Memcatlan(i, dp) * Memcatlan((n - 1 - i), dp);
        }
        return dp[n] = ans;
    }

    // tabulation O(n^2)
    public static int Tabcatlan(int n) {
        int dp[] = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                dp[i] += dp[j] * dp[j - 1 - i];
            }
        }
        return dp[n];
    }

    public static void main(String args[]) {
        int n = 4;
        System.out.println(catlan(n));
        int dp[] = new int[n + 1];
        Arrays.fill(dp, -1);
        System.out.println(Memcatlan(4, dp));
        System.out.println(catlan(n));

    }
}
