
public class L_540 {

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 4, 4, 5, 5, 6, 6};
       int start = 0;
       int end = arr.length-1;
       while(start < end){
         int mid = start + (end-start)/2;
         if(mid % 2 !=0){
           mid -=1;
         }
         if(arr[mid] == arr[mid+1]){
            start = mid +2;
         }
         else{
            end = mid;
         }
         if(start == end){
            System.out.print(arr[start]);
         }
       }


    }
}
