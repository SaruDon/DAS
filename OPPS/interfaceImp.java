public class interfaceImp {
    public static void main(String[] args) {
        Queen q = new Queen();
        q.moves();
        Rook elephant = new Rook();
        elephant.moves();
    }
}

interface Chessplayer{
    void moves();
}

class Queen implements Chessplayer{
    @Override
    public void moves() {
        System.out.println("Moves: up, down, left ,right, diagonally in all directions ");
    }
}

class Rook implements Chessplayer{
    @Override
    public void moves() {
        System.out.println("Moves: up, down, left ,right");
    }
}