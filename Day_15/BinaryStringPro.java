package Day_15;

public class BinaryStringPro {
    public static void generateBinaryString(int n, String str, int lastPlace) {
        if (n == 0) {
            System.out.println(str);
            return;
        }

    
        generateBinaryString(n - 1, str + "0", 0);

      
        if (lastPlace == 0) {
            generateBinaryString(n - 1, str + "1", 1);
        }
    }

    public static void main(String[] args) {
        int n = 3;  
        generateBinaryString(n, "", 0);
    }
}
