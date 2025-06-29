package Day_14;

public class PowerofX {
    public static int power(int x,int n){
        if(n==0){
            return 1;
        }
        return x*power(x, n-1);
    }

  

    public static int powerOPtimized(int x,int n){
          //baseCase
          if(n==0){
            return 1;
          }
          //work for even
          int halfpow=powerOPtimized(x, n/2);
          int halfPwSq=halfpow*halfpow;
            // for odd
          if(n%2!=0){
            halfPwSq=x*halfPwSq;
          }
          return halfPwSq;
    }
    public static void main(String[] args) {
        int x=2;
        int n=10;
        System.out.println(power(x, n));
        System.out.println(powerOPtimized(x, n));

    }
}
