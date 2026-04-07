
import java.util.Scanner;

public class New_750A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int rtime = 240-k;
        int solved = 0;
        for (int i = 1; i <= n; i++) {
           int t = 5*i;
           rtime -=t;
           if(rtime<0){
              break;
            }else{
               solved++;
            }
        }
        System.out.println(solved);
    }
}
