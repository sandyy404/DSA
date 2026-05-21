
import java.util.ArrayList;

public class MIN_Heap {

    public static void insert(ArrayList<Integer> heap, int val) {
        heap.add(val);
        int idx = heap.size() - 1;
        while (idx > 0 && heap.get((idx - 1) / 2) > heap.get(idx)) {
            int temp = heap.get(idx);
            heap.set(idx, heap.get((idx - 1) / 2));
            heap.set((idx - 1) / 2, temp);
            idx = (idx - 1) / 2;
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        int val[] = {10, 3, 2, 4, 5, 1};
        for (int i = 0; i < val.length; i++) {
            insert(al, val[i]);
            for (int j = 0; j < al.size(); j++) {
                System.out.print(al.get(j) + " ");
            }
            System.out.println();
        }
    }
}
