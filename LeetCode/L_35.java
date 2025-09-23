
public class L_35 {

    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 6};
        int target = 5;
        int start = 0;
        int end = arr.length - 1;
        L_35 l = new L_35();
        System.out.println(l.Binary_Search(arr, target));
    }

    int Binary_Search(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
        
        int m = start + (end - start) / 2;
        if (arr[m] == target) {
            return m;
        }
        if (arr[m] < target) {
            start = m + 1;

        } else {
            end = m - 1;
        }
      }
        return start;
    }

   }
   

