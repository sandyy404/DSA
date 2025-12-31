
public class L_1004 {

    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0};
        int k = 2;
        int zeros = 0;
        int maxlen = 0;
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] == 0) {
                zeros++;
            }
            while (zeros > k) {
                if (nums[i] == 0) {
                    zeros--;
                }
                i++;
            }
            maxlen = Math.max(maxlen, j - i + 1);
        }

        System.out.println(maxlen);
    }
}
