
public class reverse_arrays {

    static void reverse(int[] arr) {
        int start = 0, end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
         }
         // System.out.print(arr[start]);
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 3, 2, 6};
         reverse(arr);
        for(int i:arr ){

        System.out.print(i +  " ");
        }
    }
}
