// COdechef 838 array
public class MIN_To_MAX {

    public static void main(String[] args) {
        int[] arr = {12, 45, 0, 3, -2, 46, 8};
        int Min = arr[0];
        int count=0;
        for (int index = 1; index < arr.length; index++) {
            if (arr[index] <= Min) {
                Min = arr[index];
                // System.out.println(index);
            }
        
        }
        for (int index = 0; index < arr.length; index++) {
        if(arr[index]>Min){
                // Min = arr[index];
                count++;
            }
        }
        System.out.println(count);

    }

}
