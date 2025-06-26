package Day_12;

public class Interface {
    public static void main(String[] args) {
        queen q= new queen();
        q.moves();
    }
    
}

interface chessPlayer{
    void moves();
}

class queen implements chessPlayer{
    public void moves(){
    System.out.println("Up down left right diagnoals all the direction");
    }
}

class rook implements chessPlayer{
    public void moves(){
    System.out.println("Up down left right");
    }
}

class king implements chessPlayer{
    public void moves(){
    System.out.println("Up down left right diagnoal all one step only");
    }
}
class pawn implements chessPlayer{
    public void moves(){
    System.out.println("One step ahead and diagnol to eat");
    }
}