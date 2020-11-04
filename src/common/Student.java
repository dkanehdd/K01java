package common;

public class Student extends Person {
	public String stNumber;

	public Student(String name, int age, String stNumber) {
		super(name, age);
		this.stNumber = stNumber;
	}
	@Override
	public String getInfo() {
		return super.getInfo()+", 학번:"+stNumber;
	}
	@Override
	public void showInfo() {
		System.out.println("학생의 정보");
		System.out.println(getInfo());
	}
	@Override
	public String toString() {
		return String.format("이름 : %s, 나이 : %d, 학번 : %s", name, age,stNumber);
	}	
}
