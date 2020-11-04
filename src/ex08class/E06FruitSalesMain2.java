package ex08class;

//과일판매자를 추상화한클래스
class FruitSeller2{
	int numOfApple;//판매자의 사과보유갯수
	int myMoney; //판매수익
	int apple_price;//사과의 단가
	/*
	상수에서 변수로 변경함. 
	클래스의 멤버상수로 정의하는 경우 선언과 동시에 초기화해야하므로
	상수는 초기값이 없는 형태로는 선언이 불가함.
	 */
	
	/*
	apple_price를 상수에서 변수로 변경한 이유는 상수는 단한번만
	초기화되는 특성때문에 일반적인 멤버메소드내에서는 초기화할수없다.
	멤버메소드는 개발자가 원할때 언제든지 호출할수 있으므로, 상수의 특성과는
	맞지 않기 때문이다.
	 */
	public void initMembers(int money, int appleNum, int price) {
		myMoney = money;
		numOfApple = appleNum;
		apple_price = price;
	}
	//판매자가 사과를 판매하는 행위를 표현한 멤버메소드
	public int saleApple(int money) {
		int num = money/apple_price;
		numOfApple-=num;
		myMoney+=money;
		return num;
	}
	//판매자의 현재상태를 출력하는 멤버메소드
	public void showSaleResult() {
		System.out.println("[판매자]남은사과갯수:"+numOfApple);
		System.out.println("[판매자]판매수익"+myMoney);
	}
}

//구매자를 표현한 클래스
class FruitBuyer2{
	int myMoney;//보유 금액
	int numOfApple;//구매한 사과의 갯수
	
	public void initMembers(int _myMoney, int _numOfApple) {
		myMoney = _myMoney;
		numOfApple = _numOfApple;
	}
	//구매자가 판매자에게 사과를 구매하는 행위를 표현한 멤버메소드
	public void buyApple(FruitSeller2 seller, int money) {
		numOfApple += seller.saleApple(money);
		myMoney-=money;
	}
	//구매자의 현재상태 출력
	public void showBuyResult() {
		System.out.println("[구매자]현재잔액:"+myMoney);
		System.out.println("[구매자]사과갯수:"+numOfApple);
	}
	
}
public class E06FruitSalesMain2 {

	public static void main(String[] args) {

		/*
		초기화메소드를 정의하였으므로, 각각 성격이 다른 객체들을
		생성할수있다.
		 */
		//판매자1 : 보유갯수 100개, 단가 1000원
		FruitSeller2 seller1 = new FruitSeller2();
		seller1.initMembers(0, 100, 1000);
		
		//판매자2 : 보유갯수 80개, 단가 500원
		FruitSeller2 seller2 = new FruitSeller2();
		seller2.initMembers(0, 80, 500);
		
		FruitBuyer2 buyer = new FruitBuyer2();//구매자객체
		buyer.initMembers(10000, 0);
		
		System.out.println("구매행위가 일어나기전의 상태");
		seller1.showSaleResult();
		seller2.showSaleResult();
		buyer.showBuyResult();
		
		//판매자1, 판매자2에게 각각 5000원을 지불하고 구매
		buyer.buyApple(seller1, 5000);
		buyer.buyApple(seller2, 5000);
		
		System.out.println("구매행위가 일어난 후의 상태");
		seller1.showSaleResult();
		seller2.showSaleResult();
		buyer.showBuyResult();
	}

}