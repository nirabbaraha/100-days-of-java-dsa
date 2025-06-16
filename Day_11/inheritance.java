package Day_11;

public class inheritance{
    public static void main(String[] args) {
        fish shark=new fish();
        shark.eats();
    }
}
//Parent class
class animal{
    String colour;
    void eats(){
        System.out.print("Eats");
    }
    void breaths(){
        System.out.println("breaths");
    }
}
//Childdren Class
class fish extends animal{
int fins;
void swim(){
    System.out.println("Swim in Water");
}
}