
import java.util.ArrayList;
import java.util.List;

public class L_54 {

    public static List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> arr = new ArrayList<>();
        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;
        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) {
               arr.add(matrix[top][i]); 
            }
            top++;
            for (int j = top; j <= bottom; j++) {
               arr.add(matrix[j][right]);
            }
            right--;
            if(top<=bottom){
            for (int k = right; k >= left; k--) {
               arr.add(matrix[bottom][k]); 
            }
         }
            bottom--;
            if(left<=right){
            for (int l = bottom; l >= top; l--) {
               arr.add(matrix[l][left]); 
            }
         }
            left++;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[][] mat = {{1, 2, 3,4}, { 5, 6,7,8},  {9,10,11,12}};

        System.out.print(spiralOrder(mat));

    }

}
