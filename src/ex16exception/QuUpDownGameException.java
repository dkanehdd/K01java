package ex16exception;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class QuUpDownGameException {

	public static void upDownGameStart() throws NumberRangeException {
		
		Random random = new Random();
		Scanner scan = new Scanner(System.in);
		int restart;
		boolean forEnd = false;//7번만에 맞추는지 확인하기 위한 변수
		while (true) {			
			int computerNum = random.nextInt(10000) % 100 + 1; // 1~100까지 랜덤으로
			for (int i = 1; i <= 7; i++) {
				System.out.print("1~100까지 숫자입력:");
				int userNum = scan.nextInt();
				// 성공실패
				if(userNum<1||userNum>100) {
					NumberRangeException nre =  new NumberRangeException();
					throw nre;
				}
				
				
				if (userNum > computerNum) {
					System.out.println("Down, 더 낮은 숫자입니다.");
				}
				else if (userNum < computerNum) {
					System.out.println("Up, 더 높은 숫자입니다.");
				}
				else {
					System.out.println("일치합니다.");
					System.out.println(i+"번 안에 성공");
					System.out.println("-----------------------");
					
					forEnd = true;
					break;					 
				}//else(userNum == computerNum)	
			} // 재시작for
			//7번만에 맞추지 못한 경우...
			if(forEnd == false) {
				System.out.println("실패");
			}
			
			
			try {
				while(true) {	
					System.out.println("-----------------------");
					System.out.println("게임재시작(1), 종료(0) ");
					System.out.print("재시작여부를 입력하세요:");
					restart = scan.nextInt();
					// 0,1 이 입력되었을때 탈출
					if(restart==1||restart==0) {
						break;
					}	
					else {
						System.out.println("잘못입력해씸..");						
					}
				} 
				if (restart == 0) {
					return;
				} 
				else if (restart == 1) {
					System.out.println("게임 재시작!");
					
				}
			}
			catch(InputMismatchException e){
				e.printStackTrace();
				System.out.println("");
			}
		 
		}// while end		
	}// gameStart end
	
	public static void main(String[] args) throws NumberRangeException {		
		upDownGameStart();		
	}// main end

}
class NumberRangeException extends Exception{
	public NumberRangeException() {
		super("1~100사이의 숫자가 아닙니다.");
	}
}
