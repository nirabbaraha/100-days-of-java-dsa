package Day_7;

public class clear_ith_bit {
    public static int clearIthBit(int n, int i) {
        return n & ~(1 << i);
    }
    public static void main(String[] args) {
        System.out.println(clearIthBit(3, 9));
    }
}
