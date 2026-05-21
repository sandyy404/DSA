
import java.util.Scanner;

public class Inverted_Left_Half_Pyramid {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      for(int i=0;i<n;i++){
         for(int j=i;j<n;j++){
            System.out.print("* ");
         }
         System.out.println();
      }
   }
}
