package apna;

public class Abstract {
    public static void main(String[] args) {
        Horse h = new Horse() ;
        h.eat(); 
        h.walk() ;
        System.out.println(h.color);

        Chicken ch = new Chicken() ;
        ch.eat(); 
        ch.walk(); 

    }
}

abstract class Animal {
    String color ;

    Animal() {
        System.out.println("Constructor created");
        color = "Brown" ;
    }
    
    void eat() {
        System.out.println("Animal eats");
    }

    abstract void walk() ;
}

class Horse extends Animal {
    
    void changeColor() {
        color = "Dark Brown" ;
    }
    
    void walk() {
        System.out.println("Can walk on 4 legs");
    }
}

class Chicken extends Animal {
    
    void changeColor() {
        color = "Yellow" ;
    }

    void walk() {
        System.out.println("Can walk on 2 legs ");
    }
}
