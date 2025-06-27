package Day_13;

public class RecursionSumofnnum {
    public static int sumofNnum(int n){
        if(n==1){
            return 1;
        }

        return n+sumofNnum(n-1);
    }
    public static void main(String[] args) {
        int n=5;
       System.out.println(sumofNnum(n));
    }
    
}
