
import java.util.*;

public class DiceCombinations {
   static int MOD = (int) Math.pow(10, 9) + 7;

   // public static int fun(int n, int[] dp) {
   // if (n == 0)
   // return 1;
   // if (n < 0)
   // return 0;
   // if (dp[n] != -1)
   // return dp[n];
   // int ans = 0;
   // for (int i = 1; i <= 6; i++) {
   // ans = (ans + fun(n - i, dp) % MOD) % MOD;
   // }
   // return dp[n] = ans;
   // }

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int[] dp = new int[n + 1];
      // Arrays.fill(dp, -1);
      // System.out.println(fun(n, dp));
      // for(int val:dp){
      // System.out.print(val+" ");
      // }
      dp[0] = 1;
      for (int i = 1; i <= n; i++) {
         int ans = 0;
         for (int j = 1; j <= 6; j++) {
            if (j <= i) {
               ans = (ans + (dp[i - j]) % MOD) % MOD;
            }
         }
         dp[i] = ans;
      }
      System.out.println(dp[n]);
   }
}