
import java.util.Scanner;

public class  Bear_and_Brother{
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int b = sc.nextInt();
      int w = 0;
     while(a<=b){
        a *=3;
        b *=2;
        if(a<=b){
         w++;
        } 
     }
     System.out.println(w+1);
   }
}