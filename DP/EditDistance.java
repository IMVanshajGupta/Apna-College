public class EditDistance {
    public static int editdistance(String str1, String str2) {
        int n = str1.length();
        int m = str2.length();
        // create dp
        int dp[][] = new int[n + 1][m + 1];

        // initialize
        for (int i = 0; i < n + 1; i++) {
            dp[i][0] = i;
        }
        for (int j = 0; j < m + 1; j++) {
            dp[0][j] = j;
        }

        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < m + 1; j++) {
                if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else {
                    // add
                    int ans1 = dp[i][j - 1] + 1;// add karenge toh given string ke ek elemnt kam se hume solve karna
                                                // padega
                    // delete
                    int ans2 = dp[i - 1][j] + 1;// remove kardenge toh converting string choti hojaegi
                    // replace
                    int ans3 = dp[i - 1][j - 1] + 1;// replace kardenge toh woh element toh dono ke liyeh choti prblm
                                                    // solve karni padegi
                    // yeh sbke last me one isliyeh add kiyah hai bcs woh way to hum add karenge hi
                    // jo bhi humne use kiya hai
                    dp[i][j] = Math.min(ans1, Math.min(ans2, ans3));
                }
            }
        }
        return dp[n][m];
    }

    public static void main(String args[]) {
        String str1 = "intention";
        String str2 = "execution";
        System.out.print(editdistance(str1, str2));
    }
}
