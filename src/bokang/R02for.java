package bokang;

public class R02for {

	public static void main(String[] args) {
		
		/*
		while문
		: 반복의 횟수가 명확하지 않을때 주로 사용하는 반복문
		형식]
			반복을 위한 변수;
			while(while문의 실핼될 조건){
				실행문;
				while문 탈출을 위한 증감식;(++ 혹은 --)
			}
		*/
		//시나리오] 1~10까지의 합을 구하는 while문을 작성하시오.
		int i=1,sum=0;
		while (i<=10) {
			sum+=i;
			i++;
		}
		System.out.println(sum);
		
		
		/*
		do~while문
			: while문과는 다르게 한번은 실행을 한 후
			탈출을 위한 조건을 체크한다.
		형식]
			초기값;
			do{
				실행문; <- 해당 실행문은 무조건 1번은 실행된다.
				증감식;
			}
			while(조건식);
		 */
		//시나리오] 위에서 만든 프로그램을 do~while문으로 변경하시오.
		int b =1, total=0;
		do {
			total+=b;
			b++;
		}
		while(b<=10);
		System.out.println(total);
		
		/*
		for문
			: 반복의 횟수가 정해져서 명확할때 주로 사용하는 반복문
		형식]
			for(반복을 위한 초기값 ; 반복을 위한 조건식 ; 증감식){
				실행문;
			}
		 */
		//1~10까지의 합을 구하는 for문을 작성하시오.
		int sum1 = 0;
		for(int c=1 ; c<=10 ; c++) {
			sum1+=c;
		}
		System.out.println(sum1);
		/*
		연습문제] 두개의 주사위를 던졌을때 눈의 합이 6이되는 경우를
		모두 출력하는 프로그램을 for문과 if문을 이용하여 작성하시오.
		실행결과]
			1+5=6
			2+4=6
			.......
			5+1=6
		 */
		for(int n=1 ; n<=6 ; n++) {//주사위1
			for(int m=1 ; m<=6 ; m++) {//주사위2
				if((n+m)==6) {
					System.out.printf("%d+%d=%d\n",n,m, n+m);
				}
			}
		}
		
		/*
		연습문제] 위문제를 do~while문으로 변경하시오.
		 */
		int t=1;
		do {
			int r=1;
			do{
				if((t+r)==6) {
					System.out.printf("%d+%d=%d\n",t,r, t+r);
				}
				r++;
			}while(r<=6);
			t++;
		}while(t<=6);
		/*
		연습문제] 방정식 2x+4y=12를 만족하는 모든 x,y값을 구하시오.
		단, x,y의 범위는 0~10사이의 정수이고 while문을 통해
		구현하시오.
		실행결과]
			x=0, y=3
			x=2, y=2
			.......
		 */	
		int x=0;
		while(x<=10) {//x가 0~10 사이
			int y=0;
			while(y<=10) {//y가 0~10사이
				if((2*x)+(4*y)==12) {//방정식에 만족할때
				//아래 문장 출력
				System.out.printf("x=%d, y=%d\n",x,y);	
				}
				y++;
			}
			x++;
		}
		/*
		문제) 1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+...+10)의
		결과를 계산하는 프로그램을 작성하시오.
		 */
		//풀이1
		int totalSum1 = 0;
		int totalSum2 = 0;
		for(int q=1; q<=10 ; q++) {
			totalSum1 +=q;
			totalSum2+=totalSum1;
		}
		System.out.println(totalSum2);
		System.out.println("===================");
		//풀이2
		int sum3 = 0;
		for(int i1 = 1 ; i1<=10 ; i1++) {
			System.out.print("(");
			for(int i3=1 ; i3<=i1 ; i3++) {
				System.out.print(i3+"+");
				sum3+=i3;
			}
			System.out.print(")+");
		}
		System.out.println("="+sum3);

	}
}
