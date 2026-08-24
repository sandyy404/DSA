
import java.util.*;

public class TOH {

    public static void moveDisk(int n, List<int[]> moves,int s,int temp, int d) {
        if (n == 1) {
            moves.add(new int[]{s,d});
            return;
        }
        moveDisk(n-1, moves, s, d, temp);
        moves.add(new int[]{s,d});
        moveDisk(n-1, moves, temp, s, d);
    }

    public static void toh(int n) {
        List<int[]> moves = new ArrayList<>();
        int s = 1, temp = 2, d = 3;
        moveDisk(n, moves, s, temp, d);
        System.out.println(moves.size());
        for (int[] move : moves) {
            System.out.println(move[0] + " " + move[1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        toh(n);
    }
}
