import java.util.Scanner;

public class NSlimes {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int[] arr = { 10, 20, 30, 40 };
      int n = arr.length;
      long dp[][] = new long[n][n];
      for (int i = 0; i < n; i++) {
         for (int j = 0; j < n; j++) {
            dp[i][j] = 0;
         }
      }
      int pre[] = new int[n+1];
      for (int i = 0; i < n; i++) {
         pre[i+1] = arr[i] + pre[i];
      }
      for (int gap = 1; gap < n; gap++) {
         for (int i = 0; i + gap < n; i++) {
            int j = i + gap;
            long min = Long.MAX_VALUE;
            for (int k = i; k < j; k++) {
               long cost = dp[i][k] + dp[k + 1][j] + pre[j] - pre[i];
               min = Math.min(min, cost);
            }
            dp[i][j] = min;
         }
      }
      System.out.println(dp[0][n - 1]);
   }
}
