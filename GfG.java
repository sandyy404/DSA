
class GfG {
    
    static String decToBinary(int n) {
        StringBuilder bin = new StringBuilder();

        while (n > 0) {
            int bit = n & 1;
            bin.append(bit);
            n = n >> 1;
        }

        return bin.reverse().toString();
    }
    
    public static void main(String[] args) {
        int n = 12;
        System.out.println(decToBinary(n));
    }
}