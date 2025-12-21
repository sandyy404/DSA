
import java.util.Arrays;

public class L_39 {
// method 1  something wrong and tc is also high
    //  static String longestCommonPrefix(String[] strs) {
    //      int n = strs.length;
    //      String s = "";
    //      String s1 = strs[0];
    //      for (int i = 1; i < n-1; i++) {
    //          for (int j = 0; j < strs[i].length()-1; j++) {
    //              if (s1.charAt(j) != strs[j].charAt(j)) {
    //                break;
    //              }else{
    //                s += s1.charAt(j);
    //              }
    //          }
    //      }
    //      return s;
    //  }

    // method 2  better approach tc is O(n log n).
    static String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String s1 = strs[0];
        String s2 = strs[strs.length - 1];
        int min = Math.min(s1.length(),s2.length());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < min; i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                break;
            } else {
              sb.append(s1.charAt(i));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String[] strs = {"ab", "a"};
        String s = longestCommonPrefix(strs);
        System.out.println(s);
    }
}
