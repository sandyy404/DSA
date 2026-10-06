import java.util.*;

public class MaximumIncrease {
   // public static int fun(int i, int j, int[] arr, int ans) {
   // if (j >= arr.length)
   // return ans;
   // if (arr[i] < arr[j]) {
   // return fun(i + 1, j + 1, arr, ans + 1);
   // }
   // return Math.max(fun(i + 1, j + 1, arr,1),ans);

   // }

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int[] arr = new int[n];
      for (int i = 0; i < n; i++) {
         arr[i] = sc.nextInt();
      }
      int dp[] = new int[n];
      // if (n == 1) {
      // System.out.println(1);
      // } else {
      // System.out.println(fun(0, 1, arr, 1));
      // }
      dp[0] = 1;
      int ans = 1;
      for (int i = 1; i < n; i++) {
         if(arr[i-1]<arr[i]){
          ans++;
         }else{
            ans = 1;
         }
         dp[i] = Math.max(ans, dp[i-1]);
      }
      // for(int num:dp){
      //    System.out.print(num +" ");
      // }
       System.out.println(dp[n-1]);
      sc.close();
   }
}