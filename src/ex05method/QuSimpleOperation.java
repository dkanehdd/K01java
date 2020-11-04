package ex05method;
/*
두개의 정수를 입력받아서 사칙연산의 결과를 출력하는 메소드와 main메소드를 작성해보자.
 단 나눗셈은 몫과 나머지를 각각 출력해야 한다.
파라메타로 전달되는 두 숫자는 모두 0 이상의 양의 정수이다.

 */
import java.util.Scanner;

public class QuSimpleOperation {

	static void arithmetic(int a, int b) {
		System.out.println("덧셈결과 ->"+(a+b));
		System.out.println("뺄셈결과 ->"+(a-b));
		System.out.println("곱셈결과 ->"+(a*b));
		System.out.println("나눗셈 몫 ->"+(a/b));
		//%기호를 콘솔에 출력하기위해 이스케이프 시퀀스 사용함
		System.out.println("나눗셈 나머지 ->"+(a%b));
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print(" ");
		int i = scan.nextInt();
		System.out.print(" ");
		int j = scan.nextInt();
		
		arithmetic(i,j);

	}

}
