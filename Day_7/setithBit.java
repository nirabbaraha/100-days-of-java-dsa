package Day_7;

public class setithBit {
     public static int setIthBit(int a, int i) {
        return a | (1 << i);
    }
    public static void main(String[] args) {
        System.out.println(setIthBit(3, 3));
    }
}
  //here is the set bit