package org.example;

public class Main {

	public static void main(String[] args) {
		// マス目の縦・横の長さ
		int boardLength = 3;
		
		// ゲームボードの左上の数字、ゲームボードの作成に必要
		int boardUpperLeftNumber=1;
		
		// ゲームボード
		String[][] board = new String[boardLength][boardLength];
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				// ゲームボードに数字を入れて初期化
				board[i][j] = String.valueOf(i * boardLength + j + boardUpperLeftNumber);
			}
		}

		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				System.out.printf("%s,", board[i][j]);
			}
			System.out.println();
		}

	}

}
