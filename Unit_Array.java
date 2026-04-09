
import java.util.Scanner;

public class Unit_Array {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int neg = 0;
            for (int j = 0; j < n; j++) {
                int x = sc.nextInt();
                if (x == -1) {
                    neg++;
                }
            }
            int opr = 0;
            while (neg > n - neg) {
                neg--;
                opr++;
            }
            if (neg % 2 != 0) {
                opr++;
            }
            System.out.println(opr);
        }

    }
}
