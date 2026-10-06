import java.util.Scanner;

public class ArrayDescription {
    private static int cnt = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        solve(arr, 0, m);
        System.out.println(cnt);
    }
    private static void solve(int[] arr, int index, int m) {
        if (index == arr.length) {
            cnt++;
            return;
        }
        if (arr[index] != 0) {
            if (index > 0 && Math.abs(arr[index] - arr[index - 1]) > 1) {
                return; 
            }
            solve(arr, index + 1, m); 
            return;
        }
        for (int v = 1; v <= m; v++) {
            if (index > 0 && Math.abs(v - arr[index - 1]) > 1) {
                continue; 
            }
            arr[index] = v;        
            solve(arr, index + 1, m); 
            arr[index] = 0;          
        }
    }
}
