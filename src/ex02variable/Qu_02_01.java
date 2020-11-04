package ex02variable;

public class Qu_02_01 {

	public static void main(String[] args) {
		
		int k = 89;
		int e = 99;
		int m = 78;
		System.out.println("국어:"+k+", 영어:"+e+", 수학:"+m);
		System.out.println("총점:"+(k+e+m));
		
		
		int kor=89, eng=99, math=78;
		int total;
		
		total = kor+eng+math;
		System.out.printf("국어:%d, 영어:%d, 수학:%d\n",kor,eng,math);
		System.out.println("총점:"+total);
	}

}

