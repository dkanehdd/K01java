package quiz;

import java.util.Random;
import java.util.Scanner;

/*
게임설명 : 야구게임을 메소드를 이용하여 구현한다.
중복되지 않는 3개의 정수를 생성한다.(1~9)
사용자는 3개의 숫자를 입력한다.
생성된 3개의 숫자를 맞추는데 위치까지 정확히 맞춰야 한다.
숫자와 숫자의 위치까지 일치하면 strike 로 판정한다.
숫자는 맞지만 위치가 틀렸다면 ball 로 판정한다.
숫자3개가 모두 일치하지 않으면  out 으로 판정한다.
3 strike 가 되면 게임은 종 료된다.
시도한 횟수를 표시한다.
계속할지 종료할지 여부를 물어보고 다음 진행을 한다.

위 문제의 변수들을 배열을 이용하여 구현해본다.
   int com1, com2, com3; -> int[] com = new int[3];
   int user1, user2, user3; -> int[] user = new int[3]; 
3개의 난수를 생성하는 부분과 스트라이크, 볼을 판정하는 부분은 배열을 이용한 로직으로 변경해야 한다.
 */

public class QuBaseballGame {

	public static void gameStart() {
		
		int[] com = new int[3];
		Random rd = new Random(); 
		int count=0, strike=0, ball=0;
		
		for(int i=0 ; i<com.length ; i++) {
			com[i]= rd.nextInt(8)+1;
			for(int j =0 ; j<i ; j++) {
				if(com[i]==com[j]) {
					i--;
				}
			}
		}
		for(;;) {
			int[] user = readNum();
			
			for(int i=0 ; i<user.length ; i++) {
				for(int j=0 ; j<com.length;j++) {
					if(user[i]==com[j]&&i!=j) {
						ball++;
					}else if(user[i]==com[j]&&i==j) {
						strike++;
					}
				}
			}
			count++;
			if(strike==0&&ball==0) {
				System.out.println("아웃!");
			}else if(strike==3){
				System.out.printf("%d회만에 성공!",count);
				count=0;
				restart();
				break;
			}else {
				System.out.printf("%d스트라이크, %d볼\n",strike, ball);
				strike=0; 
				ball=0;
			}
		}//end of for
	}//end of gameStart 
	static void restart() {
		Scanner sc = new Scanner(System.in);
		System.out.println("계속하려면 (1), 종료하려면 (0)을 입력하세요");
		int num = sc.nextInt();
		if(num==1) {
			gameStart();
		}else if(num==0) {
			return;
		}else {
			System.out.println("잘못입력하셨습니다. 다시입력하세요");
			restart();
		}
	}
	static int[] readNum() {
		int[] user = new int[3];
		System.out.println("1~9사이의 숫자를 입력하세요:");
		for(int i=0 ; i<user.length ; i++) {
			Scanner sc = new Scanner(System.in);
			user[i]=sc.nextInt();
			if(user[i]<1||user[i]>9) {
				System.out.println("잘못입력하셨습니다 다시입력하세요");
				i--;
			}
		}
		return user;
	}
	public static void main(String[] args) {

		gameStart();
	}

}
