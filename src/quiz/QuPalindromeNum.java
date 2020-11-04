package quiz;
/*
문제) 파일명 : QuPalindromeNum.java
위 문제는 문자열이 회문인지 판단하는 문제이다. 
이번에는 사용자로 부터 입력받은 정수가 회문수인지 판단하는 프로그램을 작성하시오.  
 */
import java.util.Scanner;

public class QuPalindromeNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("회문인지 판단할 숫자를 입력해주세요:");
		int num = sc.nextInt();
		int pn=0,i=1;
		int num1 = num;
		while(num>(int)Math.pow(10, ++i)) {}
		while(num!=0) {
			int temp = num%10;
			num/=10;
			pn+=temp*(int)Math.pow(10, --i);
		}
		System.out.println("입력한정수를 뒤집어서 만든수:" + pn);
		if(num1==pn) System.out.println("입력하신 숫자는 회문입니다.");
		else System.out.println("입력하신 숫자는 회문이 아닙니다.");
	}
}
