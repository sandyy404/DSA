import java.util.Scanner;

public class NumberSpiral {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int t = sc.nextInt();
      while (t-- > 0) {
         int y = sc.nextInt();
         int x = sc.nextInt();
         int i = 0;
         int j = 0;
         int val = 1;
         while (i == y && j == x) {
            if (i == y - 1 && j == x - 1) {
               System.out.println(val);
               break;
            }else{
               
            }
         }
      }
   }
}