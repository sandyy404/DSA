package Codeforce;


import java.util.Scanner;

public class Petya_and_String {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        int n1 = 0;
        String s2 = sc.nextLine();
        int n2 = 0;
        for (int i = 0; i < s1.length(); i++) {
           String f = s1.toLowerCase();
           String s = s2.toLowerCase();
            if (f.charAt(i) != s.charAt(i)) {
                if (f.charAt(i) < s.charAt(i)) {
                    n2++;
                    break;
                } else if (f.charAt(i) > s.charAt(i)) {
                    n1++;
                    break;
                }
            }
        }
        if (n2 == n1) {
            System.out.println(0);
        } else if (n1 > n2) {
            System.out.println(1);
        } else {
            System.out.println(-1);
        }
    }
}
