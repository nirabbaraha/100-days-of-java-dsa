package Day_4;

public class StringPalindrome {
    public static boolean isPalindrome(String str){
        int n=str.length();
        for(int i=0;i<n/2;i++)
        {
                    if(str.charAt(i)!=str.charAt(n-1-i))
                    {
                        return false;
                    }
        }
            return true;
    }
    public static void main(String[] args) {
        String str="racecar";
        String str1="Nirab";
        System.out.println(isPalindrome(str));
        System.out.println(isPalindrome(str1));

    }
}
