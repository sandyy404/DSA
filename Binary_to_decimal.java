    // User function Template for Java

    public class Binary_to_decimal {
        static int binaryToDecimal(String b) {
            // Code here
            int num = 0;
            int n = b.length();
            for(int i = 0;i<=n-1;i++){
                char bin = b.charAt(i);

                    num  = num *2 +( (int)bin - 48);
                System.out.println(num);
            }
            return num;
        }

        public static void main(String[] args) {
            String b = "10001000";
            System.out.print(binaryToDecimal(b));
        }
    }

