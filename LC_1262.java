import java.util.*;
public class LC_1262 {
   public static void main(String[] args) {
      int nums[] = { 3, 6, 5, 1, 8 };
      int n = nums.length;
      int sum = 0;
      for (int num : nums) {
         sum += num;
      }
      boolean[][] dp = new boolean[n + 1][sum + 1];
      for(int i=0;i<=n;i++){
         Arrays.fill(dp[i], false);
      }
      for (int i = 0; i <= n; i++) {
         dp[i][0] = true;
      }
      for (int i = 1; i <= n; i++) {
         for (int j = 1; j <= sum; j++) {
            boolean ntake = dp[i - 1][j];
            boolean take = false;
            if (j >= nums[i - 1]) {
               take = dp[i - 1][j - nums[i - 1]];
            }
            dp[i][j] = ntake || take;
         }
      }
      // for(boolean []arr:dp){
      //    for(boolean num:arr){
      //       System.out.print(num+" ");
      //    }
      //    System.out.println();
      // }
      int max = 0;
      for(int i=sum;i>=0;i--){
         if(dp[n][i] && i%3==0){
           max = Math.max(max, i);
         }
      }
      System.out.println(max);
   }
}
