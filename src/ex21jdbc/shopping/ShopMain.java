package ex21jdbc.shopping;

import java.util.Scanner;

public class ShopMain {

	public static void menuSelect() {
		System.out.println("====메뉴를 선택하세요====");
		System.out.println("1. 상품입력");
		System.out.println("2. 상품검색");
		System.out.println("3. 상품삭제");
		System.out.println("4. 전체상품출력");
		System.out.println("5. 상품수정");
		System.out.println("6. 종료");
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		while(true) {
			menuSelect();
			System.out.print("선택:");
			int choice = s.nextInt();
			s.nextLine();
			if(choice==6) {
				System.out.println("프로그램 종료!");
				break;
			}
			switch(choice) {
			case 1:
				new InsertShop().execute();break;
			case 2:
				new SelectShop().execute();break;
			case 3:
				new DeleteShop().execute();break;
			case 4:
				new SelectAllShop().execute();break;
			case 5:
				new UpdateShop().execute();break;
			}
		}
	}

}
