
import java.util.Scanner;

public class Division {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            if (num >= 1900) {
                System.out.println("Division 1");
            } else if (num >= 1600 && num <= 1899) {
                System.out.println("Division 2");
            } else if (num >= 1400 && num <= 1599) {
                System.out.println("Division 3");
            } else {
                System.out.println("Division 4");
            }
        }

    }
}
