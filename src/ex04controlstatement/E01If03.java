package ex04controlstatement;

/*
if문
	형식3]
		if(조건1){
			실행문1;
		}
		else if(조건2){
			실행문2;
		}
		else{
			위 모든 조건에 만족하지 않을때 실행할문장;
		}
	※단, else문에는 조건식이 들어갈수 없다.
 */
public class E01If03 {

	public static void main(String[] args) {

		/*
		시나리오] 국, 영, 수 점수의 평균값을 소수점2자리까지 구하여 학점을 출력하는
		프로그램을 작성하시오. 90점 이상은 A학점...60점 미만은 F학점으로
		판단하여 출력하시오.
		 */
		int kor=90, eng=85, math=95;
		double avg = (kor+eng+math)/3.0;
		System.out.println("평균점수는(그대로):"+avg);
		System.out.printf("평균점수는(소수2자리):%.2f\n", avg);
		
		if(avg>=90) {
			System.out.println("A학점");
		}
		else if(avg>=80) {
			System.out.println("B학점");
		}
		else if(avg>=70) {
			System.out.println("C학점");
		}
		else if(avg>=60) {
			System.out.println("D학점");
		}
		else{
			System.out.println("F학점. 학사경고 ㅜㅠ;");
		}
		
		/*
		if~else 구문을 구성할때는 조건의 구간을 어떻게 설정하느냐에 따라
		전혀 다른 결과가 나올수 있으므로 주의해야 한다.
		아래문장은 높은 점수라 할지라도 60 이상의 조건에 만족하므로 무조건
		D학점이 출력된다.
		 */
		System.out.println("잘못된 조건식의 if~else문");
		if(avg>=60) {
			System.out.println("D학점");
		}
		else if(avg>=70) {
			System.out.println("C학점");
		}
		else if(avg>=80) {
			System.out.println("B학점");
		}
		else if(avg>=90) {
			System.out.println("A학점");
		}
		else{
			System.out.println("F학점. 학사경고 ㅜㅠ;");
		}
		
		/*
		if(avg<60) {
			System.out.println("F학점. 학사경고 ㅜㅠ;");
		}
		else if(avg<70) {
			System.out.println("D학점");
		}
		else if(avg<80) {
			System.out.println("C학점");
		}
		else if(avg<90) {
			System.out.println("B학점");
		}
		else{
			System.out.println("A학점");
		}*/
	}

}
