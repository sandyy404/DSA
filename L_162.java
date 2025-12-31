
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class L_162 {

    public static int findPeakElement(int[] nums) {
        Map<Integer, Integer> mp = new HashMap<>();
        for(int i=0;i<nums.length;i++){
             mp.put(nums[i], i);
        }
         Arrays.sort(nums);
   return mp.get(nums[nums.length-1]);

    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 1};
        int a = findPeakElement(nums);
        System.out.println(a);
    }

}
// public static int findPeakElement(int[] nums) {
//     for (int i = 0; i < nums.length - 1; i++) {
//         if (nums[i] > nums[i + 1]) {
//             return i;
//         }
//     }
//     return nums.length - 1;
// }