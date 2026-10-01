
import java.util.Scanner;

public class DiceCombinations{
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int way = (int) Math.pow(2, n - 1);
      way = way%((int)Math.pow(10, 9)+7);
      System.out.println(way);
   }
}