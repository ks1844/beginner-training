package org.example;

import java.util.Scanner;

public class Printer {
	Scanner sc = new Scanner(System.in);

	public void printMessage(String message) {
		System.out.println(message);
	}

	public void printGameTitle() {
		System.out.println("***************");
		System.out.println("*   High&Low  *");
		System.out.println("***************");
	}

	public void printQuizTitle() {
		System.out.println("*  [問題表示] *");
	}

	public void printResultTitle() {
		System.out.println("*  [結果表示] *");
	}

	public void printResultWin() {
		System.out.println("→You Win!");
	}

	public void printResultLose() {
		System.out.println("→You Lose...");
	}

	public void printResultDraw() {
		System.out.println("→Draw...");
	}

	public void printGameEnd() {
		System.out.println("--ゲーム終了--");
	}

	public String inputHighORLow() {
		System.out.print("High or Low?(h/l):");
		String highLow = this.sc.nextLine().toLowerCase();
		if (highLow.equals("h")) {
			System.out.println("→highを選択しました。");
		} else {
			System.out.println("→lowを選択しました。");
			highLow = "l";
		}
		return highLow;
	}

	public void printCard(String leftCardMark, String rightCardMark) {
		System.out.println("*****     *****");
		System.out.println("*   *     *   *");
		System.out.printf("* %s *     * %s *\n", leftCardMark, rightCardMark);
		System.out.println("*   *     *   *");
		System.out.println("*****     *****");
	}

	public void printCard(String leftCardMark, int rightCardNumber) {
		String rightCardMark = Integer.toString(rightCardNumber);
		this.printCard(leftCardMark, rightCardMark);
	}

	public void printCard(int leftCardNumber, String rightCardMark) {
		String leftCardMark = Integer.toString(leftCardNumber);
		this.printCard(leftCardMark, rightCardMark);

	}

	public void printCard(int leftCardNumber, int rightCardNumber) {
		String leftCardMark = Integer.toString(leftCardNumber);
		String rightCardMark = Integer.toString(rightCardNumber);
		this.printCard(leftCardMark, rightCardMark);
	}

}