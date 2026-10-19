import java.util.*;

public class LC_354 {
   public static void main(String[] args) {
      int env[][] = { { 5, 4 }, { 6, 4 }, { 6, 7 }, { 2, 3 } };
      Arrays.sort(env, (a, b) -> {
         if (a[0] != b[0]) {
            return Integer.compare(a[0], b[0]);
         }
         return Integer.compare(b[1], a[1]);
      });
    int arr[] = new int[4];
      for(int i=0;i<4;i++){
         arr[i] = env[i][1];
      }
      int dp[] = new int[4];
      Arrays.fill(dp, 1);
      for(int i=0;i<4;i++){
         for(int j=0;j<i;j++){
            if(arr[i]>arr[j]){
               dp[i] = Math.max(dp[i], dp[j]+1);
            }
         }
      }
      int max = 0;
      for(int i=0;i<4;i++){
         if(dp[i]>max){
            max = dp[i];
         }
      }
      System.out.println(max);
      
   }
}