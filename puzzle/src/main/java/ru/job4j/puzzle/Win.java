package ru.job4j.puzzle;

public class Win {
    public static boolean check(int[][] board) {
        for(int i = 0; i < board.length; i++){
            if (checkH(board, i) || checkV(board, i)) {
                return true;
            }
        }
        return  false;
    }

    public static boolean checkH(int[][] board, int h) {
        for(int i = 0; i < board.length; i++){
            if (board[h][i] == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkV(int[][] board, int v) {
        for(int i = 0; i < board.length; i++){
            if (board[i][v] == 0) {
                return false;
            }
        }
        return true;
    }
}
