
public class L_74 {

    public static void main(String[] args) {
        int[][] mat = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        int target = 3;
        //  System.out.println(mat.length); this will give the  number of rows
        //  System.out.print(mat[0].length);   this will give the  number of columns

        int m = mat.length;
        int n = mat[0].length;
        int start = 0;
        int end = (m * n) - 1;
        int row = 0;
        int col = 0;
        while (start <= end) {
            int mid = start + ((end - start) / 2);
            row = mid / n;
            col = mid % n;
            if (mat[row][col] < target) {
                start = mid + 1;
            } else if (mat[row][col] > target) {
                end = mid - 1;
            } else if (mat[row][col] == target) {
              
                System.out.print( row + " "  + col);
                break;
            }
        }
        // System.out.println(mat[row][col]);
    }
}
