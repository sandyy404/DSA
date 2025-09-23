public class GCD {
    static int gcd(int a, int b){
        int result = Math.min(a,b);
        while(result >0){
            if (a% result ==0 && b%result ==0){
                break;
            }result--;
//            System.out.print(result + " ");
        }
//        System.out.print(result + " ");
        return result;
    }

    public static void main(String[] args) {
        int a =30,b =56;
        System.out.println(gcd(a,b));
    }


}
