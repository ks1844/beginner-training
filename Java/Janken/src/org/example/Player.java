package org.example;

public class Player {

	Player() {
	}

	Player(String name) {
		this.name = name.toUpperCase();
	}

	private String name;

	private int numberOfWin = 0;

	private int sign;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name.toUpperCase();
	}

	public int getNumberOfWin() {
		return numberOfWin;
	}

	public void setNumberOfWin(int numberOfWin) {
		this.numberOfWin = numberOfWin;
	}

	public void plusNumberOfWin() {
		this.numberOfWin += 1;
	}

	public int getSign() {
		return this.sign;
	}

	public void setSign(int sign) {
		this.sign = sign;
	}

}