package org.example;

import java.util.Random;

public class Main {
	public static void main(String[] args) {
		// 出力クラス
		Printer printer = new Printer();

		// ランダムオブジェクト
		Random rand = new Random();

		// カードの最小の数字と終わりの数字
		int minNumber = 1;
		int maxNumber = 9;

		// ゲームを繰り返すか
		boolean repeatFlag = true;

		// ゲームを開始する
		printer.printGameTitle();
		while (repeatFlag) {
			// カードにランダムな数値を振る
			int leftCardNumber = rand.nextInt(minNumber, maxNumber + 1);
			int rightCardNumber = rand.nextInt(minNumber, maxNumber + 1);

			// 改行をはさむ
			printer.printMessage("");
			// 問題を表示する
			printer.printQuizTitle();
			// カードを表示する
			printer.printCard(leftCardNumber, "*");

			// HighかLowを入力する
			String highLow = printer.inputHighORLow();

			// 予想があたっているか判定し、結果発表する。		
			printer.printResultTitle();
			// カードを表示する
			printer.printCard(leftCardNumber, rightCardNumber);
			if (leftCardNumber < rightCardNumber && highLow.equals("h")) {
				// Highと予想して、予想があたったとき
				printer.printResultWin();
			} else if (leftCardNumber > rightCardNumber && highLow.equals("l")) {
				// Lowと予想して、予想があたったとき
				printer.printResultWin();
			} else if (leftCardNumber == rightCardNumber) {
				// 引き分けたとき
				printer.printResultDraw();
			} else {
				// 予想が外れるまたは相手と自分のカードの数字が同じとき
				printer.printResultLose();
				repeatFlag = false;
			}

			// 改行をはさむ
			printer.printMessage("");
		}

		// ゲーム終了
		printer.printGameEnd();
	}
}