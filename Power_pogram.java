
import java.util.Scanner;

public class Power_pogram {


    public static int power(int base, int expo) {
        if (expo != 0) {
            return (base * power(base, expo - 1));
        }
        else{
         return 1;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base ");
        int b = sc.nextInt();
        System.out.print("Enter the power");
        int p = sc.nextInt();
        System.out.println(power(b, p));
    }

}
