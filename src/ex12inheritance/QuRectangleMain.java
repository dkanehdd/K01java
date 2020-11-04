package ex12inheritance;
/*
 문제3) QuRectangleMain.java
정사각형을 의미하는 Square클래스와 직사각형을 의미하는 Rectangle클래스를 정의하고자 한다.
그런데 정사각형은 직사각형의 일종이므로, 다음의 형태로 클래스의 상속관계를 구성하고자 한다. 
아래의 소스를 참조하여 구현하시오. 

 */
//직사각형을 표현한 클래스
class Rectangle
{
	int bottom, height;
	public Rectangle(int bottom, int height) {
		this.bottom = bottom;
		this.height = height;
	}
	public void ShowAreaInfo() {
		if(bottom==height) {
			System.out.println("정사각형 면적:"+(bottom*height));
		}else {
			System.out.println("직사각형 면적:"+(bottom*height));
		}
	}
} 
//정사각형을 표현한 클래스(정사각형은 직사각형의 일종)
class Square extends Rectangle
{
	/*
	생성자 : 정사각형은 가로, 세로의 길이가 동일하므로 인자값1개로
			부모의 멤버변수2개를 초기화 할수 있도록 구성한다.
	*/
	public Square(int side) {
		super(side, side);
	}
} 
class QuRectangleMain
{
	public static void main(String[] args)
	{
     	Rectangle rec = new Rectangle(4, 3);
     	rec.ShowAreaInfo();

     	Square sqr = new Square(7);
     	sqr.ShowAreaInfo();
 	}
}
