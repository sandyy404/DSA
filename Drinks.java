
import java.util.Scanner;

public class Drinks {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      double tval = 0;
      int val =0;
      for(int i=0;i<n;i++){
         val = sc.nextInt();
         tval +=val;
      }
     System.out.println(tval/n);
   }
}
