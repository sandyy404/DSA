package Recursion_1;

public class binary_search {

    public static int binary(int[] arr, int tar, int s, int e) {
        if (s > e) return -1;
        int mid = s + (e - s) / 2;
        if (arr[mid] == tar) {
           return mid;
        }else if(arr[mid]>tar){
            return binary(arr, tar, s, mid-1);
        }
        return binary(arr, tar, mid+1, e);
    }

    public static void main(String[] args) {
        int[] arr = {-1, 0, 3, 5, 9, 12};
        int tar = 9;
        int a = binary(arr, tar, 0, arr.length - 1);
        System.out.println(a);
    }
}
