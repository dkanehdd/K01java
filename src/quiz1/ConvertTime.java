package quiz1;

import java.util.Scanner;

public class ConvertTime {

	static final int HOUR = 60*60;
	static final int MIN = 60;
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.print("시간으로 변환할 초(second)를 입력하세요:");
		int inputSecond = sc.nextInt();
		convertSecToHMS(inputSecond);
	}

	public static void convertSecToHMS(int sec) {
		int h, m, s;
		
		h=sec/HOUR;
		sec%=HOUR;//시간을 구하고 남은 초를 다시저장
		
		m=sec/MIN;
		sec%=MIN; //분을 구하고 남은 초를 다시 저장
		
		s=sec;
		
		System.out.printf("%d시간 %d분 %d초", h,m,s);
	
	
	}
}
