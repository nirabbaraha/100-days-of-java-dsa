package Day_11;
// dummy model of hybridIntehitance 
public class HybridInheritance {
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

class Fish extends Animal{
    int fins;
}

class tuna extends fish{

}
class shark extends fish{

}

class bird extends Animal{
    int feather;
}
class peacock extends bird{

}

class mammal extends Animal{

}
class dog extends mammal{

}