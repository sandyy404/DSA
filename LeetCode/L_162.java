
class L_162 {

    public static int findPeakElement(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (start == mid) {
                if (nums[start] == nums[start + 1]) {
                    return start;
                } else if (nums[start] > nums[start + 1]) {
                    return start;
                } else {
                    return mid;
                }
            } else if (end == mid) {
                return end;
            } else if (nums[mid] == nums[end]) {
                if (nums[mid] < nums[mid - 1]) {
                    return mid - 1;
                } else {
                    return mid;
                }
            } else if (nums[mid] > nums[mid - 1] && nums[mid] > nums[mid + 1]) {
                return mid;
            } else if (nums[mid] > nums[mid - 1] && nums[mid] < nums[mid + 1]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2};
        int i = findPeakElement(arr);
        System.out.println(i);
    }
}
