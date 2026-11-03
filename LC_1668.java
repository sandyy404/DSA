public class LC_1668 {
    public static  int fun(String s1,String s2,int i,int j,int ans){
        if(i==0)return ans;
        if(s1.charAt(i-1)==s2.charAt(j-1)){
             if(j==1){
                return fun(s1,s2,i-1,s2.length(),ans+1);
             }else{
                return fun(s1,s2,i-1,j-1,ans);
             }
        }
        return fun(s1,s2,i-1,s2.length(),ans);
    }
    public static  int maxRepeating(String sequence, String word) {
        int n = sequence.length();
        int m = word.length();
        return fun(sequence,word,n,m,0);
    }

   public static void main(String[] args) {
      String s1= "baba";
      String s2 = "b";
      System.out.println(maxRepeating(s1,s2));
   }
}
