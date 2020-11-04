package bokang.sub;
/*
체크카드 클래스 Ver.01

시나리오] 체크카드를 클래스로 표현해보자.
	멤버변수 : 카드번호, 소유자, 잔액, 포인트
	멤버메소드 : 충전(입금), 결제, 적립, 현재상태출력
	적립율 : 사용금액의 0.1%	
*/
public class CheckCard1 {
	
	public long cardNumber;
	public String owner;
	public int balance;
	public int point;
	//충전(입금)
	public void charge(int amount) {
		//잔고에 충전할 금액을 더한다.
		this.balance += amount;
	}
	//결제
	public void payment(int amount) {
		this.balance -= amount;
	}
	//적립
	public void savingPoint(int amount) {
		this.balance += (amount*0.1);
	}
	//현재상태출력(멤버변수)
	public void showState() {
		System.out.println("카드번호:"+cardNumber);
		System.out.println("소유자:"+owner);
		System.out.println("잔고:"+balance);
		System.out.println("포인트:"+point);
	}
}
