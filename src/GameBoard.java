public class GameBoard {
    public static char[][] createBoard() {
        char[][] board = new char[3][3];        // two-dimensional array with 3 rows and 3 columns
        int count = 1;
        for (int i = 0; i < 3; i++) {           // These two loops go through every place in my 3x3 array
            for (int j = 0; j < 3; j++) {
                // I assign each location in my array a char. I convert the result to a character.
                board[i][j] = (char) (count + '0');
                count++;
            }
        }
        return board;
    }


    public static void printBoard(char[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("| " + board[i][j] + " ");
            }
            System.out.println("|"); // Lägger till den sista vertikala linjen och går till en ny rad
            if (i < 2) { // Om vi inte är på den sista raden
                System.out.println("-------------"); // Skriver ut en rad med horisontella linjer
            }
        }
    }

}
