package Day_7;
import java.util.*;
public class CheckEvenOdd {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();

        if((n & 1)==0){
            System.out.print("Even number");

        }else{
            System.out.println("Odd number");
        }
        sc.close();
    }    
}
