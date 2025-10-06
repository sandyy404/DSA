
public class L_852 {

    public static void main(String[] args) {

        int[] arr = {0, 1, 2, 3, 1};
        int n = arr.length;
        int i =0;
        while(i<n-1){
            if(arr[i+1]<arr[i]){
               System.out.print(i);
               //  break;
            }
            i++;
        }
    }
}
