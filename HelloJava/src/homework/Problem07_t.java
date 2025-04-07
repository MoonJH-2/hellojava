package homework;

import java.util.Scanner;

public class Problem07_t {

	public static void main(String[] args) {
		// 숫자 맞추기 게임 (1~100)
		Scanner sc = new Scanner(System.in);
		String inputNum = "";
		boolean cont = true;
		
		// 게임 진행 여부
		while (cont) {
			// 게임을 운영하기 위한 로직이 필요
			System.out.println("==============");
			System.out.println("[숫자 맞추기 게임]");
			System.out.println("==============");
			int random = (int)(Math.random() * 100) + 1;
			System.out.println(random);

			while (true) {
				System.out.println(">>");
				inputNum = sc.nextLine();
				if(random > Integer.parseInt(inputNum)) {
					System.out.println("더 높게");
				} else if (random < Integer.parseInt(inputNum)) {
					System.out.println("더 낮게");
				} else {
					System.out.println("정답");
					break;
				}
			}
			// 게임 계속 여부 확인을 위한 로직
			System.out.println("게임을 종료 하시겠습니까 (y/n)");
			inputNum = sc.nextLine();
			if ("y".equals(inputNum) || "Y".equals(inputNum)) {
				cont = false;
			} else {
				cont = true;
			}
		}
		System.out.println("==============");
		System.out.println("[숫자 맞추기 게임 종료]");
		System.out.println("==============");
	}
}
