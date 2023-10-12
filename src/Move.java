import com.sun.tools.javac.Main;

import java.util.Scanner;

public class Move {
    Scanner sc = new Scanner(System.in);
    public static int getPlayerMove(Scanner scanner) {
        char currentPlayer = 'X';
        int move;
        do {
            System.out.println("Player " + currentPlayer + ", choose a place 1-9: ");
            while (!scanner.hasNextInt()) {
                System.out.println("That's not a valid move! Please enter a valid number:");
                scanner.next();  // Discard the invalid input
            }
            move = scanner.nextInt();
        } while (move < 1 || move > 9);
        return move;
    }
}
