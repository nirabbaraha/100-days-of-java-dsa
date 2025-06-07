package Day_4;

public class StringComparision {
    public static void main(String[] args) {
        //string comparision

        String s1="Nirab";
        String s2="Nirab";
        String s3=new String("Nirab");

        if(s1==s2){
            System.out.println("True Equal");
        }
        else{
            System.out.println("Not equal");
        }

        if(s1==s3){
            System.out.println("Equal using ==");
        }
        else{
            System.out.println("Not equal");
        }

        if(s1.equals(s2)){
            System.out.println("True using .equal");
        }
        else{
            System.out.println("Not equal");
        }
    }
    
}
