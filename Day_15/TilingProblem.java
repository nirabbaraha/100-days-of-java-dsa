package Day_15;

public class TilingProblem {
    public static int TilingProblem(int n){
        //baseCase 
        if(n==0||n==1){
            return 1;
        }

        // n-1 give the vertical alignment
        //n-2 give the horizontal alignment
        return TilingProblem(n-1)+ TilingProblem(n-2);
    }
    public static void main(String[] args) {
        System.out.println(TilingProblem(3));
    }
}
