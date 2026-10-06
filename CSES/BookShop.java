import java.util.*;

public class BookShop {
   // public static int fun(int n, int x, int[] price, int[] pages,int[][]dp) {
   // if (n == 0 || x == 0)
   // return 0;
   // if(dp[n][x]!=-1)return dp[n][x];
   // int exc = fun(n - 1, x, price, pages,dp);
   // int inc = 0;
   // if (x >= price[n - 1]) {
   // inc = pages[n - 1] + fun(n - 1, x - price[n - 1], price, pages,dp);
   // }
   // return Math.max(inc, exc);
   // }

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int x = sc.nextInt();
      int price[] = new int[n];
      int pages[] = new int[n];
      for (int i = 0; i < n; i++) {
         price[i] = sc.nextInt();
      }
      for (int i = 0; i < n; i++) {
         pages[i] = sc.nextInt();
      }
      int dp[][] = new int[n + 1][x + 1];
      // for(int i=0;i<=n;i++){
      // Arrays.fill(dp[i], -1);
      // }
      // System.out.println(fun(n, x, price, pages,dp));
      for (int i = 0; i <= n; i++) {
         dp[i][0] = 0;
      }
      for (int i = 0; i <= x; i++) {
         dp[0][i] = 0;
      }
      for (int i = 1; i <= n; i++) {
         for (int j = 1; j <= x; j++) {
            int exc = dp[i - 1][j];
            int inc = 0;
            if (j >= price[i - 1]) {
               inc = pages[i - 1] + dp[i - 1][j - price[i - 1]];
            }
            dp[i][j] = Math.max(inc, exc);
         }
      }
       System.out.println(dp[n][x]);
   }
}