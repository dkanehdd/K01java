package quiz1;

import java.util.Scanner;
/*
문제1) 파일명 : QuFibonacciSeries.java
인자로 전달된 수만큼 피보나치 수열을 출력하는 메소드를 작성하시오.
피보나치수열은 0, 1 부터 시작한다. 따라서 실행결과는 다음과 같다. 
0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ......

 */
public class FibonacciSeries {

	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.print("출력할 피보나치수열의 항목갯수를 입력하세요:");
		int num = sc.nextInt();
		fibonacciFunc(num);
	}

	public static void fibonacciFunc(int fCount) {
		
		int f1=0, f2=1, f3;
		if(fCount<=1) {
			System.out.println("피보나치 수열은 0,1부터 시작이므로"+
					" 항상 2이상 입력해야 합니다.");
		}
		else {
			//2이상의 숫자라면 먼저 0, 1을 출력한다.
			System.out.printf("%d %d ",f1, f2);
		}
		for(int i=1 ; i<=fCount-2 ; i++) {
			//첫번째수와 두번째수를 더한후 곧바로 출력한다.
			f3 = f1+f2;
			System.out.printf("%d ",f3);
			//f1, f2에 새로운값(다음항목)으로 변경한다.
			f1 = f2;
			f2 = f3;
		}
		
	}
}
