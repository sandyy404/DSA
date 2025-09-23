
public class merge_array {

    static int[] marge(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int m = arr2.length;
        //  int arr.length = m+n;
        int[] arr = new int[n + m];
        int i = 0, j = 0, k = 0;
        while (i < n && j < m) {
            if (arr1[i] < arr2[j]) {
                arr[k] = arr1[i];
                i++;
                k++;
            } else {
                arr[k] = arr2[j];
                j++;
                k++;
            }
        }
        while (i < n) {
            arr[k++] = arr1[i++];
        }
        while (j < m) {
            arr[k++] = arr2[j++];
        }
        return arr;

    }

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {2, 4, 6, 8};
        int[] arr = marge(arr1, arr2);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
