package Codeforce;

import java.util.ArrayList;
import java.util.Scanner;

public class Nearly_Lucky {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> al = new ArrayList<>();
        while (n > 0) {
            al.add(n % 10);
            n /= 10;
        }
        for (int i = 0; i < al.size(); i++) {
            if (al.get(i) != 7 || al.get(i) != 4) {
                System.out.println("NO");
                return;
            }
        }
    }
}
