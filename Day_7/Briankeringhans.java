package Day_7;

public class Briankeringhans {
    public static void main(String[] args) {
        int n=3; int count=0;
        while(n>0){
            count++;
            n=n&(n-1);

        }
        System.out.print(count);
    }
    
}
