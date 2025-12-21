

public class L_125 {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        s =s.toLowerCase();
       s=  s.replaceAll("[^A-Za-z0-9]", "");
       System.out.println(s);
       String org_s = s;
       String rev = "";
       int n = s.length();
       for(int i = n -1;i>=0;i--){
           rev += s.charAt(i);
       }if(rev.equals(s)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
    }
}
