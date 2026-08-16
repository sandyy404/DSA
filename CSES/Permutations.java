
// import java.util.Scanner;

// public class Permutations {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         if (n < 4 && n>1) {
//             System.out.println("NO SOLUTION");
//         } else {
//             for (int i = 2; i <= n; i += 2) {
//                 System.out.print(i + " ");
//             }
//             for (int i = 1; i <= n; i += 2) {
//                 System.out.print(i + " ");
//             }
//         }

//     }
// }


import java.io.*;

public class Permutations {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        if (input == null || input.trim().isEmpty()) return;
        int n = Integer.parseInt(input.trim());
        if (n == 1) {
            System.out.println(1);
            return;
        }
        if (n < 4) {
            System.out.println("NO SOLUTION");
            return;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 2; i <= n; i += 2) {
            sb.append(i).append(" ");
        }
        for (int i = 1; i <= n; i += 2) {
            sb.append(i).append(" ");
        }
        System.out.println(sb.toString());
    }
}


