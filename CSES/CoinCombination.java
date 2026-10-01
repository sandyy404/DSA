import java.util.*;

public class CoinCombination {
   public static int MOD = 1000000007;
   // Memo

   public static int fun(int[] arr, int n, int x, int[] dp) {
      if (x == 0)
         return 1;
      if (n == 0)
         return 0;
      if (dp[x] != -1)
         return dp[x];
      int inc = 0;
      for (int i = 0; i < arr.length; i++) {
         if (x >= arr[i]) {
            inc = (inc + fun(arr, n, x - arr[i], dp)) % MOD;
         }
      }
      dp[x] = inc;
      return inc;
   }

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int x = sc.nextInt();
      int arr[] = new int[n];
      for (int i = 0; i < n; i++) {
         arr[i] = sc.nextInt();
      }
      int dp[] = new int[x + 1];
      Arrays.fill(dp, -1);
      System.out.println(fun(arr, n, x, dp));
      for (int i : dp) {
         System.out.print(i + " ");
      }

   }
}