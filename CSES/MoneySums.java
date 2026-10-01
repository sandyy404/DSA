
import java.util.*;

public class MoneySums {
    public static List<List<Integer>> subset(int[] arr) {
        List<List<Integer>> list = new ArrayList<>();
        back(list, new ArrayList<>(), arr, 0);
        return list;
    }

    public static void back(List<List<Integer>> result, List<Integer> temp, int[] nums, int idx) {
        result.add(new ArrayList<>(temp));
        for (int i = idx; i < nums.length; i++) {
            temp.add(nums[i]);
            back(result, temp, nums, i + 1);
            temp.remove(temp.size() - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        List<List<Integer>> list = subset(arr);
        TreeSet<Integer> set = new TreeSet<>();
        for(int i=0;i<list.size();i++){
            int sum =0;
            for(int j=0;j<list.get(i).size();j++){
                sum+=list.get(i).get(j);
            }
            set.add(sum);
        }
        set.remove(0);
        System.out.println(set.size());
        // Collections.sort(set);
        for(int num:set){
            System.out.print(num +" ");
        }
    }
}
