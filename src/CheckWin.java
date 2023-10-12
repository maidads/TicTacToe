public class CheckWin {
    public static boolean checkIfWin(char[][] board) {
        if (checkRows(board) || checkColumns(board) || checkDiagonals(board)) {
                return true;
            }
            return false;
        }


    public static boolean checkRows(char[][] board) {       // checks every row
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == board[i][1] && board[i][1] == board[i][2]) {
                return true;
            }
        }
        return false;
    }

    public static boolean checkColumns(char[][] board) {        // checks every column
        for (int i = 0; i < 3; i++) {
            if (board[0][i] == board[1][i] && board[1][i] == board[2][i]) {
                return true;
            }
        }
        return false;
    }

    public static boolean checkDiagonals(char[][] board) {      // checks every diagonal
        if (board[0][0] == board[1][1] && board[1][1] == board[2][2]) {
            return true;
        } else if (board[0][2] == board[1][1] && board[1][1] == board[2][0]) {
            return true;
        }
        return false;
    }
}
