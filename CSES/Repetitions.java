package CSES;

import java.util.Scanner;

public class Repetitions {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int len = 0;
        int maxlen = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) != s.charAt(i + 1)) {
                len++;
                if (len > maxlen) {
                    maxlen = len;
                }
                len = 0;
            } else {
                len++;
                // if (len > maxlen) {
                //     maxlen = len;
                // }
            }
        }
        if (s.length() > 1) {
            if (s.charAt(s.length() - 2) == s.charAt(s.length() - 1)) {
                len++;
            }
        } else {
            len++;
        }
        System.out.println(Math.max(len, maxlen));

    }
}
