
import java.util.*;

public class EditDistance {
   public static int fun(String s1, String s2, int n, int m, int[][] dp) {
      if (n == 0)
         return m;
      if (m == 0)
         return n;
      if (dp[n][m] != -1)
         return dp[n][m];
      if (s1.charAt(n - 1) == s2.charAt(m - 1)) {
         return dp[n][m] = fun(s1, s2, n - 1, m - 1, dp);
      }
      return dp[n][m] = 1 + Math.min(fun(s1, s2, n - 1, m - 1, dp),
            Math.min(fun(s1, s2, n - 1, m, dp), fun(s1, s2, n, m - 1, dp)));
   }

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String s1 = sc.nextLine();
      String s2 = sc.nextLine();
      int n = s1.length();
      int m = s2.length();
      int[][] dp = new int[n + 1][m + 1];
      for (int i = 0; i <= n; i++) {
         for (int j = 0; j <= m; j++) {
            dp[i][j] = -1;
         }
      }
       if (n == 0){
       System.out.println(m);
       }
      else if (m == 0){
         System.out.println(n);
      }else{
      System.out.println(fun(s1, s2, n, m, dp));
      }
      // for (int i = 0; i <= n; i++) {
      // dp[i][0] = i;
      // }
      // for (int i = 0; i <= m; i++) {
      // dp[0][i] = i;
      // }
      // for (int i = 1; i <= n; i++) {
      // for (int j = 1; j <= m; j++) {
      // if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
      // dp[i][j] = dp[i - 1][j - 1];
      // } else {
      // dp[i][j] = 1 + Math.min(dp[i - 1][j], Math.min(dp[i][j - 1], dp[i - 1][j -
      // 1]));
      // }
      // }
      // }
      // System.out.print(dp[n][m]);
   }
}
