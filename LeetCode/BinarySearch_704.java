
public class BinarySearch_704 {
     public static void main(String[] args) {
       
      int []arr = {12,34,55,67,88,456,3456,34567};
      int target = 456;
       int start = 0;
    int end = arr.length - 1;
    BinarySearch_704 b = new BinarySearch_704();
      System.out.println(b.binarysearch(arr, target));


    }
    int binarysearch(int[] arr, int target) {
     return binarySearch(arr, target, 0, arr.length-1);
    }
     int binarySearch(int[] arr, int target, int start, int end) {
        if (start > end) {
            return -1;
        }
        int m = start + (end - start) / 2;
        if (arr[m] == target) {
            return m;
        }
        if (arr[m] < target) {
            return binarySearch( arr, target,m+1,end);
        }
        else {
         return binarySearch(arr,  target, start, m-1);
        }

        
    }

}
