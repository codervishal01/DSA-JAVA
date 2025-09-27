public class Interface {
    public static void main(String args[]){

    }
}

interface ChessPlayer {
    void moves();
}

class Queen implements ChessPlayer{
    public void moves(){
        System.out.println("up,down ,left,diagonal(in all direction)");
    }
}

class Rook implements ChessPlayer {
    public void moves(){
        System.out.println("up,down,left,right");
    }
}