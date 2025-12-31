//Sort an array of 0s, 1s and 2s - Dutch National Flag Problem

public class L_75 {

    public static void main(String[] args) {

        // this is a better approach but not good approach
        //   int[] arr = {0, 1, 2, 0, 1, 2};
        //   int n = arr.length;
        //   int c0 = 0, c1 = 0, c2 = 0;
        //   for (int i = 0; i < n; i++) {
        //       if (arr[i] == 0) {
        //           c0++;
        //       } else if (arr[i] == 1) {
        //           c1++;
        //       } else {
        //           c2++;
        //       }
        //   }
        //   for(int i=0;i<c0;i++){
        //    arr[i]=0;
        //   }
        //   for(int i=c0;i<c0+c1;i++){
        //    arr[i]=1;
        //   }
        //   for(int i=c0+c1;i<n;i++){
        //    arr[i]=2;
        //   }
        //   for(int i:arr){
        //    System.out.print(i+" ");
        //   }

        
        // Dutch National Flag Algorithm
        int[] arr = {0, 1, 2, 0, 1, 2};
        int n = arr.length;
        int lo = 0, mid = 0, hi = n - 1;
        while (mid <= hi) {
            if (arr[mid] == 0) {
                int temp = arr[mid];
                arr[mid] = arr[lo];
                arr[lo] = temp;
                lo++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            } else if (arr[mid] == 2) {
                int temp = arr[mid];
                arr[mid] = arr[hi];
                arr[hi] = temp;
                hi--;
            }
        }
        for (int a : arr) {
            System.out.print(a + " ");
        }
    }
}
