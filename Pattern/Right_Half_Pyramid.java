package Pattern;


import java.util.Scanner;

public class Right_Half_Pyramid{
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
        for(int i=0;i<n;i++){
            int j=0;
            while(j<=i){
                System.out.print("*");
                j++;
            }
            System.out.println();
        }
    }
}
   