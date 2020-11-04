package quiz;

import java.util.Scanner;

public class QuConvertTime {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		System.out.print("시간으로 변환할 초(second)를 입력하세요:");
		int inputSecond = sc.nextInt();
		int hour=0, minute=0, second=0;
		hour=inputSecond/3600;
		inputSecond%=3600;
		minute=inputSecond/60;
		inputSecond%=60;
		second = inputSecond;
		System.out.printf("[%d시간 %d분 %d초]",hour, minute, second);
	}
}
