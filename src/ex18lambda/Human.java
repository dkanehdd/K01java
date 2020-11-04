package ex18lambda;

public class Human{
	String name;
	String gander;
	int score;
	public Human(String name, String gander, int score) {
		this.name = name;
		this.gander = gander;
		this.score = score;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGander() {
		return gander;
	}
	public void setGander(String gander) {
		this.gander = gander;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
}
