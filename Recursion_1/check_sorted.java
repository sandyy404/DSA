package Recursion_1;

public class check_sorted {

    public static boolean sorted(int[] arr, int n) {
        if (n == 0||n==1) {
            return true;
        }
        

        return arr[n-1]>=arr[n-2]&&(sorted(arr, n - 1));

    }

    public static void main(String[] args) {
        int[] arr = {1,4,2,5};
        int n = arr.length;
        boolean bool = sorted(arr, n);
        System.out.println(bool);
    }
}
