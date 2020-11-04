package ex04controlstatement;
/*
다음과 같은 모양을 출력하는 프로그램을 while문으로 작성하시오
	*
	* *
	* * *
	* * * *
	* * * * *
 */
public class Qu_04_06 {

	public static void main(String[] args) {

		int i = 1;
		while(i<=5) {
			int j =1;
			while(j<=5) {
				if(i>=j) {
					//j는 i의 갯수만큼 출력한다.
					System.out.print("* ");
				}
				j++;
			}
			i++;
			System.out.println();//한줄 출력후 줄바꿈
		}
		
		
		//내 답안
		int a=1;
		while (a<=5) {
			int b = 1;
			while (b<=5) {
				if (a>=b) {
					System.out.print("* ");
				}
				else {
					System.out.print(" ");
				}
				b++;
			}
			System.out.println();
			a++;
		}
	}

}
