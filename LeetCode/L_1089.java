
public class L_1089 {

    public static void main(String[] args) {
        int count = 0;
        int[] arr = {1, 0, 2, 3, 0, 4, 5, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                count++;
            }
        }
        System.out.println(count);
        int i = arr.length - 1;
        int j = (arr.length - 1) + (count);
        while (i != j) {
            insert(arr, i, j);
            j--;
            if (arr[i] == 0) {
                insert(arr, i, j);
                j--;
            }
            i--;
        }
        for (int a : arr) {
            System.out.print(a + " ");
        }
    }

    static void insert(int[] arr, int i, int j) {
        if (j < arr.length) {
            arr[j] = arr[i];
        }
    }
}
//[1,0,0,2,3,0,0,4]
