package ex10accessmodifier.cal;
/*
캡슐화(Encapsulation)
	: 여러가지 비즈니스 로직을 하나로 묶는다는 의미와
	업무의 순서까지 고려한 형태의 로직을 구성한다는 의미를 가지고있다.
	즉, 관련있는 메소드를 하나의 클래스로 묶는것을 말한다.
 */
public class Calculator {
	
	private Adder adder;
	private Subtractor subtractor;
	
	public Calculator() {
		adder = new Adder();
		subtractor = new Subtractor();
	}
	
	public int addTwoNumber(int n1, int n2) {
		return adder.addTwoNumber(n1, n2);
	}
	public int subTwoNumber(int n1, int n2) {
		return subtractor.subTwoNumber(n1, n2);
	}
	public void showOpratingTimes() {
		System.out.println("덧셈횟수:"+adder.getCntAdd());
		System.out.println("뺄셈횟수:"+subtractor.getCntSub());
	}
	

}

class Adder{
	private int cntAdd;
	
	Adder(){
		cntAdd=0;
	}
	public int getCntAdd() {
		return cntAdd;
	}
	int addTwoNumber(int n1, int n2) {
		cntAdd++;
		return n1+n2;
	}
}
class Subtractor{
	private int cntSub;
	
	public Subtractor() {
		cntSub=0;
	}
	public int getCntSub() {
		return cntSub;
	}
	int subTwoNumber(int n1, int n2) {
		cntSub++;
		return n1-n2;
	}
}
