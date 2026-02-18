package Codeforce;



import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] words = new String[100];
        for (int i = 0; i < n; i++) {
            words[i] = sc.nextLine();

        }

        for (int i = 0; i < n; i++) {
           if (words[i].length() > 10) {
                System.out.println("" + 
                    words[i].charAt(0) + 
                    (words[i].length() - 2) + 
                    words[i].charAt(words[i].length() - 1));
            } else {
                System.out.println(words[i]);
            }
        }

    }
}
