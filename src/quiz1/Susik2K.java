package quiz1;

import java.util.Scanner;

/*
문제4) 파일명 : QuSusik2K.java
숫자 n을 입력받아서 아래의 수식을 만족하는 k의 최대값을 구하여 출력하는 프로그램을 작성하시오. 
가령 n이 20 이라면....k의 최대값은 4가 된다. (2*2*2*2 = 16)
 */
public class Susik2K {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("정수n을 입력하세요(0이상의정수):");
		int n = sc.nextInt();
		int k=0;//문제에서 k값
		int result=2;//2를 거듭해서 곱할 변수
		int inc=1;
		
		if(n==0) {
			System.out.println("만족하는 k값 없음");
		}
		if(n==1) {
			System.out.println("공식을 만족하는 k값 : 0");
		}
		//방법1
//		while(result<=n) {
//			result*=2;
//			k++;
//		}
//		System.out.println("공식을 만족하는 k값 :"+k);
		
		//방법2
		for(k=0 ; inc*2<=n ; k++) {
			inc*=2;
		}
		System.out.println("공식을 만족하는 k값:"+k);
	}

}
