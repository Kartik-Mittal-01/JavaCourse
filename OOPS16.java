
public class OOPS16 {

    interface ChessPlayer {

        void moves();
    }

    static class Queen implements ChessPlayer {

        @Override
        public void moves() {
            System.out.println("left right up down diagonals");
        }
    }

    static class Rook implements ChessPlayer {

        @Override
        public void moves() {
            System.out.println("straight only");
        }
    }

    public static void main(String[] args) {

        // INTERFACE -> BLUEPRINT OF A CLASS 
        /*

        100% ABSTRACTION
        
         */
        Queen q = new Queen();
        q.moves();
        Rook r = new Rook();
        r.moves();
    }
}
