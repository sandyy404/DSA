
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class LIS {
   // public static int fun(int i, int[] arr,int[]dp) {
   // if(i==arr.length)return 0;
   // if(dp[i]!=-1)return dp[i];
   // int mx = 1;
   // for (int j = i - 1; j >= 0; j--) {
   // if (arr[i] > arr[j]) {
   // mx = Math.max(mx, 1 + fun(j, arr,dp));
   // }
   // }
   // return dp[i] = mx;
   // }

   // public static int lower_bound(int val, List<Integer> list) {
   // int i = 0;
   // int j = list.size()-1;
   // int ans = 0;
   // while (i <= j) {
   // int mid = i + (j - i) / 2;
   // if (list.get(mid) >= val) {
   // ans = mid;
   // j = mid - 1;
   // } else {
   // i = mid + 1;
   // }
   // }
   // return ans;
   // }
   public static int lower_bound(int val, List<Integer> list) {
      int i = 0;
      int j = list.size() - 1;

      while (i <= j) {
         int mid = i + (j - i) / 2;
         if (list.get(mid) >= val) {
            j = mid - 1;
         } else {
            i = mid + 1;
         }
      }
      return i;
   }

   public static void main(String[] args) throws IOException {
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      int n = Integer.parseInt(reader.readLine());
      int arr[] = new int[n];
      for (int i = 0; i < n; i++) {
         arr[i] = Integer.parseInt(reader.readLine());
      }
      int[] dp = new int[n + 1];
      Arrays.fill(dp, 1);
      // int max = 0;
      // for (int i = 0; i < n; i++) {
      // max = Math.max(max, fun(i, arr,dp));
      // }
      // System.out.println(max);
      for (int i = 1; i < n; i++) {
         for (int pre = 0; pre < i; pre++) {
            if (arr[i] > arr[pre]) {
               dp[i] = Math.max(dp[i], dp[pre] + 1);
            }
         }
      }
      int max = 0;
      for (int i = 0; i < n; i++) {
         max = Math.max(max, dp[i]);
      }
      System.out.println(max);

      // List<Integer> list = new ArrayList<>();
      // for (int i = 0; i < n; i++) {
      // if (list.isEmpty() || list.get(list.size()-1) < arr[i]) {
      // list.add(arr[i]);
      // } else {
      // int lb = lower_bound(arr[i], list);
      // list.set(lb, arr[i]);
      // }
      // }
      // System.out.println(list.size());

   }
}

// import java.io.BufferedReader;
// import java.io.IOException;
// import java.io.InputStreamReader;
// import java.util.*;

// public class LIS {

// public static int lower_bound(int val, List<Integer> list) {
// int i = 0;
// int j = list.size() - 1;

// while (i <= j) {
// int mid = i + (j - i) / 2;
// if (list.get(mid) >= val) {
// j = mid - 1;
// } else {
// i = mid + 1;
// }
// }
// return i;
// }

// public static void main(String[] args) throws IOException {
// BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
// String firstLine = reader.readLine();
// if (firstLine == null) return;
// int n = Integer.parseInt(firstLine.trim());
// int arr[] = new int[n];
// StringTokenizer tokenizer = null;
// for (int i = 0; i < n; i++) {
// while (tokenizer == null || !tokenizer.hasMoreTokens()) {
// String line = reader.readLine();
// if (line == null) break;
// tokenizer = new StringTokenizer(line);
// }
// arr[i] = Integer.parseInt(tokenizer.nextToken());
// }

// List<Integer> list = new ArrayList<>();
// for (int i = 0; i < n; i++) {
// if (list.isEmpty() || list.get(list.size() - 1) < arr[i]) {
// list.add(arr[i]);
// } else {
// int lb = lower_bound(arr[i], list);
// list.set(lb, arr[i]);
// }
// }
// System.out.println(list.size());
// }
// }
