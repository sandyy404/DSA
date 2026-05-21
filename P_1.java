
import java.util.*;

public class P_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int j = n / 2;
            if (i < j) {
                for (int k = j - i; k <= j + i; k++) {
                    System.out.print("*" + " ");
                }
            } else if (j < i) {
                for (int k = j - (n - i); k <= j + (n - i); k++) {
                    System.out.print("*" + " ");
                }
            } else {
                for (int k = 0; k < n; k++) {
                    System.out.print("*" + " ");
                }
            }
            System.out.println();
        }
    }
}
