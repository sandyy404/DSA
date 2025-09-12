
import java.util.Scanner;

public class fibonacci_sum_nth {
   static int term;
   static  int sum = 1;
   public static int fib(int term){
  if(term == 1){
   return  0;
  }
  else if(term==2){
   return 1;
  }else{
    for( int i = 3; i<=term; i++){
      sum += fib(term -1) + fib(term -2);
    } return sum;
  }
   }
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the number:");
       int num = sc.nextInt();
       int fibo = fib(num);
       System.out.println(fibo);

   }
   
}
