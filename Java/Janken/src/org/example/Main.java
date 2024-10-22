package org.example;

import static java.util.Map.*;

import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// プレイヤーを作成する
		Player player = new Player();
		Player enemy = new Player("ENEMY");

		Scanner sc = new Scanner(System.in);
		System.out.print("名前を入力してください（アルファベット大文字10文字以下）：");
		player.setName(sc.nextLine());

		// じゃんけんをする
		Map<Integer, String> signsMap = Map.ofEntries(
				entry(0, "グー"),
				entry(1, "チョキ"),
				entry(2, "パー"));
		int gameCount = 3;

		System.out.print("じゃんけんを開始します！！(勝負は%d回）\n".formatted(gameCount));
		signsMap.forEach((key, value) -> {
			System.out.printf("%sなら%d、".formatted(signsMap.get(key), key));
		});
		System.out.println("を入力してください。");
		System.out.println();

		// じゃんけんの勝敗を判定する
		for (int i = 1; i <= gameCount; i++) {
			System.out.printf("%d回戦！！\n".formatted(i));
			System.out.print("最初はグー、じゃんけん！：");
			player.setSign(sc.nextInt());
			Random rand = new Random();
			enemy.setSign(rand.nextInt(3));
			System.out.printf("%s:%s\n".formatted(player.getName(), signsMap.get(player.getSign())));
			System.out.printf("%s:%s\n".formatted(enemy.getName(), signsMap.get(enemy.getSign())));
			
			selectWinnerOfJanken(player,enemy);
		}

		// 勝ち数から勝敗を判定する
		selectWinner(player, enemy);

	}
	public static void selectWinnerOfJanken(Player player,Player enemy) {


			int judgeNumber = (player.getSign() - enemy.getSign() + 3) % 3;
			if (judgeNumber == 1) {
				System.out.println("負けました。。。");
				enemy.plusNumberOfWin();
			} else if (judgeNumber == 2) {
				System.out.println("勝ちました！！！");
				player.plusNumberOfWin();
			} else {
				System.out.println("あいこです。");
			}
			System.out.println();
		
	}
	
	public static void selectWinner(Player player,Player enemy) {
		System.out.printf("%d対%dで、、、".formatted(player.getNumberOfWin(), enemy.getNumberOfWin()));
		if (player.getNumberOfWin() > enemy.getNumberOfWin()) {
			System.out.printf("%sの勝ちです！！".formatted(player.getName()));
		} else if (player.getNumberOfWin() < enemy.getNumberOfWin()) {
			System.out.println("負けちゃいました。。");
		} else {
			System.out.println("引き分けです。");
		}
	}

}