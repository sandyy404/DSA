
public class Bubble_Sorting {
   void bubble_sort(){
      int[]arr = {1,4,2,7,3};
    int  n  = arr.length;
      for(int  i = 0; i<n;i++){
         for(int j = 0; j<n-1;j++){
            if(arr[j]>arr[j+1]){
             int temp = arr[j];
               arr[j] = arr[j+1];
               arr[j+1] = temp;
            }
         }
      }
      // System.out.println(Arrays.toString(arr));

   for(int a: arr){
  System.out.print(a + ",");
   }
   }
   public static void main(String[] args) {
      Bubble_Sorting s = new Bubble_Sorting();
      s.bubble_sort();

   }
}


// Now find the number of operation.



