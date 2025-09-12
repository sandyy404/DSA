
import java.util.Scanner;

public class factorial {

    public static long myfact(int n) {
        if (n > 0) {
           return n * myfact(n - 1);
         } else {
           return 1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:-");
        int num = sc.nextInt();
        long factorial1 = myfact(num);
        System.out.println(factorial1);
    }

}
