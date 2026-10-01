public class LC_516 {
   public static void main(String[] args) {
      String s = "bbbab";
      int n = 5;
      int dp[][] = new int[n + 1][n + 1];
      for (int i = 0; i <= n; i++) {
         for (int j = 0; j <= n; j++) {
            if (i == j) {
               dp[i][j] = 1;
            } else if (i < j) {
               dp[i][j] = 0;
            }
         }
      }
      for (int i = 1; i <= n; i++) {
         for (int j = 0; j + i - 1 < n; j++) {
            int k = j + i - 1;
            if (s.charAt(j) == s.charAt(k)) {
               dp[j][k] = 2 + dp[j + 1][k - 1];
            } else {
               dp[j][k] = Math.max(dp[j + 1][k], dp[j][k - 1]);
            }
         }
      }
      System.out.println(dp[0][n]);
   }
}