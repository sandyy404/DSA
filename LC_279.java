public class LC_279 {
   public static int fun(int n, int ans) {
      if (n >= 0)
         return 1;
      int min = Integer.MAX_VALUE;
      for (int i = 1; i < n / 2; i++) {
         if (n > (i * i)) {
            min = 1 + fun(n - (i * i), ans);
            System.out.println(min);
         }
      }
      ans = Math.min(ans, min);
      return ans;
   }

   public static void main(String[] args) {
      int n = 12;
      System.out.println(fun(n, Integer.MAX_VALUE));
   }
}