package LeetCode;

public class L_41 {

        public static int firstMissingPositive(int[] nums) {
            int n = nums.length;
            for(int i =0;i<n;i++){
                if(nums[i]<=0 || nums[i]>n){
                    nums[i]= n+1;
                }
            }
            for (int i = 0; i < n; i++) {
                int val = Math.abs(nums[i]);
                if (val >= 1 && val <= n) {
                    int idx = val - 1;
                    if (nums[idx] > 0) {
                        nums[idx] = -nums[idx];
                    }
                }
            }
            for(int i =0; i<n;i++){
                if(nums[i]>0){
                    return i+1;
                }
            }
            return n+1;
        }

    public static void main(String[] args) {
        int []arr = {3,4,-1,1};
        int a = firstMissingPositive(arr);
        System.out.println(a);
    }

}
