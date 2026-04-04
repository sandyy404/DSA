
import java.util.Scanner;

public class Calculating_function {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int f = 0;
      for(int i=1;i<=n;i++){
         if(i%2!=0){
            f -=i;
         }else{
            f +=i;
         }
      }
      System.out.println(f);
   }
}
