package ex21jdbc.shopping;

import java.sql.Types;

import ex21jdbc.connect.IConnectImpl;

public class DeleteShop extends IConnectImpl{

	public DeleteShop() {
		super("kosmo","1234");
	}
	
	@Override
	public void execute() {
		try {
			csmt = con.prepareCall("{call ShopDeleteGoods(?,?)}");
			
			csmt.setString(1, scanValue("삭제할상품의 일련번호"));
			csmt.registerOutParameter(2, Types.NUMERIC);
			csmt.execute();
			
			System.out.println("삭제프로시저 실행결과:");
			System.out.println(csmt.getString(2)+"행 삭제");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			close();
		}
	}
	
	public static void main(String[] args) {

		new DeleteShop().execute();
	}

}
