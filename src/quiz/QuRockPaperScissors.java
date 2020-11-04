package quiz;

import java.util.Scanner;

/*
게임설명 : 가위바위보 게임을 메소드를 통해 구현한다.
난수생성기를 이용하여 1, 2, 3중 하나의 숫자를 생성한다.
사용자가 가위(1),바위(2),보(3) 중 하나를 낸다.
승부를 판단하여 출력한다.
1,2,3 이외의 숫자를 입력하면 잘못된 입력을 알려주고 재입력을 요구한다.
숫자입력을 잘못한 경우는 게임횟수에 포함하지 않는다.
게임은 5번 진행하고 5번째 게임을 끝내면 다시할지 물어본다. 재시작(1), 종료(0)
0, 1 이외의 숫자를 입력하면 재입력을 요구해야 한다.

 */
public class QuRockPaperScissors {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int i=1;
		for(;;) {
			for(; i<=5 ; i++) {
				int com = (int)(Math.random()*100)%3+1;
				System.out.print("무엇을 내겠습니다?(1.가위, 2.바위, 3.보) :");
				int user = sc.nextInt();
				String com1 = null;
				String user1 = null;
				if(com==1) {
					com1 = "가위!";		
				}else if(com==2) {
					com1 = "바위!";
				}else {
					com1 = "보!";
				}
				if(user==1) {
					user1 = "가위!";		
				}else if(user==2) {
					user1 = "바위!";
				}else if(user==3){
					user1 = "보!";
				}else {
					System.out.println("가위바위보 할줄 모름? 제대로 내^^");
					i--;
					continue;
				}
				System.out.printf("사용자:%s 컴퓨터:%s\n",user1,com1);
				if((com==1&&user==1)||(com==2&&user==2)||(com==3&&user==3)) {
					System.out.println("비겼습니다");
				}else if((com==1&&user==2)||(com==2&&user==3)||(com==3&&user==1)) {
					System.out.println("이겼습니다!");
				}else {
					System.out.println("졌습니다ㅠ");
				}
			}
			System.out.println("5번의 게임이 끝났습니다. 게임을 계속하시겠습니까?"
					+ "재시작(1), 종료(0) :");
			int j = sc.nextInt();
			if(j==1) {
				i=1;
				System.out.println("게임 재시작");
				continue;
			}else if(j==0) {
				System.out.println("게임 종료..");
				break;
			}else {
				System.out.println("잘못입력하셨습니다.재시작(1), 종료(0)중에 입력하세요");
			}
		}
	}
}


