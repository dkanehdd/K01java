package ex02variable;

public class Qu_02_02 {

	public static void main(String[] args) {
		
		int k=99;
		int e=80;
		int m=96;
		System.out.println("평균점수(실수형)="+(double)(k+e+m)/3);
		System.out.println("평균점수(정수형)="+((k+e+m)/3));
		
		
		
		//double avg1=(k+e+m)/3; 정수*정수=>정수의결과  
		double avg2=(k+e+m)/3.0;//정수*실수 =>실수의결과
		System.out.println("평균점수:"+avg2);
		
	}

}
