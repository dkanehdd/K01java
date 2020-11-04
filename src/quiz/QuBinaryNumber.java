package quiz;
/*
문제) 파일명 : QuBinaryNumber.java
10진수를 입력받아서 2진수로 변환해서 출력하는 프로그램을 작성하시오. 
단, 이미 제공되는 변환함수를 사용하지말고 아래 예시에서 주어진데로 프로그램을 작성하고,
 배열(Array)을 활용한다. 
10진수 12 는 2진수 1100으로 변환할 수 있다.
 즉 12을 2로 나눈 나머지를 역순으로 이어붙이면 된다.

 */
import java.util.Scanner;

public class QuBinaryNumber {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("2진수로 변환할 정수를 입력하세요:");
		int num = sc.nextInt();
		int[] bn = new int[100];
		int count = 0;
		for(int i=0 ; i<bn.length ; i++) {
			if(num<2) {
				bn[i]=num;
				break;
			}
			bn[i]=num%2;
			num/=2;
			count++;
		}
		for(int i=count ; i>=0 ; i--) {
			System.out.print(bn[i]);
		}
	}

}
