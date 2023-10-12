import com.sun.tools.javac.Main;

import java.util.Scanner;

public class Move {
    Scanner sc = new Scanner(System.in);
    public static int getPlayerMove(Scanner sc) {
        char currentPlayer = 'X';
        int move;
        do {
            System.out.println("Player " + currentPlayer + ", choose a place 1-9: ");
            while (!sc.hasNextInt()) {
                System.out.println("That's not a valid move! Please enter a valid number:");
                sc.next();         // Discards the invalid input
            }
            move = sc.nextInt();
        } while (move < 1 || move > 9);
        return move;
    }
}
