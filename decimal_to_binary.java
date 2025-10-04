
public class decimal_to_binary {

    public static void main(String[] args) {
        int original = -7;
        int n = original;
        String binary = "";

        int num = 0;
        while (Math.abs(n) > 0) {
            num = Math.abs(n) % 7;
            binary = num + binary;
            n = Math.abs(n) / 7;
        }
        if (original < 0) {
            binary = "-" + binary;
        }
        System.out.print(binary + " ");
        // decToBinary(n);

    }

    // 2nd way
    // static void decToBinary(int n) {
    //     if (n > 0) {
    //         int num = n % 2;
    //         n /= 2;
    //         decToBinary(n);
    //         System.out.print(num);
    //     } 
    //     else if (n==0) {
    //          System.out.print(n);
    //     }
    // }
}
