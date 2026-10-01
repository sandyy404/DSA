public class LC_474 {
   public static void main(String[] args) {
      String strs[] = { "10", "0001", "111001", "1", "0" };
      int m = 5;
      int n = 3;
      int dp[][] = new int[m+1][n+1];
      for(int i=0;i<strs.length;i++){
         int zeros =0;
         int ones = 0;
         for(char ch:strs[i].toCharArray()){
            if(ch=='0'){
               zeros++;
            }else{
               ones++;
            }
         }
         for(int j=m;j>=zeros;j--){
            for(int k=n;k>=ones;k--){
               dp[j][k] = Math.max(dp[j][k],1+dp[j-zeros][k-ones]);
            }
         }
      }
      for(int i=0;i<=m;i++){
         for(int j=0;j<=n;j++){
            System.out.print(dp[i][j]+" ");
         }
         System.out.println();
      }
   }
}