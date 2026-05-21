package Pattern;

import java.util.Scanner;

public class Inverted_Right_Half_Pyramid {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n  = sc.nextInt();
      for(int i=0;i<n;i++){
         int j = n-(i+1);
         while(j>=0){
            System.out.print("* " );
            j--;
         }
         System.out.println();
      }
   }
}
