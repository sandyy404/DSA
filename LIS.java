
import java.util.*;

public class LIS {
//    public static int fun(int i, int[] arr,int[]dp) {
//       if(i==arr.length)return 0;
//       if(dp[i]!=-1)return dp[i];
//       int mx = 1;
//       for (int j = i - 1; j >= 0; j--) {
//          if (arr[i] > arr[j]) {
//             mx = Math.max(mx, 1 + fun(j, arr,dp));
//          }
//       }
//       return dp[i] = mx;
//    }

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int arr[] = new int[n];
      for (int i = 0; i < n; i++) {
         arr[i] = sc.nextInt();
      }
      int[] dp = new int[n + 1];
      Arrays.fill(dp, 1);
      // int max = 0;
      // for (int i = 0; i < n; i++) {
      //  max = Math.max(max, fun(i, arr,dp));
      // } 
      // System.out.println(max);
      for(int i=1;i<n;i++){
         for(int pre = 0;pre<i;pre++){
            if(arr[i] > arr[pre]){
               dp[i] = Math.max(dp[i], dp[pre] + 1);
            }
         }
      }
      int max = 0;
      for (int i = 0; i < n; i++) {
         max = Math.max(max, dp[i]);
      }
      System.out.println(max);
   }
}