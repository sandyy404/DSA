
import java.util.Scanner;

public class TrailingZeros {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int a = 1;
      int tzeros = 0;
      while((n / (int)Math.pow(5, a))>0){
       tzeros = tzeros+ (n / (int)Math.pow(5, a));
       a++;
      }
      System.out.println(tzeros);
   }
}
