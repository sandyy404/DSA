
import java.util.*;

public class ProjectEuler_1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            int n = in.nextInt();
            int k1 = (n - 1) / 3;
             int sum_k1 = 3 * k1 * (k1 + 1) / 2;
             int k2 = (n - 1) / 5;
           int sum_k2 = 5* k2 * (k2 + 1) / 2;
           int k3= (n - 1) / 15;
           int sum_k3 = 15 * k3 * (k3 + 1) / 2;
            System.out.println(sum_k1 + sum_k2 - sum_k3);
        }


        in.close();
    }  
}

