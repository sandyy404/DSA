import java.util.*;
public class divide {
   // Recursion
   // public static int ways(int n){
   //    if(n==0)return 1;
   //    return ways(n/2)+ways(n/3);
   // }
  //Memoization.
   // public static int ways(int n,int dp[]){
   //    if(n==0)return 1;
   //    if(dp[n]!=-1)return dp[n];
   //     return dp[n] =ways(n/2, dp)+ways(n/3, dp);
   // }
   //Tabulation.
    
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int dp[] = new int[n+1];
        Arrays.fill(dp, -1); 
      int way1 = ways(n,dp);
      System.out.println(way1);
   }
}