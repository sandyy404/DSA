package Sorting;

public class Selection {

    public static void selection(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {12, 9, 8, 30, 23, 11, 23};
        selection(arr);
        for (int a : arr) {
            System.out.print(a + " ");
        }
    }
}
