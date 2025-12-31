
public class L_875 {

    public static int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;
        int s = 1;
        int e = 0;
        int ans =0;
        for (int i = 0; i < n; i++) {
            if (piles[i] > e) {
                e = piles[i];
            }
        }
        while(s<=e){
         int m = s+(e-s)/2;
         int time = tfun(m,piles);
         if(time<=h){
            ans = m;
           e = m-1;
         }else{
            s = m+1;
         }
        }
        return ans;
    }
    static int tfun(int mid, int[] piles) {
    int sum = 0;
    for (int i = 0; i < piles.length; i++) {
        sum += piles[i] / mid;
        if (piles[i] % mid != 0) {
            sum++;
        }
    }
    return sum;
}


    public static void main(String[] args) {
        int[] piles = {30,11,23,4,20};
        int h = 5;
        int a = minEatingSpeed(piles, h);
        System.out.println(a);
    }
}
