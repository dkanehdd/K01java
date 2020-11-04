package quiz;

import java.util.Random;
import java.util.Scanner;

public class RockScissorsGame {

	public static void rpsGameStart() {
		
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		int gameCount = 0; //게임 카운트용 변수
		
		while(true) {
			//1.난수생성 - 컴퓨터입장에서 가위/바위/보 
			int com = random.nextInt(1000)%3+1;//1~3사이의 난수
			
			//2.사용자입력
			int user = 0;
			System.out.print("무엇을 내겠습니다?(1.가위, 2.바위, 3.보) :");
			user = sc.nextInt();
			
			//3.승부판단
			//사용자가 정상적으로 입력한경우
			if(!(user<1||user>3)) {
			
				//가위바위보 출력용 함수를 이용해서 정보출력
				System.out.printf("사용자:%s, 컴퓨터:%s\n", 
						displayRPS(user), displayRPS(com));
				switch(user-com) {
				case 0:
					System.out.println("비겼습니다.");break;
				case 1: case -2:
					System.out.println("이겼습니다.");break;
				case 2: case -1:
					System.out.println("졌습니다.");break;
				}
				gameCount++;//게임카운트 증가
			}
			else {
				System.out.println("잘못 입력하였습니다. 다시입력하세요 ");
			}
			
			int restart;
			if(gameCount>=5) {
				while(true) {
				System.out.println("게임 재시작(1), 종료(0)");
				restart = sc.nextInt();
				if(restart==0||restart==1) {
					//정상입력이면 루프탈출
					break;
				}
				else {
					System.out.println("잘못 입력하셨습니다. 재시작(1), 종료(0)"
							+ "를 입력하세요");
				}
				}
				if(restart==0) {
					//게임 종료
					break;//처음 while문을 탈출
				}
				else{
					//게임 재시작
					gameCount=0;//게임카운트 0으로 초기화
					System.out.println("게임을 재시작합니다.");
				}
			}
		}//// end of while
	}///end of rpsGameStart()
	public static String displayRPS(int n) {
		String str = "";
		switch(n) {
		case 1: str = "가위";break;
		case 2: str = "바위";break;
		case 3: str = "보";break;
		}
		return str;
	}
	public static void main(String[] args) {

		rpsGameStart();
	}

}
