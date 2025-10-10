public class toggle_in_string {
   public static String toggleChar(String str){
      String result = "";
      String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
      String lower = "abcdefghijklmnopqrstuvwxyz";
      for(int i = 0; i<str.length();i++){
         char ch = str.charAt(i);
         if(upper.indexOf(ch)!=-1){
            result +=lower.charAt(upper.indexOf(ch));
         }else{
            result += upper.charAt(lower.indexOf(ch));
         }
      }
      return result;
   }
   public static void main(String[] args) {
      String str = "SaNdeeP";
      String toggle = toggleChar(str);
      System.out.print(toggle);
   }
}

        
       
  