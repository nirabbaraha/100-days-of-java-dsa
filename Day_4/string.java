package Day_4;

import java.util.Scanner;

public class string {
    public static void printAllString(String str){
        for(int i=0;i<str.length();i++){
            System.out.println(str.charAt(i));
        }
    }
  public static void main(String[] args) {
      //String is the sequence of character . Example "Nirab" "SilentCodeLabs"
Scanner sc=new Scanner(System.in);

     //How String is defined?
    String str="Nirab";
    String str2=new String("Silent Code Labs");

    // Printing the string
    System.out.print(str);
    System.out.println(str2);
    //taking input in strings:

    System.out.print("Enter name:");
    // one line input
    String name= sc.next();
 System.out.println(name);
        //check the length
    String checkLength="String Letter Love";
    int size=checkLength.length();
    System.out.println(size);

    //concatenation 
    String firstName="Nirab";
    String SecondName="Baraha";
    String fullName= firstName+ " "+ SecondName;
    System.out.println(fullName);

    //to check the char present in some position indx we use .charAt(index);
    System.out.println(fullName.charAt(0));
    printAllString(fullName);
    sc.close();
  }
}
