package ex04controlstatement;
/*
구구단을 이중for문을 이용해 다음과같이 출력하시오.
 */
public class Qu_04_09 {

	public static void main(String[] args) {

		//su가 고정된 상태에서 dan이 증가하는 형태
		for(int x=1 ; x<=9 ; x++) {
			for(int y=2 ; y<=9 ; y++) {
				int re = x*y;
				System.out.printf("%2d*%2d=%2d ", y,x,re);
			}
			System.out.println();
		}
	}

}
