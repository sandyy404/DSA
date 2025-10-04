
import java.util.Arrays;

public class L_1 {

    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 1, 19};

        int target = 4;
       int []result = twoSum(nums, target);
       Arrays.toString(result);
       for(int a :result){
         System.out.print(a + " ");
       }
   //      Arrays.toString(nums);
   // for(int a:nums){
   //    System.out.print(a + " ");
   // }
    }
}
