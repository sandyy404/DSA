// import java.util.Arrays;

// public class MCM {
//    public static int fun(int i, int j, int[] arr, int[][] dp) {
//       if (i+1 == j)
//          return 0;
//       if (dp[i][j] != -1)
//          return dp[i][j];
//       int ans = Integer.MAX_VALUE;
//       int val = 0;
//       for (int k = i+1; k < j; k++) {
//          val = fun(i, k, arr, dp) + fun(k, j, arr, dp) + (arr[i] * arr[k] * arr[j]);
//          ans = Math.min(ans, val);
//       }
//       return dp[i][j] = ans;
//    }

//    public static void main(String[] args) {
//       int arr[] = { 2, 1, 3, 4 };
//       int n = arr.length;
//       int dp[][] = new int[n + 1][n + 1];
//       for (int i = 0; i <= n; i++) {
//          Arrays.fill(dp[i], -1);
//       }
//       int ans = fun(0, n - 1, arr, dp);
//       System.out.println(ans);
//       for (int[] a : dp) {
//          for (int num : a) {
//             System.out.print(num + " ");
//          }
//          System.out.println();
//       }
//    }
// }
import java.util.Arrays;

public class MCM {
   public static int fun(int i, int j, int[] arr, int[][] dp) {
      if (i == j)
         return 0;
      if (dp[i][j] != -1)
         return dp[i][j];
      int ans = Integer.MAX_VALUE;
      int val = 0;
      for (int k = i; k < j; k++) {
         val = fun(i, k, arr, dp) + fun(k+1, j, arr, dp) + (arr[i-1] * arr[k] * arr[j]);
         ans = Math.min(ans, val);
      }
      return dp[i][j] = ans;
   }

   public static void main(String[] args) {
      int arr[] = { 2, 1, 3, 4 };
      int n = arr.length;
      int dp[][] = new int[n + 1][n + 1];
      for (int i = 0; i <= n; i++) {
         Arrays.fill(dp[i], -1);
      }
      int ans = fun(1, n - 1, arr, dp);
      System.out.println(ans);
      for (int[] a : dp) {
         for (int num : a) {
            System.out.print(num + " ");
         }
         System.out.println();
      }
   }
}

	