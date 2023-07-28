public class LongestCommonSubstring {
    // this code is simmilar to the lcs code with some updation
    public static int longestcommonsubtring(String str1, String str2) {
        int n = str1.length();
        int m = str2.length();

        int dp[][] = new int[n + 1][m + 1];// create table
        int ans = 0;
        for (int i = 0; i < n + 1; i++) {// initalize
            for (int j = 0; j < m + 1; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = 0;
                }
            }
        }
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < m + 1; j++) {
                if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                    ans = Math.max(ans, dp[i][j]);//
                } else {// after a break in countinuty we update it with 0 as substring are in
                        // countinous order
                    dp[i][j] = 0;
                }
            }
        }
        // as our ans will not store at the last block of the matrix
        // and we need to search for the max subtring order
        // formit we compare at each block tht is it the max value we can have from here
        // or not and return it
        return ans;
    }

    public static void main(String args[]) {
        String str1 = "ABCDE";
        String str2 = "ABGCE";
        System.out.print(longestcommonsubtring(str1, str2));

    }
}
