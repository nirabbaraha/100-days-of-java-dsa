package Day_19;

public class SubSet {
    //backTracking
    public static void printSubStrUsingBackTrack(String str, String ans, int i){
        //baseCase
        if(i==str.length()){
            System.out.println(ans);
            return;
        }
        //workflow using recursion

        //if yes then
        printSubStrUsingBackTrack(str, ans+str.charAt(i), i+1);
        //if no then
        printSubStrUsingBackTrack(str, ans, i+1);
    }
    public static void main(String[] args) {
        String str="abc";
        printSubStrUsingBackTrack(str, "", 0);
    }
    
}
