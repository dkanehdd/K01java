package ex21jdbc.callable;

import java.sql.SQLException;
import java.sql.Types;

import ex21jdbc.connect.IConnectImpl;

public class IsMemberProcCall extends IConnectImpl{

	public IsMemberProcCall() {
		super("kosmo", "1234");
	}
	
	@Override
	public void execute() {
		try {
			csmt = con.prepareCall("{ call kosmoMemberAuth(?,?,?)}");
			
			csmt.setString(1, scanValue("회원 아이디"));
			csmt.setString(2, scanValue("패스워드"));
			csmt.registerOutParameter(3, Types.NUMERIC);
			csmt.execute();
			
			int outParamResult = csmt.getInt(3);
			switch(outParamResult) {
			case 0:
				System.out.println("가입된아이디가 없습니다. 회원가입을 해주세요");
				break;
			case 1:
				System.out.println("패스워드가 일치하지않습니다. 비번찾기하세요");
				break;
			case 2:
				System.out.println("회원님 방가방가^^*");
			}
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			close();
		}
	}
	
	public static void main(String[] args) {

		IsMemberProcCall mapc = new IsMemberProcCall();
		mapc.execute();
	}

}
