package ex10accessmodifier;


class Rectangle
{
	//멤버변수
   	private int ulx, uly;//좌상단(upper left x, upper left y)
   	private int lrx, lry;//우하단(lower right x, lower right y)

   	//좌표값이 정상인지 판단하기위한 멤버변수 추가
   	private boolean isTrue = true;
   	//디폴트(기본) 생성자는 개발자가 생성자를 정의하지 않았을때만 자동으로 생성된다.
   	//생성자
   	public Rectangle(int ulx, int uly, int lrx, int lry) {
   		if(isRange(ulx)==false || isRange(uly)==false) {
   			System.out.println("좌상단 좌표범위가 잘못되었습니다.");
   			isTrue = false;
   		}
   		if(isRange(lrx)==false || isRange(lry)==false) {
   			System.out.println("우하단 좌표 범위가 잘못되었습니다.");
   			isTrue = false;
   		}   		
   		if(ulx>=lrx || uly>=lry) {
   			System.out.println("좌측 우측 좌표지정이 잘못되었습니다.");
   			isTrue = false;
   		}
   		this.ulx = ulx;
   		this.uly = uly;
   		this.lrx = lrx;
   		this.lry = lry;
   	} 
   	//매개변수로 전달된 자표값이 정상범위안에 있는지를 판단
   	public boolean isRange(int point) {
   		if(point<0 || point>100) {
   			return false;
   		}
   		else {
   			return true;
   		}
   	}
   	public void showArea()
   	{
   		int area=(lrx-ulx)*(lry-uly);
   		if(isTrue) 
   			System.out.println("넓이:"+area);
   		else
   			System.out.println("좌표값 오류로 넓이를 계산할수 없습니다.");
   	}  	
}

class QuRectangle
{
   	public static void main(String[] args)
   	{
		/*여기부터
     		Rectangle rec = new Rectangle();
     		rec.ulx=22;
     		rec.uly=22;
     		rec.lrx=10;
     		rec.lry=10;
		여기까지는 정보은닉후 실행되지 않게 해야한다....
		*/
		//아래 생성자로만 객체생성후 초기화 되도록 처리한다...
		Rectangle rec1 = new Rectangle(1,1,10,10);
		rec1.showArea();
		
		Rectangle rec2 = new Rectangle(-2,-2,101,101);
		rec2.showArea();
		
		Rectangle rec3 = new Rectangle(10,10,1,1);
		rec3.showArea();
   	}
}

