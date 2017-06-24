package game;

import game.Strategy.ConweyStrategy;
import game.Strategy.LabiryntStrategy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Board board = new Board(10,10);
        ConweyStrategy conweyStrategy = new ConweyStrategy();
        LabiryntStrategy labiryntStartaegy = new LabiryntStrategy();

        board.draw();


        Scanner scanner = new Scanner(System.in);
        String readString = scanner.nextLine();
        while(readString!=null) {

            if(readString.isEmpty()){
                board.move(labiryntStartaegy);
            } else {
                break;
            }
            readString = scanner.nextLine();
        }
        scanner.close();
    }
}