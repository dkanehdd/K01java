package quiz;

import java.util.Scanner;

public class QuSusik2K {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수n을 입력하세요(0이상의정수):");
		int inputNum = sc.nextInt();
		int k=1;
		while(true) {
			if(inputNum/(int)Math.pow(2,k)==0) {
				System.out.println("공식을 만족하는 k값 : "+ (k-1));
				break;
			}
			k++;
		}
	}
}