import java.util.*;

public class TwoKnights {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      for (int i = 1; i <= n; i++) {
         System.out.println((long)((i * i) * ((long)(i * i) - 1) / 2) - (long)(4 * (long)((i - 1) * (i - 2))));
      }
   }
}