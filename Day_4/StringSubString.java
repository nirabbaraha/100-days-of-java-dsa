package Day_4;

public class StringSubString {
    public static String substringFinder(String str,int si,int ei){
        String subString="";
        for(int i=si;i<ei;i++){
            subString+=str.charAt(i);
        }
        return subString;
    }
    public static void main(String[] args) {
        String str="Hello World";
        int si=0;
        int end=4;
        System.out.println(substringFinder(str, si, end));
    }
    
}
