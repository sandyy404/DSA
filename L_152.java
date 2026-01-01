
public class L_152 {

    public static int maxProduct(int[] nums) {

        int maxEndingHere = nums[0];
        int minEndingHere = nums[0];
        int result = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int curr = nums[i];
            if (curr < 0) {
                int temp = maxEndingHere;
                maxEndingHere = minEndingHere;
                minEndingHere = temp;
            }
            maxEndingHere = Math.max(curr, maxEndingHere * curr);
            minEndingHere = Math.min(curr, minEndingHere * curr);
            result = Math.max(result, maxEndingHere);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, -2, 4};
        int a = maxProduct(arr);
        System.out.println(a);
    }
}
