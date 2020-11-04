package ex04controlstatement;
//하나의 문자를 입력받아 숫자인지 여부를 판단하는 프로그램을 삼항연산자를 이용하여 구현하시오.	
//(System.in.read()를 사용하세요)

import java.io.IOException;

public class Qu_04_02 {

	public static void main(String[] args) throws IOException{

		System.out.println("하나의 문자를 입력하세요:");
		int a = System.in.read();

		//String re = (a>=48 && a<=57)? "숫자입니다" : "숫자가 아닙니다" ;
		String re = (a>='0' && a<='9')?"숫자입니다 ":"숫자가 아닙니다.";
		System.out.println(re);
	}

}
