package boardgame;

/**
 *
 * @author kakah
 */
public class Piece {
    
    protected Position position;
    private Board board;

    //construtor
    public Piece(Board board) {
        this.board = board;
        position = null;
    }
    
    //getters e setters
    protected Board getBoard() {
        return board;
    }
}