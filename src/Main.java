import java.util.Scanner;

public class Main extends GameBoard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the game called TicTacToe!!");
        char[][] board = createBoard();     // creates and fills the board
    }
}