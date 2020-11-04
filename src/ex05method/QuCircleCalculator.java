package ex05method;
/*
문제5-2) 파일명 : QuCircleCalculator.java (난이도:중)
원의 반지름을 파라메타(매개변수)로 전달하면 원의넓이와 둘레를 계산하여 
반환하는 메소드를 각각 정의하자.
 이를 호출하는 main 메소드를 정의하라.
 */
public class QuCircleCalculator {
	//원의 넓이(반환값이 없는 형태)
	static void circleAr(double rad) {
		double result = 3.14*rad*rad;
		System.out.println("원의 넓이:"+result);
	}
	//원의둘레(반환값이 있는형태)
	static double circleR (double rad) {
		double result = 2*3.14*rad;
		return result;
	}
	public static void main(String[] args) {
		//원의 넓이를 구하는 함수는 반환값이 없어 함수내에서 즉시 결과출력됨
		circleAr(10.2);
		//원의 둘레를 구하는 함수는 반환값이 있으므로 값을 반환받아 출력함.
		System.out.println("원의 둘레:"+circleR(12.3));
		
		System.out.println("원의둘레(5.5):"+circleRound(5.5));
		System.out.println("원의넓이(5.5):"+circleArea(5.5));
		
	}
	static double circleRound(double b) {
		double round = 2*3.14*b;
		return round;
	}
	static double circleArea(double a) {
		double area = 3.14*a*a;
		return area;
	}

}
