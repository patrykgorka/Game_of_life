package game;

import game.Strategy.SurviveStrategy;

import java.util.Random;

public class Board {

    private Cell[][] board;
    private int length;
    private int width;

    public Board(int length, int width){
        this.length = length;
        this.width = width;

        board = new Cell[length][width];
        initialize(20);

    }

    private void initialize (int propability) {

        Random randomizer = new Random();

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if (randomizer.nextInt(100) <= propability)
                    board[i][j] = new Cell(State.ALIVE);
                else
                    board[i][j] = new Cell((State.DEAD));
            }
        }
    }

    public void draw(){
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                System.out.print(board[i][j].getSymbol());
            }
            System.out.println();
        }
    }

    public void move(SurviveStrategy strategy){
        board = strategy.implement(this);
        draw();
    }

    public Cell[][] getBoard() {
        return board;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }
}