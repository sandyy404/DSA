package Recursion;
// print linearly from 1 to n by using backtracking.
public class P_4 {
   static void print(int n){
      if(n==0)return;
      print(n-1);
      System.out.print(n +" ");
   }
   public static void main(String[] args) {
      print(5);
   }
}
