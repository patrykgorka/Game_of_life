package game.Strategy;

import game.Board;
import game.Cell;
import game.State;

public abstract class SurviveStrategy implements Strategy {

    @Override
    public Cell[][] implement(Board board) {

        Cell[][] futureBoard = board.getBoard();

        for (int i = 0; i < board.getLength(); i++) {
            for (int j = 0; j < board.getWidth(); j++) {

                int count = countNeighbors(i, j, board);

                if(futureBoard[i][j].getState() == State.ALIVE){
                    boolean kill = decideIfKill(count);
                    if(kill){
                        futureBoard[i][j].setState(State.DEAD);
                    }

                } else {
                    boolean bear = decideIfBear(count);
                    if(bear){
                        futureBoard[i][j].setState(State.ALIVE);
                    }
                }
            }
        }

        return futureBoard;
    }

    public int countNeighbors(int x, int y, Board board) {

        Cell[][] table = board.getBoard();
        int sum = 0;

        if (x < board.getLength() -1  &&
                table[x + 1][y].getState() == State.ALIVE)
            sum++;
        if (x > 0 &&
                table[x - 1][y].getState() == State.ALIVE)
            sum++;
        if (y < board.getWidth() - 1 &&
                table[x][y + 1].getState() == State.ALIVE)
            sum++;
        if (y > 0 &&
                table[x][y - 1].getState() == State.ALIVE)
            sum++;
        if ((x < board.getLength() - 1 && y < board.getWidth() - 1) &&
                table[x + 1][y + 1].getState() == State.ALIVE)
            sum++;
        if ((x > 0 && y > 0) &&
                table[x - 1][y - 1].getState() == State.ALIVE)
            sum++;
        if ((x < board.getLength() - 1 && y > 0) &&
                table[x + 1][y - 1].getState() == State.ALIVE)
            sum++;
        if ((x > 0 && y < board.getWidth() - 1) &&
                table[x - 1][y + 1].getState() == State.ALIVE)
            sum++;

        return sum;
    }

    protected abstract boolean decideIfKill(int count);

    protected abstract boolean decideIfBear(int count);
}