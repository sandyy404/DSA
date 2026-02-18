package Recursion;
// Print name 5 times


public class P_1 {
   static void print(int n){
      if(n==6)return;
      System.out.println("Sandeep");
      print(n+1);
      
   }
   public static void main(String[] args) {
      print(1);
   }

  
}
