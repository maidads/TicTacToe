import java.util.Scanner;

public class Main extends GameBoard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the game called TicTacToe!!");

        char[][] board = createBoard();     // creates and fills the board
        printBoard(board);                  // prints it

        int moveCount = 0;
        char currentPlayer = 'X';

        for (int i = 0; i < 9; i++) {
            boolean moveMade = false;
            while (!moveMade) {
                int move = getPlayerMove(sc);
                sc.nextLine();
                moveMade = Move.makeMove(board, move, currentPlayer);
                printBoard(board);
                moveCount++;            // ++ för every move

                if (moveCount == 9) {
                    System.out.println("It's a draw!");
                    break;
                }
            }
            currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
        }
        System.out.println("Thanky for playing my game! ");
        System.out.println("Do you want to play again? Type 'Yes' or 'No': ");
    }
}