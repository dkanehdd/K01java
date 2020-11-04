package quiz;
/*
문제) 파일명 : QuPalindromeStr.java
회문(palindrome)은 순서를 거꾸로 읽어도 제대로 읽은 것과 같은 단어와 문장을 뜻한다.
 예를 들면 "level", "SOS", "rotator"와 같은 단어가 있다. 
 사용자로 부터 입력받은 단어가 회문인지 판단하는 프로그램을 작성하시오.
 */
import java.util.Scanner;

public class QuPalindromeStr {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("회문인지 판단할 단어를 입력해주세요:");
		String str = sc.nextLine();
		char[] arr = str.toCharArray();
		boolean is = true;
		int length = str.length()/2;
		for(int i=0 ; i<length ; i++) {
			if(arr[i]!=arr[str.length()-1-i]) {
				is=false;
			}
		}
		if(is==false) {
			System.out.println("입력하신 단어는 회문이 아닙니다.");
		}
		else
			System.out.println("입력하신 단어는 회문입니다.");
	}
}
