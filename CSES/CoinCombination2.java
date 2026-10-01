
import java.util.*;

public class CoinCombination2 {
   public static int MOD = 1000000007;

   /*
    * public static int fun(int[] coins, int x, int i, int dp[][]) {
    * if (x == 0)
    * return 1;
    * if (i == 0)
    * return 0;
    * if (dp[i][x] != -1)
    * return dp[i][x];
    * int sum = 0;
    * int sum2 = fun(coins, x, i - 1, dp) % MOD;
    * if (coins[i - 1] <= x) {
    * sum = (sum + fun(coins, x - coins[i - 1], i, dp)) % MOD;
    * }
    * 
    * return dp[i][x] = (sum + sum2) % MOD;
    * }
    */
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int x = sc.nextInt();
      int[] coins = new int[n];
      for (int i = 0; i < n; i++) {
         coins[i] = sc.nextInt();
      }
      // int dp[][] = new int[n + 1][x + 1];
      // for (int i = 0; i <= n; i++) {
      // Arrays.fill(dp[i], -1);
      // }

      // System.out.println(fun(coins, x, n, dp) % MOD);
      // for(int[]num:dp){
      // for(int i:num){
      // System.out.print(i+" ");
      // }
      // System.out.println();
      // }
      // dp[n][0] = 1;
      // for (int i = 1; i <= x; i++) {
      //    dp[n][i] = 0;
      // }
      // for (int i = 0; i < n; i++) {
      //    dp[i][0] = 1;
      // }
      // for (int i = n - 1; i >= 0; i--) {
      //    for (int j = 0; j <= x; j++) {
      //       int exc = dp[i + 1][j];
      //       int inc = 0;
      //       if (j >= coins[i]) {
      //          inc = dp[i][j - coins[i]];
      //       }
      //       dp[i][j] = (inc + exc) % MOD;
      //    }
      // }
      // System.out.println(dp[0][x]);
      int dp1[] = new int[x + 1];
      dp1[0] = 1;
      for (int i = 0; i < n; i++) {
         for (int s = coins[i]; s <= x; s++) {
            dp1[s] += dp1[s - coins[i]];
            dp1[s] = dp1[s]%MOD;
         }
      }
      System.out.println(dp1[x]);
   }
}