package com.javaproject;

import java.util.Random;

public class SnakeLadder {

	public static void main(String[] args) {
		int position = 0;
Random ran = new Random();
		
		int dice = ran.nextInt(6)+1;
		System.out.println("Dice Outcome : "+dice);

	}

}
