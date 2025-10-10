
public class Bubble {

    public static void bubbly(int[] arr) {
        int n = arr.length;
        boolean swaped;
        for (int i = 0; i < n - 1; i++) {
            swaped = false;
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swaped = true;
                }
            }
            if (swaped == false) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 6, 2, 8};
        bubbly(arr);
        for (int a : arr) {
            System.out.print(a + " ");
        }
    }
}
