
import java.util.*;

public class RemovingDigits {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      if (n < 10)
         System.out.println(1);
      else {
         int dp[] = new int[n + 1];
         Arrays.fill(dp, Integer.MAX_VALUE);
         dp[0] = 0;
         for (int i = 1; i <= n; i++) {
            int num = i;
            int max = Integer.MAX_VALUE;
            while (num > 0) {
               if (num % 10 != 0) {
                  max = Math.min(max, Math.min(dp[i], 1 + dp[i - num % 10]));
               }
               num /= 10;

            }
            dp[i] = max;
         }
         System.out.println(dp[n]);
      }
   }
}
