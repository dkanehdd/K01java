package quiz;

import java.util.Scanner;
/*
 문제5) 파일명 : QuBuyObject.java
현재 소유하고 있는 금액을 입력받아서 아래 물건을 잔돈을 남기지않고 최소 1개이상 구매하려면 어떻게 구매해야 하는지 프로그램을 통해 구현하시오.
 */

public class QuBuyObject {

	static final int BREAD = 500;
	static final int SNACK = 700;
	static final int DRINK = 400;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("구매할 금액을 입력하세요(1600원 이상):");
		int money = sc.nextInt();
		buyObject(money);
	}
	public static void buyObject(int money) {
		boolean is = false;
		for(int j=1 ; j<money/BREAD ; j++) {
			for(int i=1 ; i<money/SNACK ; i++) {
				for(int k=1 ; k<money/DRINK ; k++) {
					if(BREAD*i+SNACK*j+DRINK*k==money) {
						System.out.printf("빵%d개, 과자%d개, 음료%d개\n", j,i,k);
						is = true;
					}
				}
			}
		}
		if(is==true) {
			System.out.println("위 방법중 하나를 선택하세욤^^*");
		}else {
			System.out.println("구매불가");
		}
	}
}

