
import java.util.Scanner;

public class Game_with_integer {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
          int n = sc.nextInt();
          if((n-1)%3==0 || (n+1)%3==0){
            System.out.println("First");
          }else{
            System.out.println("Second");
          }
        }
    }
}
