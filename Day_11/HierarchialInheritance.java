package Day_11;
//Hirearchial level interitance
public class HierarchialInheritance {
    public static void main(String[] args) {
        

    }
    
}

class Animal{
    String color;
    void eats(){
        System.out.println("Eats");
    }
    void breath(){
        System.out.println("Breaths");
    }
}

class mammal extends Animal{
    String hair;
    void birth(){
        System.out.println("Give Direct birth");
    }
}

class fish extends Animal{
    int fins;
    void swims(){
        System.out.print("Swims in water");
    }
}

class dog extends Animal{
    int legs;
    void breed(){
        System.out.println("breed");
    }
}
