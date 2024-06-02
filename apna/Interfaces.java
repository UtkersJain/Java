package apna;

public class Interfaces {
    public static void main(String[] args) {
        // Queen q = new Queen() ;
        // q.moves();

        //Multiple Inheritance
        Beer b = new Beer() ;
        b.eat(); 
    }
}

interface ChessPlayer {
    void moves() ;
}

class Queen implements ChessPlayer {
    public void moves() {
        System.out.println("Up,Down,Left,Right") ;

    }
}

class Rook implements ChessPlayer {
    public void moves() {
        System.out.println("Up,Down,Left,Right,Diagonal (by 1 step)");
    }
}


// Multiple Inheritance
interface Herbivore {
    void eat() ;
}

interface Carnivore {
    void eat() ;
}

class Beer implements Herbivore, Carnivore {
    public void eat() {
        System.out.println("Eat veg and non-veg");
    }
}

