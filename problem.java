import java.util.*;
public class problem{

    public static int countIntersectingIntervals(int[][] intervals) {
        int n = intervals.length;
        int intersect=0;
        for(int i=0;i<n-1;i++){
            int start = intervals[i][0];
            int end = intervals[i][1];
           ArrayList<Integer> list = new ArrayList<>();
            for(int j=start;j<=end;j++){
                if(start<=end){
                list.add(start);
                }
                start++;
            }
            for(int a:list){
                System.out.print(a+" ");
            }
            System.out.println();
            for(int k=i+1;k<n;k++){
            if(list.contains(intervals[k][0])||list.contains(intervals[k][1])){
                intersect++;
            }
        }
        }
        return intersect;
    }
   public static void main(String[] args) {
       int arr[][] ={{86,87},{34,90}};
    System.out.println(countIntersectingIntervals(arr));
   }
}