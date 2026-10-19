
import java.util.Arrays;

public class NumberOfLis {
   public static void main(String[] args) {
      int nums[] = { 1, 3, 2, 4, 5, 7, 6 };
      int n = nums.length;
      int dp[] = new int[n];
      int cnt[] = new int[n];
      Arrays.fill(dp, 1);
      Arrays.fill(cnt, 1);
      for (int i = 1; i < n; i++) {
         for (int j = 0; j < i; j++) {
            if (nums[i] > nums[j]) {
               if (dp[j] + 1 > dp[i]) {
                  dp[i] = 1 + dp[j];
                  cnt[i] = cnt[j];
               } else if (dp[i] == dp[j] + 1) {
                  cnt[i] += cnt[j];
               }
            }
         }
      }
      for (int i : dp) {
         System.out.print(i + " ");
      }
      System.out.println();
      for (int i : cnt) {
         System.out.print(i + " ");
      }
      int max = 0;
      for (int i = 0; i < n; i++) {
         if (dp[i] > max) {
            max = dp[i];
         }
      }
      System.out.println();
      System.out.println(max);
      int ans = 0;
      for (int i = 0; i < n; i++) {
         if (max ==dp[i]) {
            ans += cnt[i];
         }
      }
      System.out.println(ans);
   }
}
