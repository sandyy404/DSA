import java.util.Arrays;

public  class P{
public static int fun(int[] arr, int target, int sum, int i, int[][] dp, int totalSum) {
        if (i == arr.length) {
            if (sum == target) {
                return 1;
            }
            return 0;
        }
        if (dp[i][sum + totalSum] != Integer.MIN_VALUE) {
            return dp[i][sum + totalSum];
        }
        
        int a = fun(arr, target, sum - arr[i], i + 1, dp, totalSum);
        int b = fun(arr, target, sum + arr[i], i + 1, dp, totalSum);
        
        return dp[i][sum + totalSum] = a + b;
    }
   public static void main(String[] args) {
      int nums[]={1,1,1};
      int target = 1;
      int totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }
        int[][] dp = new int[nums.length + 1][2 * totalSum + 1];
        for (int i = 0; i <= nums.length; i++) {
            Arrays.fill(dp[i], Integer.MIN_VALUE);
        }
      System.out.println(fun(nums, target, 0, 0, dp, totalSum));
      for(int[]arr:dp){
         for(int a:arr){
            System.out.print(a+" ");
         }
         System.out.println();
      }
   }
}