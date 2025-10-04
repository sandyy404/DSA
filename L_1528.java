
public class L_1528 {

    public static String restoreString(String s, int[] indices) {
       char[] a = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
         a[indices[i]] = s.charAt(i);
        }
        return new String(a);
    }

    public static void main(String[] args) {
        L_1528 l = new L_1528();
        String s = "deepsan";
        int[] indices = {3, 4, 5, 6, 0, 1, 2};
      //   l.restoreString(s, indices);
        System.out.print(l.restoreString(s, indices));
    }
}
                                                                                                