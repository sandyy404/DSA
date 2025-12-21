package Sorting;

public class Quick {

    public static void quicksort(int[] arr, int start, int end) {
        if (start < end) {
            // pi is the partition return index of pivot
            int pi = partition(arr, start, end);
            quicksort(arr, start, pi - 1);
            quicksort(arr, pi + 1, end);
        }

    }

    public static int partition(int[] arr, int start, int end) {
        int pivot = arr[end];
        int i = start - 1;
        for (int j = start; j < end; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = arr[end];
        arr[end] = temp;
        return i;     //pivot index;
    }

    public static void main(String[] args) {
        int[] arr = {10, 80, 30, 90, 40};
        quicksort(arr, 0, arr.length - 1);
        for (int a : arr) {
            System.out.print(a + " ");
        }
    }
}
