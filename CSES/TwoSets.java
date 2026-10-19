
import java.util.*;

public class TwoSets {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      long n = sc.nextLong();
      long sum = (n * (n + 1) / 2);
      if (sum % 2 != 0) {
         System.out.println("NO");
      } else {
         System.out.println("YES");
         if (n % 4 == 0) {
            int i = 1;
            List<Integer> set1 = new ArrayList<>();
            List<Integer> set2 = new ArrayList<>();
            while (i <= n) {
               int a = i;
               set1.add(a);
               set1.add(a + 3);
               set2.add(a + 1);
               set2.add(a + 2);
               i = i + 4;
            }
            System.out.println(set1.size());
            StringBuilder sb1 = new StringBuilder();
            for (int val : set1) {
               sb1.append(val).append(" ");
            }
            System.out.println(sb1);
            System.out.println(set2.size());
            StringBuilder sb2 = new StringBuilder();
            for (int val : set2) {
               sb2.append(val).append(" ");
            }
            System.out.println(sb2);
         } else if (n % 4 == 3) {
            List<Integer> set1 = new ArrayList<>();
            List<Integer> set2 = new ArrayList<>();
            set1.add(1);
            set1.add(2);
            set2.add(3);
            int i = 4;
            while (i <= n) {
               int a = i;
               set1.add(a);
               set1.add(a + 3);
               set2.add(a + 1);
               set2.add(a + 2);
               i = i + 4;
            }
            System.out.println(set1.size());
            StringBuilder sb1 = new StringBuilder();
            for (int val : set1) {
               sb1.append(val).append(" ");
            }
            System.out.println(sb1);
            System.out.println(set2.size());
            StringBuilder sb2 = new StringBuilder();
            for (int val : set2) {
               sb2.append(val).append(" ");
            }
            System.out.println(sb2);
         }
      }
   }
}
