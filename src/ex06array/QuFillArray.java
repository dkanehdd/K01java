package ex06array;

import java.util.Scanner;
/*
파일명 : QuFillArray.java
길이가 10인 배열을 선언한후 총 10개의 정수를 입력받아 순서대로 저장한다. (첫번째배열)
그리고 순서대로 저장된 숫자들을 홀수는 배열의 앞에서부터 채워나가고 짝수는 배열의 끝에서부터 
채워나간다.(두번째배열)
 */
public class QuFillArray {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int[] num = new int[10];//입력받은 정수를 순서대로 입력
		int[] ju = new int[10];//홀/짝 구분해서 입력
		//※ju배열의 첫번째 인덱스 저장(홀수) 마지막 인덱스 저장(짝수)
		int indexStart =0, intdexEnd = ju.length-1;
		for(int i=0 ; i<num.length ; i++) {
			System.out.printf("%d번째 정수를 입력하세요:", i+1);
			int inputNum = scan.nextInt();
			//첫번째 배열에는 입력한 순서대로 채워준다.
			num[i]=inputNum;
			if(num[i]%2==1) {
				//입력받은 숫자가 홀수이면 앞에서부터 채우고 인덱스 +1증가
				ju[indexStart++]=num[i];
			}else if(num[i]%2==0) {
				//입력받은 숫자가 짝수이면 뒤에서부터 채우고 인덱스 -1감소
				ju[intdexEnd--]=num[i];
			}
		}
		
		//두개의 배열을 출력하기
		System.out.println("순서대로 입력된결과");
		for(int i=0 ; i<num.length ; i++) {
			System.out.print(num[i]+" ");
		}
		System.out.println("\n홀수/짝수 구분입력결과");
		for(int i=0 ; i<num.length ; i++) {
			System.out.print(ju[i]+" ");
		}
	}

}


