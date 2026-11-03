import java.util.Scanner;

public class first {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int t = sc.nextInt();
      while (t-- > 0) {
         int n = sc.nextInt();
         int m = sc.nextInt();
         String p = sc.next();
         String q = sc.next();
         if (n != m + 3) {
            System.out.println("No");
            continue;
         }
         int[] freq = new int[26];
         for (int i = 0; i < p.length(); i++) {
            freq[p.charAt(i) - 'a']++;
         }
         for (int i = 0; i < q.length(); i++) {
            freq[q.charAt(i) - 'a']--;
         }
         freq['s' - 'a']--;
         freq['i' - 'a']--;
         freq['x' - 'a']--;
         boolean possible = true;
         for (int count : freq) {
            if (count != 0) {
               possible = false;
               break;
            }
         }
         if (possible) {
            System.out.println("YES");
         } else {
            System.out.println("NO");
         }
      }
      sc.close();
   }
}
