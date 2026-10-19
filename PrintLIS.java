import java.util.ArrayList;
import java.util.Arrays;

public class PrintLIS {
   public static void main(String[] args) {
      int nums[] = { 10, 20, 9, 33, 21, 50, 41, 60, 80 };
      int n = nums.length;
      int dp[] = new int[n];
      Arrays.fill(dp, 1);
      int arr[] = new int[n];
      Arrays.fill(arr, -1);
      for (int i = 1; i < n; i++) {
         for (int j = 0; j < i; j++) {
            if (nums[i] > nums[j]) {
               if (dp[j] + 1 > dp[i]) {
                  dp[i] = dp[j] + 1;
                  arr[i] = j;
               }
            }
         }
      }
      for (int i = 0; i < n; i++) {
         System.out.print(arr[i] + " ");
      }
      System.out.println();
      int max = 0;
      ArrayList<Integer> list = new ArrayList<>();
      for (int i = 1; i < n; i++) {
         if (dp[i] > dp[max]) {
            max = i;
         }
      }
      int it = max;
      while (it != -1) {
         list.add(nums[it]);
         it = arr[it];
      }
      for(int i=0;i<list.size();i++){
         System.out.print(list.get(i)+" ");
      }
   }
}