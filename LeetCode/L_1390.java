
public class L_1390 {

    public static int divisor(int[] nums) {
        int tosum =0;
        for (int num : nums) {
            int count = 0;
            int sum = 0;
            for (int i = 1; i * i <= num; i++) {
                if (num % i == 0) {
                    int d1 = i;
                    int d2 = num / i;
                    count++;
                    sum +=d1;
                    if(d1!=d2){
                      count++;
                      sum +=d2;
                    }
                    if(count>4) break;
                }
            }
            if(count ==4){
               tosum +=sum;
            }
        }

        return tosum;
    }

    public static void main(String[] args) {
    int [] nums = {21,4,7,8};
    int a = divisor(nums);
    System.out.println(a);
    }
}
