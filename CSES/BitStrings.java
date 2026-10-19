
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class BitStrings {
   public static void main(String[] args) {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      try {
         int n = Integer.parseInt(br.readLine());
         long MOD = 1000000007L;
         BigInteger base = BigInteger.valueOf(2);
         BigInteger exponent = BigInteger.valueOf(n);
         BigInteger modulo = BigInteger.valueOf(MOD);
         // Calculates (2^n) % (10^9 + 7) safely
         int num = base.modPow(exponent, modulo).intValue();
         System.out.println(num);
      
      } catch (IOException e) {
         System.out.println("An error occurred while reading input: " + e.getMessage());
      }
   }
}
