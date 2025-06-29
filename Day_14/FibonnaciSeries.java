package Day_14;
public class FibonnaciSeries {
    public static int fiboNacci(int n){
        if (n==0||n==1){
            return 1;
        }
        return fiboNacci(n-1)+fiboNacci(n-2);
    }
    public static void main(String[] args) {
        
System.out.println(fiboNacci(24));
    }
}
