package com.javaex.problem06;

import java.util.Scanner;

public class FriendApp {

	public static void main(String[] args) {
		Friend[] friendArray = new Friend[3];
		Scanner sc = new Scanner(System.in);
		System.out.println("친구를 3명 등록해 주세요");
		// 친구정보 입력받기
		for (int i = 0; i < friendArray.length; i++) {
			String input = sc.nextLine();
			String[] temp = input.split(" ");
			String inputName = temp[0];
			String inputHp = temp[1];
			String inputSchool = temp[2];

			Friend newFriend = new Friend(inputName, inputHp, inputSchool);
			friendArray[i] = newFriend;

		}
		for (int i = 0; i < friendArray.length; i++) {
			// 친구정보 출력 메소드 호출
			friendArray[i].showInfo();
		}
		sc.close();
	}
}