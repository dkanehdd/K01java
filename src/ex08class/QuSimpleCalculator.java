package ex08class;
/*
문제1) 파일명 : QuSimpleCalculator.java (난이도:하)
기본 4칙연산을 할때마다 연산의 결과와 몇번 수행되었는지를 출력하는 계산기 클래스를 정의해보자.
아래 main함수에 부합하는 CalculatorEx 클래스를 정의하면되고 해당 수치는 임의로 바꿔도 된다.
init() 멤버메소드에서는 계산의 결과를 카운트하는 멤버변수를 0으로 초기화 한다.
 */

public class QuSimpleCalculator {

	public static void main(String[] args) {
		CalculatorEx cal = new CalculatorEx();
		cal.init();
		System.out.println("1 + 2 = " + cal.add(1 , 2));
		System.out.println("10.5 - 5.5 = " + cal.min(10.5 , 5.5));
		System.out.println("4.0 * 5.0 = " + cal.mul(4.0 , 5.0));
		System.out.println("100 / 25 = " + cal.div(100 , 25));
		System.out.println("10.0 * 3.0 = " + cal.mul(10.0 , 3.0));
		cal.showOpCount();
	}
}
class CalculatorEx{
	//멤버변수 : 각 연산의 횟수를 카운트하기위한 용도
	int addCount, minCount, mulCount, divCount;
	
	//초기화를 위한 멤버메소드
	public void init() {
		addCount=0;
		minCount=0;
		mulCount=0;
		divCount=0;
	}
	//연산횟수를 출력하는 멤버메소드
	public void showOpCount() {
		System.out.println("덧셈횟수:"+addCount);
		System.out.println("뺄셈횟수:"+minCount);
		System.out.println("곱셈횟수:"+mulCount);
		System.out.println("나눗셈횟수:"+divCount);
	}
	//int형을 double형으로 받을수있다.
	public double add(double a, double b) {
		//덧셈연산을 수행하면 +1증가
		addCount++;
		return a+b;
	}
	public double min(double a, double b) {
		minCount++;
		return a-b;
	}
	public double mul(double a, double b) {
		mulCount++;
		return a*b;
	}
	public double div(double a, double b) {
		divCount++;
		return a/b;
	}
}