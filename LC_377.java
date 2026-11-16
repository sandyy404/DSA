public class LC_377 {
   public static void main(String[] args) {
      int[] nums = { 1, 2, 3 };
      int target = 4;
      int dp[] = new int[target + 1];
      dp[0] = 1;
      for (int i = 1; i <= target; i++) {
         for (int num : nums) {
            if (i >= num) {
               dp[i] += dp[i - num];
            }
         }
      }
      System.out.println(dp[target]);
      for (int num : dp) {
         System.out.print(num + " ");
      }
   }
}
