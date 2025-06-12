package Day_7;

public class toggle_ith_bit {
     public static int toggleIthBit(int n, int i) {
        return n ^ (1 << i);
    }
    public static void main(String[] args) {
        System.out.println(toggleIthBit(3, 1));
    }

}
