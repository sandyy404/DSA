// method:-1

/* public class Square_root {
   static int squareroot(int n){
       int square = 1;
      for(int i = 1;i<=n/2 ; i++){
       if (i*i <= n) {
         square = i;
         break;
       }
      }
      return square;
   }

   public static void main(String[] args) {
       int n = 239;
       System.out.println(squareroot(n));
   }
} */
// method:-2
public class Square_root {

    static int sqrt(int n) {
         int min = 1, max = n/2, squareroot = 1;
        while (min <= max) {
            int mid = min + ((max - min) / 2);
            if (mid * mid <= n) {
                squareroot = mid;
                min = mid + 1;
            } else {
                max = mid - 1;
            }
        }
        return squareroot;
    }

    public static void main(String[] args) {
        int n = 50;
        System.out.println(sqrt(n));
    }

}
