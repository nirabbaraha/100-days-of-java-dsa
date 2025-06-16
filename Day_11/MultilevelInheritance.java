package Day_11;

// example of multilevel inheritance

public class MultilevelInheritance {
    public static void main(String[] args) {
        dog doberman= new dog();
        doberman.leg=4;
        System.out.println(doberman.leg);
        doberman.eats();
    }
    
}
// parent class for mammal
class Animal{
    String color;
    void eats(){
        System.out.println("This animal Eats");
    }
    void breaths(){
        System.out.println("this anumal breaths");
    }
}
// child class for Animal but parent class for dog
class mammal extends Animal{
    int leg;
    void reproduction(){
        System.out.println("mammal reproduce");
    }
     
}
//child class for mammal
class dog extends mammal{
    String breed;

}
