
public class LC_650 {
   public static int fun(int req, int curr, int lastcopy, int[][] dp) {
      if (curr == req)
         return 0;
      if (curr > req)
         return 10000;
      if (dp[curr][lastcopy + 1] != -1)
         return dp[curr][lastcopy + 1];
      int copy = Integer.MAX_VALUE;
      if (curr != lastcopy) {
         copy = 1 + fun(req, curr, curr, dp);
      }
      int paste = Integer.MAX_VALUE;
      if (lastcopy != -1) {
         paste = 1 + fun(req, curr + lastcopy, lastcopy, dp);
      }
      return dp[curr][lastcopy + 1] = Math.min(paste, copy);
   }

   public static void main(String[] args) {
      int n = 6;
      int dp[][] = new int[n + 1][n + 1];
      // for (int i = 0; i <= n; i++) {
      // Arrays.fill(dp[i], -1);
      // }
      // System.out.println(fun(n, 1, -1, dp));
      for (int lastcopy = -1; lastcopy < n; lastcopy++) {
         dp[n][lastcopy + 1] = 0;
      }
      for (int curr = n-1; curr >= 1; curr--) {
         for (int lastcopy = -1; lastcopy < n; lastcopy++) {
            int copy = 10000;
            if (curr != lastcopy) {
               copy = 1 + dp[curr][curr + 1];
            }
            int paste = 10000;
            if (lastcopy != -1&& curr + lastcopy <= n) {
               paste = 1 + dp[curr + lastcopy][lastcopy + 1];
            }
            dp[curr][lastcopy + 1] = Math.min(copy, paste);
         }
      }
      System.out.println(dp[1][0]);

      for (int[] val : dp) {
         for (int num : val) {
            System.out.print(num + " ");
         }
         System.out.println();
      }
   }
}
