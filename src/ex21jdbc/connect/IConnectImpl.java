package ex21jdbc.connect;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class IConnectImpl implements IConnect {
	
	//동적쿼리 처리를 위한 객체
	public PreparedStatement psmt; 
	public Connection con;
	public ResultSet rs;
	//오라클의 함수/프로시져를 실행하기 위한 객체
	public CallableStatement csmt;
	public Statement stmt;
	
	public IConnectImpl() {
		System.out.println("IConnectImpl 기본생성자 호출");
	}
	public IConnectImpl(String user, String pass) {
//		System.out.println("IConnectImpl 인자생성자 호출");
		try {
			Class.forName(ORACLE_DRIVER);
			//DB연결
			connect(user, pass);
		}
		catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패");
			e.printStackTrace();
		}
	}
	//인자3개짜리 생성자 
	public IConnectImpl(String driver, String user, String pass) {
		System.out.println("IConnectImpl 인자생성자 호출");
		try {
			Class.forName(driver);
			connect(user, pass);
		}
		catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패");
			e.printStackTrace();
		}
	}
	
	//오라클 DB에 연결
	@Override
	public void connect(String user, String pass) {
		
		try {
			con = DriverManager.getConnection(ORACLE_URL, user, pass);
		}
		catch (SQLException e) {
			System.out.println("데이터베이스 연결 오류");
			e.printStackTrace();
		}
	}
	
	/*
	오버라이딩의 목적으로 정의한 메소드. 쿼리실행은 각각의 클래스에
	진행하게 될것임.
	 */
	@Override
	public void execute() {
		//하는일 없음
	}
	//자원해제
	@Override
	public void close() {
		try {
			if(con!=null) con.close();
			if(psmt!=null) psmt.close();
			if(rs!=null) rs.close();
			System.out.println("자원 반납 완료");
		}
		catch (Exception e) {
			System.out.println("자원 반납시 오류발생");
			e.printStackTrace();
		}
	}
	@Override
	public String scanValue(String title) {
		Scanner scan = new Scanner(System.in);
		System.out.print(title + "을(를) 입력(exit->종료):");
		String inputStr = scan.nextLine();
		/*
		equalsIgnoreCase()
			: equal() 메소드와 동일하게 문자열이 같은지 비교하는 메소드로
			다른점은 대소문자를 구분하지 않는다.
		 */
		if("EXIT".equalsIgnoreCase(inputStr)) {
			System.out.println("프로그램을 종료합니다.");
			close();//자원해제
			System.exit(0);//프로그램 자체가 즉시 종료
		}
		return inputStr;//입력받은 문자열을 반환
	}
	
	
	
	
}
