package DP;

import java.util.*;

public class StoneGame {
   public static int fun(int i, int j, int[] arr, int max, int min, int[][] dp) {
      if ((min < i || min > j) && (max < i || max > j))
         return 0;
      if (i > j) return 1000000;
      if (dp[i][j] != -1)
         return dp[i][j];
      int left = 1 + fun(i + 1, j, arr, max, min, dp);
      int right = 1 + fun(i, j - 1, arr, max, min, dp);
      return dp[i][j] = Math.min(left, right);
   }

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int t = sc.nextInt();
      while (t-- > 0) {
         int n = sc.nextInt();
         int arr[] = new int[n];
         int minIdx = 0;
         int maxIdx = 0;
         for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] < arr[minIdx]) {
               minIdx = i;
            }
            if (arr[i] > arr[maxIdx]) {
               maxIdx = i;
            }
         }
         int dp[][] = new int[n][n];
         for (int i = 0; i < n; i++) {
            Arrays.fill(dp[i], -1);
         }
         fun(0, arr.length - 1, arr, maxIdx, minIdx, dp);
         for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
               System.out.print(dp[i][j]+" ");
            }
            System.out.println();
         }
         // System.out.println(fun(0, arr.length - 1, arr, maxIdx, minIdx, dp));
      }
   }
}
