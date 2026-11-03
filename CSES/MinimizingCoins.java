
import java.util.Scanner;

public class MinimizingCoins {
   public static int fun(int sum, int n, int c[]) {
      if (sum == 0)
         return 1;
      if (sum < 0)
         return 0;
      int ans = 0;
      int min = Integer.MAX_VALUE;
      for (int i = 0; i < n; i++) {
         if (sum >= c[i]) {
            ans += fun(sum - c[i], n, c);
         }
      }
      min = Math.min(ans, min);
      return min;
   }

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int x = sc.nextInt();
      int c[] = new int[n];
      for (int i = 0; i < n; i++) {
         c[i] = sc.nextInt();
      }
      System.out.println(fun(x, n, c));
   }
}
