package ex16exception;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

//숫자입력범위가 잘못되었을때 사용되는 예외클래스
class WrongNumberException extends Exception{
	public WrongNumberException() {
		super("[예외발생] 1~3사이의 숫자를 입력하세요.");
	}
}

public class QuRockPaperScissorsException {

	public static void rpsGameStart()  {
		
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		int gameCount = 0; //게임 카운트용 변수
		
		while(true) {
			int com = random.nextInt(1000)%3+1;//1~3사이의 난수
			int user=readUser();
			if(user==0) {
				continue;
			}
			
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
			int restart=0;
			if(gameCount>=5) {
				try {
					System.out.println("게임 재시작(1), 종료(0)");
					restart = sc.nextInt();
					if(restart!=1&&restart!=0) {
						WrongNumberException wr = new 	WrongNumberException();
						throw wr;
					}
				}
				catch (InputMismatchException e) {
					e.printStackTrace();
				}
				catch(WrongNumberException e) {
					e.printStackTrace();
				}
				if(restart==0) {
					break;//처음 while문을 탈출
				}
				else{
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
	public static int readUser(){
		Scanner sc = new Scanner(System.in);
		int user=0;
		try {
			System.out.print("무엇을 내겠습니다?(1.가위, 2.바위, 3.보) :");
			user = sc.nextInt();
			if(user<1||user>3) {
				WrongNumberException wr = new WrongNumberException();
				throw wr;
			}
		}
		catch(InputMismatchException e){
			System.out.println("숫자를 입력하세요!");
			sc.nextLine(); //버퍼에 남은 엔터키제거
		}
		catch(WrongNumberException e) {
			e.printStackTrace();
		}
		return user;
	}
	public static void main(String[] args) {
		rpsGameStart();
	}
	
}
