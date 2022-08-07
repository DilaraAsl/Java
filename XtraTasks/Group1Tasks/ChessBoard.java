package XtraTasks.Group1Tasks;

import java.util.Arrays;

public class ChessBoard {
    public static void main(String[] args) {
        String[][] chessBoard = new String[8][8];
        printChessBoard(chessBoard);

    }

    public static void printChessBoard(String[][] chessBoard) {
        for (int i = 0; i < chessBoard.length; i++) {
            for (int j = 0; j < chessBoard.length; j++) {
                chessBoard[i][j] = "" + (i + 1) + (char) (j + 97); // Ascii value for lower case a is 97
            }


        }
        System.out.println(Arrays.deepToString(chessBoard));

    }

}



