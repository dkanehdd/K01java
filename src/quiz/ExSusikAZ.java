package quiz;

public class ExSusikAZ {

	public static void main(String[] args) {
		for(int i=0 ; i<=9 ; i++) {
			for(int j=0 ; j<=9 ; j++) {
				if((10*i+j)+(10*j+i)==99&&i!=j) {
					System.out.printf("%d%d + %d%d = 99\n",i,j,j,i);
				}
			}
		}
	}
}
