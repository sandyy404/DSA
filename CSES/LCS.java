import java.util.*;

public class LCS {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int m = sc.nextInt();
      int[] A = new int[n];
      int[] B = new int[m];
      for (int i = 0; i < n; i++) {
         A[i] = sc.nextInt();
      }
      for (int i = 0; i < m; i++) {
         B[i] = sc.nextInt();
      }
      int[][] dp = new int[n + 1][m + 1];
      for (int i = 0; i <= n; i++) {
         dp[i][0] = 0;
      }
      for (int i = 0; i <= m; i++) {
         dp[0][i] = 0;
      }
      List<Integer> list = new ArrayList<>();
      for (int i = 1; i <= n; i++) {
         for (int j = 1; j <= m; j++) {
            if (A[i - 1] == B[j - 1]) {
               dp[i][j] = 1 + dp[i - 1][j - 1];
            } else {
               dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
            }
         }
      }
      // for(int i[]:dp){
      // for(int a:i){
      // System.out.print(a +" ");
      // }
      // System.out.println();
      // }
      System.out.println(dp[n][m]);
      // for(int i=0;i<list.size();i++){
      // System.out.print(list.get(i)+" ");
      // }

      int i = n;
      int j = m;
      while (i > 0 && j > 0) {
         if (A[i - 1] == B[j - 1]) {
            list.add(A[i - 1]);
            i--;
            j--;
         } else {
           if(dp[i][j-1]>dp[i-1][j]){
             j--;
           }else{
            i--;
           }
         }
      }
     for(int a=list.size()-1;a>=0;a--){
       System.out.print(list.get(a)+" ");
     }
   }
}