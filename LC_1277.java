import java.util.Arrays;

public class LC_1277 {
   public static int fun(int[][] arr, int i, int j, int[][] dp) {
      if (i < 0 || j < 0)
         return 0;
      if (arr[i][j] == 0)
         return 0;
      if (dp[i][j] != -1)
         return dp[i][j];
      int a1 = fun(arr, i - 1, j, dp);
      int a2 = fun(arr, i, j - 1, dp);
      int a3 = fun(arr, i - 1, j - 1, dp);
      return dp[i][j] = Math.min(a1, Math.min(a2, a3)) + 1;
   }

   public static void main(String[] args) {
      int arr[][] = { { 0, 1, 1, 1 }, { 1, 1, 1, 1 }, { 0, 1, 1, 1 } };
      int m = 3;
      int n = 4;
      int ans = 0;
      int dp[][] = new int[m][n];
      for (int i = 0; i < m; i++) {
         Arrays.fill(dp[i], -1);
      }
      for (int i = m - 1; i >= 0; i--) {
         for (int j = n - 1; j >= 0; j--) {
            ans += fun(arr, i, j, dp);
         }
      }
      // System.out.println(ans);
      for(int i=0;i<m;i++){
         for(int j=0;j<n;j++){
            System.out.print(dp[i][j] +" ");
         }
         System.out.println();
      }
   }
}