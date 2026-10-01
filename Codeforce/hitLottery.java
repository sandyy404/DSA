
import java.util.*;

public class hitLottery {
   public static int bill(int n, int cnt) {
      if (n == 0)
         return cnt;
      if (n >= 100) {
         return bill(n % 100, cnt + n / 100);
      } else if (n >= 20) {
         return bill(n % 20, cnt + n / 20);
      } else if (n >= 10) {
         return bill(n % 10, cnt + n / 10);
      } else if (n >= 5) {
         return bill(n % 5, cnt + n / 5);
      } else {
         return bill(n - 1, cnt + n);
      }
   }

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int dp[] = new int[n];
      Arrays.fill(dp, -1);
      int bills = bill(n, 0);
      System.out.println(bills);
   }
}
