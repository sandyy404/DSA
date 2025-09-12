
import  java.util.Scanner;
public class fibonacci_of_nth {


   public static int fib(int n ){
      if(n==1){
         return 0;
      }
      else if(n==2){
         return 1;

      } else{
         return fib(n-1)+fib(n-2);
      }
   }
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter the number:-");
     int num = sc.nextInt();
     int fibonacci = fib(num);
     System.out.println(fibonacci);

 }  
   
}
