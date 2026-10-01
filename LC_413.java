import java.util.*;

public class LC_413 {
   public static void main(String[] args) {
      int[] arr = { 1, 2, 3, 4 };
      int n = 4;
      List<List<Integer>> list = new ArrayList<>();
      for (int i = 0; i < n; i++) {
         for (int j = 0; j < n; j++) {
            List<Integer> temp = new ArrayList<>();
            for (int k = i; k <= j; k++) {
               temp.add(arr[k]);
            }
            list.add(temp);
         }
      }
      for (int i = 0; i < list.size(); i++) {
         for (int j = 0; j < list.get(i).size(); j++) {
            if(j-i>=3){
            System.out.print(list.get(i).get(j) + " ");
            }
         }
         // System.out.println();
      }
   }
}
