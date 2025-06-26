package Day_12;

public class Abstraction {
    public static void main(String[] args) {
        dinoDeer diddy = new dinoDeer();
      
    }
}

abstract class Animal {
    Animal() {
        System.out.println("Constructor of Animal is Called");
    }

    void eats() {
        System.out.println("Eats");
    }

    abstract void walk();
}

class deer extends Animal {
    deer() {
        System.out.println("Constructor of deer is called");
    }

    void walk() {
        System.out.println("Walks with 4 legs");
    }
}

class dinoDeer extends deer {
    dinoDeer() {
        System.out.println("Dino deer Construction is called");
    }

    void walk() {
        System.out.println("Hina Goru");
    }
}
