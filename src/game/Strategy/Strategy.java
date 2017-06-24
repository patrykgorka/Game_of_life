package game.Strategy;

import game.Board;
import game.Cell;

public interface Strategy {
    public Cell[][] implement(Board board);
    public int countNeighbors(int x, int y, Board board);
}
