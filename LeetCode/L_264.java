public class L_264{
    public static int nthUglyNumber(int n) {
    int counter =1;
      int num = 2;
       if(n == 1){
       return 1;
       }
     else{ while(counter < n){
        if(num/2==0 || num/3==0 || num/5==0){
       counter++;
       num
         
      }
      }
   }
      return;
    }
 public static void main(String[] args) {
   int n = 10;
    nthUglyNumber(n);
 }  
}


