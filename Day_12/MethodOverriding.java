package Day_12;

public class MethodOverriding {
    public static void main(String[] args) {
        deer diddy=new deer();
        diddy.eats();
    }
}

class Animal{
    void eats(){
        System.out.println("Eats anything");
    }
}
class deer extends Animal{
    void eats(){
        System.out.println("Eats Grasses");
    }
}