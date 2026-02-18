
import java.util.Scanner;

public class Petya_Strings{
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int[][]contests = new int[n][3];
      int solved = 0;
      for(int i=0;i<n;i++){
         for(int j = 0;j<3;j++){
            contests[i][j] = sc.nextInt();
         }
      }
      for(int i=0;i<n;i++){
         for(int j=0;j<3;j++){
             if(contests[i][j]==1){
               
             }
         }
      }

   }
}