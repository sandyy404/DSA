
public class ninty_degree_matrix {

    public static void main(String[] args) {
        int[][] max = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] rotate = new int[max.length][max[0].length];    //max.length ye column ki length dega max[0].length ye ow ki length dega.

        // int rotate.length =. 3;
        for (int i = 0; i < max.length; i++) {
            int j = 0;
            int k = max.length - 1;
            while (j < rotate.length) {
                rotate[j][k - i] = max[i][j++];
            }
        }
        

        for (int i = 0; i < rotate.length; i++) {
            for (int j = 0; j < rotate[0].length; j++) {
                max[i][j] = rotate[i][j];
            }
        }
         for(int [] a : max){
           for(int val :a){
           System.out.print(val + " ");
           }
           System.out.println();
        }
      
    }

}
