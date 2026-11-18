package DiwaliBonus;

import java.util.*;

public class P1 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      long[] arr = new long[n];
      for (int i = 0; i < n; i++) {
         arr[i] = sc.nextLong();
      }
      Set<Long> set = new HashSet<>();
      for (int i = 0; i < n; i++) {
         boolean check = false;
         for (int j = 0; j < n; j++) {
            if (i != j && arr[i] % arr[j] == 0 || arr[j] % arr[i] == 0) {
               // set.add(arr[i]);
               // set.add(arr[j]);
            }else{
               check = false;
               break;
            }
         }
         if(check){
           set.add(arr[i]);
         }
      }
      System.out.println(set.size());
      for (long num : set) {
         System.out.print(num + " ");
      }
   }
}
