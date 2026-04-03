


import java.util.Scanner;

public class Stones_Table {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;
       String s = sc.next();
        for (int i = 0; i < n - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
