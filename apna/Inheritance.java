package apna;

public class Inheritance {
    public static void main(String[] args) {
        Mamal whale = new Mamal() ;
        whale.eat() ;
        
    }
}

class Animal {
    String color ;

    void eat() {
        System.out.println("Eats");
    }
    void breathe() {
        System.out.println("Can breathe");
    }
}

class Mamal extends Animal {
    int legs ;

    void eat() {
        System.out.println("Can eat human being");
    }
}

//derived class
class Fish extends Animal {
    int fins ;
    
    void swim() {
        System.out.println("Can awim in water");
    }
}

class Bird extends Animal {
    int fly ;
}