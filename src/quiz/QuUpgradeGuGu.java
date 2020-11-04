package quiz;

public class QuUpgradeGuGu {

	public static void main(String[] args) {
		String hu ="";
		for(int a=2;a<=9;a++) {
			int s = a*a;
			for(int b=1; b<=9;b++) {
				if(b==1) {
					System.out.printf("%dX1=%d%n",a,a);
					hu = a+"X"+a;
				}else {
					System.out.printf("%s=%d",hu,s);
					s*=a;
					hu += "X"+a;
					System.out.println();
				}
			}
		}
	}
}
