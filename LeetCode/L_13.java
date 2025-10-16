
import java.util.HashMap;
import java.util.Map;

public class L_13 {

    public static int romanToInt(String s) {
        int total = 0;
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length - 1; i++) {
            int current = arr[i];
            int next = arr[i + 1];
            if (current < next) {
                total = total - current;
            } else {
                total = total + current;
            }
        }
        return total;
    }

    public static void main(String[] args) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        System.out.println(a);
    }
}


