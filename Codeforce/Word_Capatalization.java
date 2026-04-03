package Codeforce;


import java.util.Scanner;

public class Word_Capatalization {

    public static void main(String[] args) {
        String str = "";
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        for (int i = 0; i < s.length(); i++) {
            if (i == 0) {
                str += Character.toUpperCase(s.charAt(i));
            } else {
                str += s.charAt(i);
            }
        }
        System.out.println(str);
    }
}
