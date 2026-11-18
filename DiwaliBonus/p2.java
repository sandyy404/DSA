package DiwaliBonus;

import java.util.Scanner;

public class p2 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int arr[] = new int[n];
      for (int i = 0; i < n; i++) {
         arr[i] = sc.nextInt();
      }
      int dp[] = new int[n];
      dp[0] = 0 ;
      int val = arr[0];
      for (int i = 1; i < n; i++) {
         dp[i] = arr[i] - val;
         if (arr[i] < val) {
            val = arr[i];
         }
      }
      int value = Integer.MIN_VALUE;
      for (int num : dp) {
         if (num > value) {
            value = num;
         }
      }
      System.out.println(value);
   }
}
