public class GameBoard extends Move {
    public static char[][] createBoard() {
        char[][] board = new char[3][3];        // two-dimensional array with 3 rows and 3 columns
        int count = 1;
        for (int i = 0; i < 3; i++) {           // these two loops go through every place in my 3x3 array
            for (int j = 0; j < 3; j++) {
                // i assign each location in my array a char. I convert the result to a character.
                board[i][j] = (char) (count + '0');     // convert to char
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
            System.out.println("|");        // I put the last line
            if (i < 2) {                    // if we are not on the last row
                System.out.println("-------------");        // prints horizontal lines
            }
        }
    }
}
