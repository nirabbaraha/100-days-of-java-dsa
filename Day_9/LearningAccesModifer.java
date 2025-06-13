package Day_9;

public class LearningAccesModifer {

    public static void main(String[] args) {
        BankAccount myAcc =new BankAccount();
        myAcc.userName="NirabBaraha1@1";
        System.out.println(myAcc.userName); // accessable because it is not protected with any kind of key words
       myAcc.changePass("CYXAAF78a0");
    //    System.out.println(myAcc.userPass); // protected with private access modifer 
    }
}

class BankAccount{
    public String userName; //access even outside the class
    private String userPass; // accessable within the class itself 

    void changePass(String changePass){
        userPass=changePass;
    }
}
