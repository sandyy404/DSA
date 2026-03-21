package Codeforce;

import java.util.*;

public class Girl_Boy {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      Set<String> st = new HashSet<>();
      String s = sc.nextLine();
         for(int i=0;i<s.length();i++){
             st.add(String.valueOf(s.charAt(i)));
         }
         if(st.size()%2==0){
         System.out.println("CHAT WITH HER!");
      }else{
         System.out.println("IGNORE HIM!");
      }
   }
}
