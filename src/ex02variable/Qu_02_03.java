package ex02variable;

public class Qu_02_03 {

	public static void main(String[] args) {
		int i = 10;
		int area_int = (int)(i*i*3.14);
		float area_float = i*i*3.14f;
		double area_double = i*i*3.14;
		
		
		System.out.println("int형의 넓이:"+area_int);
		System.out.println("float형 넓이:"+area_float);
		System.out.println("double형의 넓이:"+area_double);
		
		
		int rad = 10;
		final double PI=3.14;
		
		int area_in; 
		float area_floa; 
		double area_doubl;
		/*
		큰 자료형을 작은 자료형에 대입할때는 자료의 손실이 있을수있으므로
		반드시 강제형변환(명시적형변환)을 통해 형변환후 대입해야 한다.
		 */
		area_in = (int)(rad*rad*PI);
		area_floa = (float)(rad*rad*PI);
		area_doubl = rad*rad*PI;
		
		System.out.println("int형:"+area_in);
		System.out.println("float형:"+area_floa);
		System.out.println("double형:"+area_doubl);
		
		
		
	}
	

}
