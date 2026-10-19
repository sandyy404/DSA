import java.util.*;

public class LC_1679 {
   public static void main(String[] args) {
      int nums[] = { 3, 1, 3, 4, 3 };
      int k = 6;
      int n = nums.length;
      ArrayList<Integer> list = new ArrayList<>();
      for (int i = 0; i < n; i++) {
         list.add(nums[i]);
      }
      int ans = 0;
      for (int i = 0; i < n; i++) {
         if (list.contains(k - nums[i])) {
            list.remove(Integer.valueOf(nums[i]));
            list.remove(Integer.valueOf(k - nums[i]));
            ans++;
            System.out.println();
            for (int num : list) {
               System.out.print(num + " ");
            }
         }

      }
      System.out.println();
      System.out.println(ans);
   }
}