import java.util.Arrays;

public class LC_646 {
   public static int findLongestChain(int[][] pairs) {
      Integer[][] obj = java.util.Arrays.stream(pairs).map(row -> Arrays.stream(row).boxed().toArray(Integer[]::new))
            .toArray(Integer[][]::new);
      Arrays.sort(obj, (a, b) -> Integer.compare(a[1], b[1]));
      int n = pairs.length;
      int mcnt = 0;
      for (int i = 0; i < n - 1; i++) {
         int cnt = 0;
         for (int j = i + 1; j < n; j++) {
            if (obj[i][1] < obj[j][0]) {
               cnt++;
               mcnt = Math.max(cnt, mcnt);
            } else {
               cnt = 1;
            }
         }
      }
      if (n == 1)
         return 1;
      return mcnt;
   }
   public static void main(String[] args) {
      int[][] pairs = { { -10, -8 }, { 8, 9 }, { -5, 0 }, { 6, 10 }, { -6, -4 }, { 1, 7 }, { 9, 10 }, { -4, 7 } };
      System.out.println(findLongestChain(pairs));
   }
}