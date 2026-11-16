
import java.util.*;

public class Zuma {
   // public static int fun(int[] arr, int i, int j, int[][] dp) {
   // if (i == j)
   // return 1;
   // if (i > j)
   // return 0;
   // if (dp[i][j] != -1)
   // return dp[i][j];
   // int min = Integer.MAX_VALUE;
   // int smin = Integer.MAX_VALUE;
   // if (arr[i] == arr[j]) {
   // if (i + 1 == j) {
   // min = 1;
   // } else {
   // min = fun(arr, i + 1, j - 1, dp);
   // }
   // }
   // for (int k = i; k < j; k++) {
   // int val = fun(arr, i, k, dp) + fun(arr, k + 1, j, dp);
   // smin = Math.min(smin, val);
   // }
   // min = Math.min(smin, min);

   // return dp[i][j] = min;
   // }

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int arr[] = new int[n];
      int dp[][] = new int[n][n];
      // for (int i = 0; i < n; i++) {
      // Arrays.fill(dp[i], -1);
      // }
      for (int i = 0; i < n; i++) {
         arr[i] = sc.nextInt();
      }
      // System.out.println(fun(arr, 0, n - 1, dp));
      for (int i = 0; i < n; i++) {
         for (int j = 0; j < n; j++) {
            if (i == j) {
               dp[i][j] = 1;
            }
         }
      }
      for (int gap = 1; gap < n; gap++) {
         for (int i = 0; i + gap < n; i++) {
            int j = i + gap;
            int min = Integer.MAX_VALUE;
            int smin = Integer.MAX_VALUE;
            if (arr[i] == arr[j]) {
               if (i + 1 == j) {
                  min = 1;
               } else {
                  // min = fun(arr, i + 1, j - 1, dp);
                  min = dp[i + 1][j - 1];
               }
            }
            for (int k = i; k < j; k++) {
               int val = dp[i][k] + dp[k + 1][j];
               smin = Math.min(smin, val);
               min = Math.min(smin, min);
            }
            dp[i][j] = min;
         }
      }
      System.out.println(dp[0][n - 1]);
      for (int i = 0; i < n; i++) {
         for (int j = 0; j < n; j++) {
            System.out.print(dp[i][j] + " ");
         }
         System.out.println();
      }
   }
}
