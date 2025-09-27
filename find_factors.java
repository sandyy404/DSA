
import java.util.ArrayList;

public class find_factors {

   static ArrayList<Integer> factor(int n){
      ArrayList<Integer> divisor = new ArrayList<>();
      for(int i = 1; i<=n ;i++){
         if(n % i==0){
            divisor.add(i);
         }
      }
      return divisor;
   }


   public static void main(String[] args) {
      int num = 38;
      ArrayList<Integer> divisor = factor(num);
      for(int div :divisor){
         System.out.print(div  + " ");
      }
   }
   
}
