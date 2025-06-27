package Day_13;

public class RecursionIncreasingOrder {
    public static void printIncreasing(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        printIncreasing(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        int n=10;
        printIncreasing(n);
    }
    
}
