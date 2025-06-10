package Day_7;

public class getithBit {
    public static void main(String[] args) {
        int n=3,i=1;
        int bit = (n >> i) & 1;
        System.out.println("The " + i + "-th bit of " + n + " is: " + bit);
    }
    
}
