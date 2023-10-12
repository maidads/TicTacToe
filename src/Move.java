import com.sun.tools.javac.Main;

import java.util.Scanner;

public class Move {
    Scanner sc = new Scanner(System.in);
    public static int getPlayerMove(Scanner sc) {
        char nextPlayer = 'X';
        int move;
        do {
            System.out.println("Player " + nextPlayer + ", choose a place 1-9: ");
            while (!sc.hasNextInt()) {
                System.out.println("That's not a valid move! Please enter a valid number:");
                sc.next();         // discards the invalid input
            }
            move = sc.nextInt();
           // nextPlayer = (nextPlayer == 'X') ? 'O' : 'X';
        } while (move < 1 || move > 9);
        return move;
    }


    public static boolean makeMove(char[][] board, int move, char currentPlayer) {
        // converts a one-dimensional index move to a two-dimensional coordinate (row, col)
        int row = (move - 1) / 3;
        int col = (move - 1) % 3;
        if (board[row][col] != 'X' && board[row][col] != 'O') {     // checks if the place is taken
            board[row][col] = currentPlayer;
            return true;
        } else {
            System.out.println("It's already taken! Please choose another place: ");
            return false;       // if it's taken it returns false
        }
    }
}
