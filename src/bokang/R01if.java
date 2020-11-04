package bokang;

import java.util.Scanner;

public class R01if {

	public static void main(String[] args) {
		
		int jumsu = 85;
		if(jumsu>=90) {
			System.out.println("A학점");
		}
		else if(jumsu>=80) {
			System.out.println("B학점");
		}
		else {
			System.out.println("F학점");
		}
		/*
		시나리오] 월에 해당하는 1~12까지의 숫자를 입력받아서
			봄(3~5), 여름(6~9), 가을(10~11), 겨울(12~2)인지 판단하는 
			switch~case문을	작성해보시오.
		 */
		Scanner sc= new Scanner(System.in);
		System.out.print("1~12사이의 정수를 입력하세요:");
		int month = sc.nextInt();
		switch(month) {
		case 3: case 4: case 5: //if문의 or조건같은 형식
			System.out.println("3~5월은 봄입니다");
			break;
		case 6: case 7: case 8:case 9: //if문의 or조건같은 형식
			System.out.println("6~9월은 여름입니다");
			break;
		case 10: case 11:
			System.out.println("10~11월은 가을입니다");
			break;
		case 12: case 1:case 2:
			System.out.println("12~2월은 겨울입니다");
		}
	
	}

}
