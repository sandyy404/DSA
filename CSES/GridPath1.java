
import java.util.Scanner;

public class GridPath1 {

   // recursion
   public static int fun(int i, int j, int m, int n, String[][] grid) {
      if (i == m - 1 && j == n - 1)
         return 1;
      if (i >= m || j >= n)
         return 0;
      int right = 0;
      int left = 0;
      if (grid[m - 1][n - 1] == "*")
         return 0;
      if (grid[i][j] == ".") {
         right = fun(i, j + 1, m, n, grid);
         left = fun(i + 1, j, m, n, grid);
      }
      return right + left;
   }

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int r = sc.nextInt();
      String[][] grid = new String[r][r];
      for (int i = 0; i < r; i++) {
         for (int j = 0; j < r; j++) {
            grid[i][j] = sc.next();
         }
      }
      if (r == 1 && r == 1 && grid[r - 1][r - 1] == "*")
         System.out.println(0);
      int path = fun(0,0,r,r,grid);
      System.out.println(path);
   }
}
