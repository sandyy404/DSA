package Sorting;

import java.util.ArrayList;

public class Merge {
//    public static void conquer(int[] arr, int start, int end, int mid) {
//        int n1 = mid - start + 1;
//        int n2 = end - mid;
//        int[] L = new int[n1];
//        int[] R = new int[n2];
//        for (int i = 0; i < n1; i++) {
//            L[i] = arr[start + i];
//        }
//        for (int j = 0; j < n2; j++) {
//            R[j] = arr[mid + 1 + j];
//        }
//        int i = 0, j = 0;
//        int k = start;
//        while (i < n1 && j < n2) {
//            if (L[i] <= R[j]) {
//                arr[k] = L[i++];
//            } else {
//                arr[k] = R[j++];
//            }
//            k++;
//        }
//        // Copy remaining elements of L[] if any
//        while (i < n1) {
//            arr[k++] = L[i++];
//
//
//        }
//        // Copy remaining elements of R[] if any
//        while (j < n2) {
//            arr[k++] = R[j++];
//
//
//        }
//    }

    public static void conquer(int []arr,int s,int m,int e){
        ArrayList<Integer> list = new ArrayList<>();
        int i = s;
        int j = m+1;
        while(i<=m && j<=e){
            if(arr[i]>= arr[j]){
                list.add(arr[j]);
                j++;
            }else{
                list.add(arr[i]);
                i++;
            }
        }
        while(i<=m){
            list.add(arr[i]);
            i++;
        }
        while(j<=e){
            list.add(arr[j]);
            j++;
        }
        for(int idx = 0; idx<list.size();idx++){
            arr[idx+s] = list.get(idx);
        }

    }
    public static void devide(int[] arr, int start, int end) {
        if (start < end) {
            int mid = start + (end - start) / 2;
            devide(arr, start, mid);    // for first half array
            devide(arr, mid + 1, end);         //for second half array.
            conquer(arr, start, mid, end);     // for merge the sorted half;
        }

    }

    public static void main(String[] args) {
        int[] arr = {38, 27, 43, 10,18,89,0};
        int n = arr.length;
        devide(arr, 0, n - 1);
        for (int i = 0; i < n; ++i) {
            System.out.print(arr[i] + " ");
        }

    }
}
