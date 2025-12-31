
public class L_1011 {

    public static int shipWithinDays(int[] weights, int days) {
        int n = weights.length;
        int day = 1;
        int wg = 1;

        int max = 0;
        for (int i = 0; i < n; i++) {
            max += weights[i];
        }
        for (int i = 0; i < n; i++) {
            if (weights[i] > wg) {
                wg = weights[i];
            }
        }
  /*      while (wg < max) {
            int requiredDays = 1;
            int load = 0;
            for (int i = 0; i < n; i++) {
                if (load + weights[i] <= wg) {
                    load += weights[i];
                } else {
                    requiredDays++;
                    load = weights[i];
                }
            }

            if (requiredDays <= days) {
                return wg;
            }

            wg++; 
        }

        return wg;
    
        */

   while(wg<max){
      int mid = wg+(max-wg)/2;
      int requiredDays = 1;
            int load = 0;
             for (int i = 0; i < n; i++) {
                if (load + weights[i] <= mid) {
                    load += weights[i];
                } else {
                    requiredDays++;
                    load = weights[i];
                }
            }
            if(requiredDays>days){
               wg = mid+1;
            }else{
               max = mid;
            }
   }
return wg;

    }
    public static void main(String[] args) {
        int[] weights = {3, 2, 2, 4, 1, 4};
        int days = 3;
        int a = shipWithinDays(weights, days);
        System.out.println(a);
    }
}
