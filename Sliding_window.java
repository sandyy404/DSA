
public class Sliding_window {

    public static void main(String[] args) {
        int[] arr = {5, 2, -1, 0, 3};
        int k = 3;
        int n = arr.length;
        if (n < k) {
            System.out.println("The maximum sum will be sum of all elements");
        }
        int window_sum = 0;
        for (int i = 0; i < k; i++) {
            window_sum += arr[i];
        }
        int max_sum = window_sum;
        for (int i = k; i < n; i++) {
            window_sum += arr[i] - arr[i-k];
            max_sum = Math.max(max_sum, window_sum);
        }
        System.out.println(max_sum);
    }
}
