package ex04controlstatement;

public class Qu_04_05 {

	public static void main(String[] args) {
		
		int num1=50, num2=100;
		if(num1>num2) {
			int big = num1;
			System.out.println(big);
			int diff = num1-num2;
			System.out.println(diff);
		}else {
			int big = num2;
			System.out.println(big);
			int diff = num2-num1;
			System.out.println(diff);
		}
		
	}

}
