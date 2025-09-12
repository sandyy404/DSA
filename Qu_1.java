import java.util.Scanner;
class Qu_1{
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
      String s =sc.nextLine();
      String reverse = "";
      for(int i =(s.length() - 1);i >=0; i-- ){
         reverse += s.charAt(i);
      }
      System.out.println(reverse);
   }
}