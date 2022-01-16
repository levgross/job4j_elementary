package ru.job4j.array;

public class MatrixCheck {
    @SuppressWarnings("checkstyle:WhitespaceAround")
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for (int i = 0; i < board[row].length; i++) {
                if (board[row][i] != 'X') {
                    result = false;
                    break;
                }
        }
        return result;
    }
}
