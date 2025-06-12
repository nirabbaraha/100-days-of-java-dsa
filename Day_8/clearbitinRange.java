package Day_8;
public class clearbitinRange {
    public static int clearithBitinRange(int n,int i,int j){
        int a =((~0)<<j+1);
        int b=(1<<i)-1;
        int bitmask=a|b;
        return n&bitmask;
    }
    public static void main(String[] args) {
        System.out.print(clearithBitinRange(3, 2, 1));
    }
}
