package Recursion;
// sum of first n numbers.
public class P_6 {
   // static int sum(int n){
   //    if(n==0)return 0 ;
   //    return sum(n-1) + n;
   // }
   public static int sum1 = 0;
   static  int sum(int n){
      if(n==0)return 0;
       sum1 +=sum(n-1);
      return sum1; 
   }
   public static void main(String[] args) {
      int a = sum(10);
      System.out.println(a);
   }
}
