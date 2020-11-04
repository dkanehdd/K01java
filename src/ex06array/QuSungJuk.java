package ex06array;

import java.util.Scanner;

/*
문제3) 파일명 : QuSungJuk.java
다음 조건에 맞는 프로그램을 작성하시오.
1] 학생수를 사용자로부터 입력받는다.
	-Scanner클래스 사용
2] 입력받은 학생수만큼 국영수 점수를 저장할 수 있는 int형 배열을 선언한다.
3] 다시 학생수만큼 각 학생의 국영수 점수를 입력받아 2]에서 생성한 배열에 저장한다.
	-Scanner클래스 사용
4] 각 학생의 국영수 점수 및 총점 그리고 평균을 출력하여라. 
5] 이 문제는 2차원 배열을 활용하는 문제이다.
 */
public class QuSungJuk {

	//과목수를 저장하기 위한 상수선언
	public static final int SUBJECTS=3;
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("학생수를 입력하세요:");
		int hak = scan.nextInt(); 
		System.out.println("학생수:"+hak);
		//int형 배열을 선언하고 메모리를 할당해라
		//행의수 : 학생수, //열의 수: 과목의 수 
		int [][] jumsu = new int[hak][SUBJECTS];
		String[] titles = {"국어", "영어", "수학"};
		for(int i=0 ; i<jumsu.length ; i++) {
			System.out.printf("%d번째 학생의 점수입력%n",i+1);
			for(int j=0 ; j<SUBJECTS ; j++) {
				System.out.print(titles[i]+"점수입력?");
				jumsu[i][j] = scan.nextInt();
			}
		}
	
		System.out.println("NO KOR ENG MAT TOT AVG");
		System.out.println("======================");
		//점수 배열의 세로크기만큼 반복(학생수)
		for(int i=0 ; i<jumsu.length ; i++) {
			int total=0;
			//학생번호 출력
			System.out.print((i+1)+" ");
			//과목수 만큼 반복
			for(int j=0 ; j<SUBJECTS ; j++) {
				//각 과목의 합을 구해서 total에 누적함. 즉 총점을 구함
				System.out.printf("%-4d",jumsu[i][j]);
				total+=jumsu[i][j];
			}
			//총점과 평균을 출력함.
			double avg = total/3.0;
			System.out.printf("%-4d %.2f%n", total, avg);
		}
	}
}
