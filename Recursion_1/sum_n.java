package Recursion_1;

public class sum_n {

    static int sum(int n) {
        if (n == 0) {
            return 0;
        }
        return n+sum(n - 1);
    }

    public static void main(String[] args) {
        int b = sum(10);
        System.out.println(b);
    }
}
