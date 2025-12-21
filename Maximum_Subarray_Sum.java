public class Maximum_Subarray_Sum {
    public static int maxsubarraysum(int []arr){
        int n = arr.length;
        int res = arr[0];
        for(int i =0;i<n;i++){
            int maxsum = 0;
            for(int j=i;j<n;j++){
                maxsum += arr[j];
                res = Math.max(res,maxsum);
            }

        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {2, 3, -8, 7, -1, 2, 3};
        System.out.println(maxsubarraysum(arr));
    }
}

// Another way kadane's algorithm;

//class Solution {
//    int maxSubarraySum(int[] arr) {
//        // Code here
//        int n = arr.length;
//        int cs = 0;
//        int ms = Integer.MIN_VALUE;
//        for(int i = 0;i<n;i++){
//            cs += arr[i];
//            ms = Math.max(cs,ms);
//            if(cs<0){
//                cs = 0;
//            }
//        }
//        return ms;
//    }
//}
