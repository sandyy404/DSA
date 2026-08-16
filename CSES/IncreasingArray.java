
import java.util.Scanner;

public class IncreasingArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int num = Integer.MIN_VALUE;
        int diff = 0;
        for (int i = 1; i < n; i++) {
            if (arr[i - 1] >= arr[i]) {
                diff = arr[i - 1] - arr[i];
                if (diff > num) {
                    num = diff ;
                }
            }
        }
        if (arr.length == 1) {
            num = 0;
        }
        System.out.println(num);
    }
}
