public class L_441{
   public static void main(String[] args) {
      int n = 8;
      int i=1;
      int row =0;
      while(i<=n){
         n = n-i;
         i++;
         row++;
      }
      System.out.println(row);
   }
}