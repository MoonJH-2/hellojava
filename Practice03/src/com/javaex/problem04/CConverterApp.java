package com.javaex.problem04;

public class CConverterApp {

	public static void main(String[] args) {

		double dollar;
		double won;

		CConverter.setRate(1464.7);

		// 백만원을 달러로 출력
		won = 1000000;

		System.out.println(CConverter.toDoller(won));

		// 100달러를 원으로 출력
		dollar = 100;

		System.out.println(CConverter.toKRW(dollar));
	}
}