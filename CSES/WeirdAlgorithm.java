import java.util.Scanner;

public class WeirdAlgorithm {
   public static void wired(long n) {
      if (n == 1) {
         return;
      }
      if (n % 2 == 0) {
         System.out.println(n / 2);
         wired(n / 2);
      } else {
         System.out.println(n * 3 + 1);
         wired(n * 3 + 1);
      }
   }

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      long n = sc.nextInt();
      System.out.println(n);
      wired(n);
   }
}