package Recursion_1;

import java.util.ArrayList;

public class subset {
   public static void set(int[]arr,ArrayList<Integer>al,int i){
      if(i==arr.length){
         System.out.println(al);
         return;
      }
      // include
      al.add(arr[i]);
      set(arr, al, i+1);

      al.remove(al.size() - 1);  //backtrack
      //exclude
      set(arr, al, i+1);
   }
   public static void main(String[] args) {
      int []arr = {1,2,3};
      ArrayList<Integer> al = new ArrayList<>();
      int i=0;
      set(arr, al, i);
   }
}
