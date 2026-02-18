package Recursion;
// print linearly from 1 to n by using backtracking.
public class P_5 {
   static  void print(int i, int n){
      if(i>n){
         return;
      }
      print(i+1,n);
      System.out.print(i + " ");
   }
   public static void main(String[] args) {
      print(1, 10);
   }
}
