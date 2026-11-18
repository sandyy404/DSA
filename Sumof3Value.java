import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Sumof3Value {
   static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   static StringTokenizer st;

   static String next() throws IOException {
      while (st == null || !st.hasMoreTokens()) {
         String line = br.readLine();
         if (line == null)
            return null;
         st = new StringTokenizer(line);
      }
      return st.nextToken();
   }

   static int nextInt() throws IOException {
      return Integer.parseInt(next());
   }

   public static void main(String[] args) throws IOException {
      int n = nextInt();
      int x = nextInt();
      int[] arr = new int[n];
      for (int i = 0; i < n; i++) {
         arr[i] = nextInt();
      }
      HashMap<Integer, Integer> mp = new HashMap<>();
      int oneidx = -1;
      int Secondidx = -1;
      int tidx = -1;
      for (int j = 0; j < n; j++) {
         for (int i = j + 1; i < n; i++) {
            int sum = arr[i] + arr[j];
            if (mp.containsKey(x - sum)) {
               oneidx = mp.get(x - sum) + 1;
               Secondidx = i + 1;
               tidx = j + 1;
               break;
            }
            mp.put(arr[i], i);
         }
      }
      if (oneidx != Secondidx) {
         System.out.print((tidx) + " " + (oneidx) + " " + (Secondidx));
      } else {
         System.out.println("IMPOSSIBLE");
      }
   }
}
