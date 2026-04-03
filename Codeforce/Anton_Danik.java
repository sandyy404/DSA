
import java.util.Scanner;

public class Anton_Danik {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      String s = sc.next();
      int a = 0;
      int d = 0;
      for(int i=0;i<s.length();i++){
         if(s.charAt(i)=='A'){
              a+=1;
         }else{
            d++;
         }
      }
      if(a>d){
         System.out.println("Anton");
      }else if(a<d){
         System.out.println("Danik");
      }else{
         System.out.println("Friendship");
      }
   }
}
