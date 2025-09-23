

public class L_69 {
   public static void main(String[] args) {
      int n = 50;
      L_69 l = new L_69();
      System.out.println(l.Fun(n));
   }
  int  Fun(int n){
     if(n == 1) return n;
     int start = 0;
     int end = n/2;
     while(start <=end){
      int m = start + (end-start)/2;
       int r = m*m;
      if(r==n) return r;
      if (r<n) {
         start = m+1;
      }
      else {
         end = m-1;
      }
     }
     return end;
   }
   
}
