package quiz;

import java.util.Scanner;

/*
파일명 : QuUpDownGame.java

게임설명 : 업다운게임을 메소드를 이용해 구현한다.
컴퓨터는 1~100사이의 숫자 하나를 생성한다.
총 시도횟수는 7번을 부여한다.
사용자는 7번의 시도안에 숫자를 맞춰야 한다.
사용자가 숫자를 입력했을때 컴퓨터는 높은지/낮은지 알려준다.
7번안에 맞추면 성공, 맞추지 못하면 실패라고 출력한다.
성공/실패 후 계속 할지를 물어보고 1이면 게임 재시작, 0이면 프로그램을 종료한다.
함수를 사용하여 구현한다.
무한루프에 빠지게 된다면 scan.nextLine()을 활용하여 버퍼에 남아있는 Enter키를 제거해주도록 하자.
 */
public class QuUpDownGame {

	public static void main(String[] args) {
		upDownGame();
	}
	
	static void upDownGame() {
		System.out.println("☆★☆★Game Start!☆★☆★");
		Scanner sc = new Scanner(System.in);
		int num = (int)((Math.random()*100)+1);
		for(int i=1 ; i<=8 ; i++) {
			if(i==8) {
				System.out.printf("정답은 %d이였습니다..\n", num);
				System.out.println("..실패..");
			}
			System.out.print("숫자를 입력하세요:");
			int a = sc.nextInt();
			if(a<num) {
				System.out.println(a+"보다 높은숫자입니다");
			}else if(a>num) {
				System.out.println(a+ "보다 낮은숫자입니다");
			}else{
				System.out.println("정답입니다. 짝짝짝!");
				break;
			}
		}
		reStart();
	}

	static void reStart() {
		Scanner sc = new Scanner(System.in);
		System.out.println("게임을 계속하시려면 '1'  종료하시려면 '0'을 눌러주세요");
		int restart = sc.nextInt();
		if(restart==1) {
			upDownGame();
		}else if(restart==0) {
			return;
		}else {
			System.out.println("잘못입력하셨습니다.");
			reStart();
		}
	}
}


