import java.util.Arrays;
public class Quick_sort {

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }

    }

    public static void main(String[] args) {
        int arr[] = {2, 1, 4, 6, 8, 1, 10};
        int low = 0;
        int high = arr.length - 1;
        quickSort(arr, low, high);
        System.out.println(Arrays.toString(arr));
    }

    private static int partition(int[] arr, int low, int high) {
        int pi = low;
        int i = low;
        int j = high;
        while (i < j) {
            while (i <= j && arr[i] <= arr[pi]) {
                i++;
            }
            while (i <= j && arr[j] > arr[pi]) {
                j--;
            }
            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        //   arr[i] = arr[j];
        int temp1 = arr[pi];
        arr[pi] = arr[j];
        arr[j] = temp1;

        return j;
    }
}
