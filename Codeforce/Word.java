package Codeforce;
import java.util.Scanner;
public class Word {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int upcase = 0;
        int lcase = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isUpperCase(ch)) {
                upcase++;
            } else {
                lcase++;
            }
        }
        if (upcase <= lcase) {
            s = s.toLowerCase();
        }
        if (upcase > lcase) {
            s = s.toUpperCase();
        }
        System.out.println(s);
    }
}
