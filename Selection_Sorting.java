import java.util.*;
public class Selection_Sorting {

    void selectionsort() {
        int[] arr = {2, 4, 5, 1, 3};
        int n = arr.length;
        for (int i = 0; i < n ; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n ; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
       System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        Selection_Sorting ss = new Selection_Sorting();
        ss.selectionsort();
    }
}
