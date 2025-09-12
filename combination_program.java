//C(n,r)= C(n-1,r-1) + C(n-1,r);

import java.util.Scanner;


public class combination_program {

    public static long combination(int n, int r) {
     if (r > n || n<0 || r<0) {
      return 0;
     } 
     else  if (r == 0 || r ==n) {
      return 1; 
     }
     else {
return combination(n - 1, r - 1) + combination(n - 1, r);
     }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n");
        int n = sc.nextInt();
        System.out.print("Enter the value of r");
        int r = sc.nextInt();
        System.out.println(combination(n, r));
    }
   }
