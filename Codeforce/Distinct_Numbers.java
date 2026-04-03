


import java.util.*;

public class Distinct_Numbers {

    public static void main(String[] args) {
        Set<Integer> st = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            st.add(a);
        }
        System.out.println(st.size());
    }
}
