package bokang.sub;

/*
체크카드 클래스 Ver.02

버전02에서 추가부분
	1. 멤버변수 초기화 메소드 정의 
		메소드명 : initMembers()
	2. 기본생성자, 인자생성자 정의
	3. 멤버변수 정보은닉
	4. getter/setter 메소드 추가
 */
public class CheckCard2 {
	
	private long cardNumber;
	private String owner;
	private int balance;
	private int point;
	//충전(입금)
	
	public void initMembers(long cardNumber, String owner, int balance, int point) {
		this.cardNumber = cardNumber;
		this.owner = owner;
		this.balance = balance;
		this.point = point;
	}
	//생성자메소드와 멤버메소드의 차이점은 반환값유무
	public CheckCard2() {}
	
	public CheckCard2(long cardNumber, String owner, int balance, int point) {
		this.cardNumber = cardNumber;
		this.owner = owner;
		this.balance = balance;
		this.point = point;
	}
	
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
		System.out.println("=====================");
		System.out.println("카드번호:"+cardNumber);
		System.out.println("소유자:"+owner);
		System.out.println("잔고:"+balance);
		System.out.println("포인트:"+point);
	}
	
	public long getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(long cardNumber) {
		this.cardNumber = cardNumber;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	
}
