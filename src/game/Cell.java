package game;

public class Cell {

    State state;
    private static char ALIVE = 'x';
    private static char DEAD = ' ';

    public Cell(State state){
        this.state = state;
    }
    public char getSymbol(){
        return state == State.ALIVE ? ALIVE : DEAD;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
