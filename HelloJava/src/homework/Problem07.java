package homework;


import java.util.Scanner;

/**
 * 
 * @Author : moonjh
 * @Version : 17
 * @Since : 2025. 3. 28.
 * 
 * 숨겨진 숫자 맞추기
 * 1~100 사이의 숫자가 결정.
 * 입력한 숫자가 결정된 숫자보다 높으면 "더 낮게" 출력
 * 입력한 숫자가 결정된 숫자보다 낮으면 "더 높게" 출력
 * 정답을 맞춘 경우 "맞았습니다." 출력
 * 게임을 반복하기 위해 y/n이라 묻고 n인 경우 종료.
 * (y 인 경우 다시 게임이 시작.)
 */
public class Problem07 {

	public static void main(String[] args) {
		// 사용자가 입력한 숫자가 필요하므로
		Scanner sc = new Scanner(System.in);
		
		// y/n 기능
		String q = "y";
		while (q.equals("y")) {
			// 1~100 사이의 숫자가 결정되어야하니,
			int randomNum = (int)(Math.random()*100) + 1;
			System.out.println(randomNum);
			
			// 검사하기 위한 기능
			while (true) {
				String userInput = sc.nextLine();
				
				if(randomNum < Integer.parseInt(userInput)) {
					System.out.println("더 낮게");
				} else if (randomNum > Integer.parseInt(userInput)) {
					System.out.println("더 높게");
				} else if (randomNum == Integer.parseInt(userInput)) {
					System.out.println("정답");
					break;
				}
			}
			System.out.print("y 인 경우 다시 게임이 시작> ");
			q=sc.nextLine();
		}
			
	}
}
