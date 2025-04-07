package com.javaex.problem06;

import java.util.Scanner;

public class T_FriendApp {

	public static void main(String[] args) {
		T_Friend[] friendArray = new T_Friend[3];
		Scanner sc = new Scanner(System.in);

		System.out.println("친구를 3명 등록해 주세요");

		for (int i = 0; i < friendArray.length; i++) {
			String temp = sc.nextLine();
			String[] tempArr = temp.split(" ");

			T_Friend f = new T_Friend();
			f.setName(tempArr[0]);
			f.setHp(tempArr[1]);
			f.setSchool(tempArr[2]);

			friendArray[i] = f;
		}

		for (int i = 0; i < friendArray.length; i++) {
			// 친구정보 출력 메소드 호출
			friendArray[i].showInfo();
			
		}
		sc.close();
	}
}