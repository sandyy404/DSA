
import java.util.*;

public class FairDivision {
   public static boolean fun(int i, int val, int sum, int[] arr, Boolean[][] dp) {
      if (val == sum)
         return true;
      if (val > sum || i == arr.length)
         return false;
      if (dp[i][val] != null)
         return dp[i][val];
      return dp[i][val] = fun(i + 1, val + arr[i], sum, arr, dp) || fun(i + 1, val, sum, arr, dp);
   }

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int t = sc.nextInt();
      while (t-- > 0) {
         int n = sc.nextInt();
         int sum = 0;
         int arr[] = new int[n];
         for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
         }
         if (sum % 2 == 0) {
            int half = sum / 2;
            Boolean dp[][] = new Boolean[n][half];
            if (fun(0, 0, half, arr, dp)) {
               System.out.println("YES");
            } else {
               System.out.println("NO");
            }
         } else {
            System.out.println("NO");
         }
      }
   }
}
