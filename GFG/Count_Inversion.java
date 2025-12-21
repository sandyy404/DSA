package GFG;
import java.util.ArrayList;
public class Count_Inversion {
    // Naive approach O(n^2)T.C. and O(1) S.C.
//    static  int countInversion(int[]arr){
//        int count =0;
//        int n = arr.length;
//        for(int i =0; i< n-1;i++){
//            for(int j =i+1;j<n;j++ ){
//                if(arr[i]> arr[j]){
//                    count++;
//                }
//            }
//        }
//        return count;
//    }

    // By using Merge sort Approach O(n log n) T.C. and O(n) S.C.


        static int divide(int[]arr,int s, int e){
            int count =0;
            if(s<e){
                int m = s+ (e-s)/2;
                int invcount= divide(arr,s,m);
                int outcount= divide(arr,m+1,e);
                count = conquer(arr,s,m,e);
                return count+invcount+outcount;
            }
            return 0;
        }
        static int conquer(int[] arr,int s,int m,int e){
            int i =s;
            int j= m+1;
            int count=0;
            ArrayList<Integer> list = new ArrayList<>();
            while(i<=m && j<=e){
                if(arr[i]<=arr[j]){
                    list.add(arr[i]);
                    i++;
                }else{
                    list.add(arr[j]);
                    count+=m-i+1;
                    j++;
                }
            }
            while(j<=e){
                list.add(arr[j]);
                j++;
            }
            while(i<=m){
                list.add(arr[i]);
                i++;
            }
            for(int a =0;a<list.size();a++){
                arr[s+a] = list.get(a);
            }

            return count;
        }
        static int inversionCount(int arr[]) {
            int n = arr.length;
            return divide(arr,0,n-1);

        }


    public static void main(String[] args) {
     int[]arr ={4, 3, 2, 1};
     int a = inversionCount(arr);
        System.out.println(a);
    }
}
