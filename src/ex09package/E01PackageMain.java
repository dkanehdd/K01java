package ex09package;

import java.util.Date;

import ex09package.kosmo.util.CommonUtil;

public class E01PackageMain {

	public static void main(String[] args) {
		
		/*
		하나의 클래스안에서 패키지는 다르나 같은 이름의 클래스를 사용해야할때...
		방법1 : 클래스명 앞에 풀 패키지 경로를 기술한다.
		방법2 : 하나의 클래스는 import하고, 다른하나는 풀 경로를 사용한다.
		 */
		//자동완성을 통해 import선언
		Date utilDate = new Date();
		System.out.println("utilDate="+utilDate);
		
		java.sql.Date sqlDate = 
				new java.sql.Date(utilDate.getTime());
		System.out.println("sqlDate="+sqlDate);
		
		/////////////////////////////////////////
		/*
		ex09package하위에 ex09package.kosmo.util 패키지가 생성되지만
		이 두개는 서로 다른 패키지로 인식한다.
		따라서 isNumber() 메소드를 호출하기 위해서는 해당 패키지를 import해야한다.
		 */
		String strValue = "987654321";
		
		/*
		static으로 선언되는 메소드는 new를 통한 객체생성없이
		클래스명만으로 즉시 호출이 가능하다.
		 */
		boolean isNum = CommonUtil.inNumber(strValue);
		if(isNum==true)
			System.out.println("문자열은 숫자입니다.");
		else
			System.out.println("숫자가 아닙니다.");
		
		System.out.println(
				ex09package.kosmo.util.CommonUtil.inNumber("백20"));
	}

}
