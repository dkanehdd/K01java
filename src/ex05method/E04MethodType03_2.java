package ex05method;
/*연습문제] 사용자로부터 2~9사이의 숫자중 2개를 입력받아
그에 해당하는 구구단을 출력하는 메소드를 작성하시오.
무조건 첫번째 입력받는수가 작아야한다.
입력예]
	첫번째숫자 : 3
	두번째숫자 : 12
	3*1=3 3*2=6........
	........
	...................12*9=108
메소드명 : inputGugudan(int sNum, int eNum)
 */

import java.util.Scanner;

public class E04MethodType03_2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("시작 단을 입력하세요 : ");
		int a = scan.nextInt();
		System.out.print("종료 단을 입력하세요 : " );
		int b = scan.nextInt();
		
		
		inputGugudan(a, b);//3단에서 15단까지...
	}
	static void inputGugudan(int a, int b) {
		for(int sNum = a ; sNum<=b ; sNum++) {
			for(int i = 1 ; i<=9; i++) {
				int re = sNum*i;
				System.out.printf("%2d*%2d=%2d ", sNum ,i,re);
				
			}
			System.out.println();
		}
	}

}
