
import java.util.Scanner;

public class Soldier_Bananas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        int w = sc.nextInt();
        int trs = 0;
        for (int i = 1; i <= w; i++) {
            trs += k * i;
        }
       int a = trs-n;
       if(a<0){
         System.out.println(0);
       }else{
         System.out.println(a);
       }

    }
}
