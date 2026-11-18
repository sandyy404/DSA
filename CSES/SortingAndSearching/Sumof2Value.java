package SortingAndSearching;
import java.io.*;
import java.util.*;

public class Sumof2Value {
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

      // first approach (got tle)


      HashMap<Integer, Integer> mp = new HashMap<>();
      int oneidx = -1;
      int Secondidx = -1;
      for (int i = 0; i < n; i++) {
      if (mp.containsKey(x - arr[i])) {
      oneidx = mp.get(x - arr[i])+1;
      Secondidx = i+1;
      break;
      }
      mp.put(arr[i], i);
      }

      // second approach

      // ArrayList<ArrayList<Integer>> list = new ArrayList<>();
      // for (int i = 0; i < n; i++) {
      //    ArrayList<Integer> val = new ArrayList<>();
      //    val.add(arr[i]);
      //    val.add(i);
      //    list.add(val);
      // }
      // list.sort(Comparator.comparingInt(row -> row.get(0)));
      // int i = 0;
      // int j = n - 1;
      // while (i < j) {
      //    if (x == list.get(i).get(0) + list.get(j).get(0)) {
      //       oneidx = list.get(i).get(1) + 1;
      //       Secondidx = list.get(j).get(1) + 1;
      //       break;
      //    }
      //    i++;
      //    j--;
      // }


      
      if (oneidx != Secondidx) {
         System.out.print((Secondidx) + " " + (oneidx));
      } else {
         System.out.println("IMPOSSIBLE");
      }

   }
}
