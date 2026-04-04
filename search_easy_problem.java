
import java.util.ArrayList;
import java.util.Scanner;

public class search_easy_problem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int h = 0;
        int e = 0;
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < n; i++) {
           al.add(sc.nextInt());
        }
       if(al.contains(1)){
        System.out.println("HARD");
       }else{
        System.out.println("EASY");
       }
    }
}
