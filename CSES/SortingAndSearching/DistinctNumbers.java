import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class DistinctNumbers {
   public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      String line = br.readLine();
      if (line == null) return;
      int n = Integer.parseInt(line.trim());
      HashSet<Integer> set = new HashSet<>();
      StringTokenizer st = null;
      for (int i = 0; i < n; i++) {
         while (st == null || !st.hasMoreTokens()) {
            String nextLine = br.readLine();
            if (nextLine == null) {
               break; 
            }
            st = new StringTokenizer(nextLine);
         }
         if (st != null && st.hasMoreTokens()) {
            int x = Integer.parseInt(st.nextToken());
            set.add(x);
         } else {
            break; 
         }
      }
      
      System.out.println(set.size());
   }
}
