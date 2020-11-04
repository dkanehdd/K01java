package quiz1;
/*
 문제3) 파일명 : ExSusikAZ.java
다음 수식을 만족하는 모든 A와 Z를 구하는 프로그램을 작성하시오.
  AZ
 +ZA
--------
  99
단 , A와Z는 서로다른 숫자이다.ㄴ
 */
public class SusikAZ {

	public static void main(String[] args) {
		
		for(int A=0 ; A<=9 ; A++) {
			for(int Z=0 ; Z<=9 ; Z++) {
				/*A와 Z는 서로다른 정수이므로 같은값이 나올때는 아래
				코드를 실행하지 않고 반복문의 처음으로 돌아간다.*/
				if(A==Z) {
					continue;
				}
				//AZ 와 ZA 를 코드로 표현하면 아래와 같다.
				int result = (A*10+Z)+(Z*10+A);
				if(result==99) {
					System.out.printf("%d%d + %d%d = %d\n",A,Z,Z,A, result);
				}
			}
		}
	}

}
