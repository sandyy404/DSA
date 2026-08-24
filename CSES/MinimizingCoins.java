
import java.util.*;

public class MinimizingCoins {
   public static int coins(int[] c, int x, int idx, int coin, int sum) {
      if (idx == -1 && x == sum)
         return -1;
      if (x == 0)
         return coin;
      if (idx == -1) {
         idx = c.length - 1;
      }
      if (x % c[idx] == 0) {
         coin++;
         x -= c[idx];
         idx = c.length-1;
      }
      return coins(c, x, idx - 1, coin, sum);
   }

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int x = sc.nextInt();
      int c[] = new int[n];
      for (int i = 0; i < n; i++) {
         c[i] = sc.nextInt();
      }
      Arrays.sort(c);
      int min = coins(c, x, n - 1, 0, x);
      System.out.println(min);
   }
}
